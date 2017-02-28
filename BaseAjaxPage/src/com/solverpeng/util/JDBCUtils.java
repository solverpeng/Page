package com.solverpeng.util;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.DbUtils;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * <pre>
 *      author: solverpeng
 *      blog  : http://solverpeng.com
 *      time  : 2017/2/26
 *      desc  : BasePage
 * </pre>
 */
public class JDBCUtils {
    private static DataSource dataSource = new ComboPooledDataSource("c3p0");

    public static Connection getConnection()  {
        Connection connection = null;
        try {
            connection = dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static void releaseResource(Connection connection, Statement statement, ResultSet resultSet) {
        try {
            DbUtils.close(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            DbUtils.close(statement);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            DbUtils.close(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
