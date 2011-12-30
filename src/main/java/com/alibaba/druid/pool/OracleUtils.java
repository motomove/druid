package com.alibaba.druid.pool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import oracle.jdbc.OracleConnection;
import oracle.jdbc.OracleStatement;

public class OracleUtils {

    public static void clearDefines(PoolablePreparedStatement stmt) throws SQLException {
        OracleStatement oracleStmt = stmt.unwrap(OracleStatement.class);
        oracleStmt.clearDefines();
    }

    public static int getRowPrefetch(PreparedStatement stmt) throws SQLException {
        OracleStatement oracleStmt = stmt.unwrap(OracleStatement.class);
        return oracleStmt.getRowPrefetch();
    }

    public static void setRowPrefetch(PreparedStatement stmt, int value) throws SQLException {
        OracleStatement oracleStmt = stmt.unwrap(OracleStatement.class);
        oracleStmt.setRowPrefetch(value);
    }

    public static void setDefaultRowPrefetch(Connection conn, int value) throws SQLException {
        OracleConnection oracleConn = conn.unwrap(OracleConnection.class);
        oracleConn.setDefaultRowPrefetch(value);
    }

    public static int getDefaultRowPrefetch(Connection conn, int value) throws SQLException {
        OracleConnection oracleConn = conn.unwrap(OracleConnection.class);
        return oracleConn.getDefaultRowPrefetch();
    }

    public static void cancel(Connection conn) throws SQLException {
        OracleConnection oracleConn = conn.unwrap(OracleConnection.class);
        oracleConn.cancel();
    }
    
    public static void pingDatabase(Connection conn) throws SQLException {
        OracleConnection oracleConn = conn.unwrap(OracleConnection.class);
        oracleConn.pingDatabase();
    }
}