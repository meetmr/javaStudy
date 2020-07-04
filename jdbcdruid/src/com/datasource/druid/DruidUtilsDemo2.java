package com.datasource.druid;

import com.datasource.utils.JDBCDruid;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DruidUtilsDemo2 {
    public static void main(String[] args) {
//        demo1(); // 获取连接池
        demo2(); // 直接获取连接对象
    }

    private static void demo2() {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = JDBCDruid.getDataSourceConnection(); // 直接获取连接对象
            statement = connection.createStatement(); // 获取执行对象
            String sql = "select * from user";     // 定义sql
            resultSet = statement.executeQuery(sql);  // 执行sql
            // 遍历结果
            while (resultSet.next()){
                System.out.println(resultSet.getInt("id"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            JDBCDruid.close(resultSet,statement,connection);
        }

    }

    private static void demo1() {
        DataSource dataSource = null;
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            dataSource = JDBCDruid.getDataSource(); // 通过工具类获取连接池
            connection = dataSource.getConnection(); // 获取连接对象
            statement = connection.createStatement(); // 获取执行对象
            String sql = "select * from user";     // 定义sql
            resultSet = statement.executeQuery(sql);  // 执行sql
            // 遍历结果
            while (resultSet.next()){
                System.out.println(resultSet.getInt("id"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            JDBCDruid.close(resultSet,statement,connection);
        }

    }
}
