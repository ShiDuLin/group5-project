package com.util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * <br>包名 util
 * <br>创建时间
 * <br>描述 数据库工具类
 *
 * @author Vigilr
 */
public class DbUtil {
    static String driverClass="oracle.jdbc.driver.OracleDriver";
    public static final String URL = "jdbc:oracle:thin:@localhost:1521:orcl";
    public static final String USERNAME = "abc";
    public static final String PASSWORD = "1234";

    /**
     * 获取数据库连接
     *
     * @return java.sql.Connection
     */
    public Connection getConnection() throws Exception {
        Class.forName(driverClass);
        Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        return conn;
    }

    /**
     * 关闭数据库连接
     *
     * @param connection 数据库连接
     * @return void
     */
    public void closeConnection(Connection connection) throws Exception {
        if (connection != null) {
            connection.close();
        }
    }
}
