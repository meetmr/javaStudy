package com.hengbing.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Arrays;

public class JdbcDemo1 {
    public static void main(String[] args) throws Exception {
//        demo1(); // 创建链接
        demo2();
    }

    private static void demo2() throws Exception {
        // 导入驱动
        Class.forName("com.mysql.jdbc.Driver");
//        创建连接
        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/db3", "root", "root");
        // 定义sql
        String sql = "select * from user";
        // 创建sql执行对象
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);


    }


    public static void demo1() throws Exception {
        // 1 导入驱动包

        // 2 注册驱动
        Class.forName("com.mysql.jdbc.Driver");

        // 3 获取数据库链接对象
        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/db3", "root", "root");

        // 4 定义sql
//        String sql = "update user set password = '123456' where id = 1";
//
//        // 5 获取sql执行对象
//        Statement statement = connection.createStatement();
//
//
//        // 6 执行sql
//        int i = statement.executeUpdate(sql);


        // 定义sql
        String sql = "insert into user(`name`,`password`,`info`) value('李四','323434','我是李四')";

        // 获取执行对象
        Statement statement = connection.createStatement();
        int resultSet = statement.executeUpdate(sql);
        System.out.println(resultSet);

        connection.close();
        statement.close();

    }
}
