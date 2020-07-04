package com.datasource.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCDruid {
    // 获取连接池对象
    // 获取连接对象
    // 释放资源
    private static DataSource dataSource = null;
    static {
        try {
            Properties pro = new Properties();
            InputStream resourceAsStream = JDBCDruid.class.getClassLoader().getResourceAsStream("druid.properties");
            pro.load(resourceAsStream);
            JDBCDruid.dataSource = DruidDataSourceFactory.createDataSource(pro);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
    *  获取连接池对象
    *
    * */
    public static DataSource getDataSource(){
        return JDBCDruid.dataSource;
    }

    /*
     *  获取连接对象
     * */
    public static Connection getDataSourceConnection(){
        Connection connection = null;
        try {
            connection = JDBCDruid.dataSource.getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return connection;
    }

    public static void close(ResultSet resultSet, Statement statement,Connection connection){
        if (resultSet != null){
            try {
                resultSet.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if (statement != null){
            try {
                statement.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if (connection != null){
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    public static void close(Statement statement,Connection connection){
        if (statement != null){
            try {
                statement.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if (connection != null){
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

}
