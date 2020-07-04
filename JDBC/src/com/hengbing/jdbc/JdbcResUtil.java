package com.hengbing.jdbc;

import com.hengbing.util.JDBCUtils;
import jdk.nashorn.internal.scripts.JD;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcResUtil {
    public static void main(String[] args) {
//        demo();
          demo1();
    }

    private static void demo1() {
        Connection connection;
        Statement statement;
        connection = JDBCUtils.getConnection();
        try {
             statement = connection.createStatement();
             String sql = "INSERT INTO `db3`.`user` (`name`, `password`, `info`, `salay`) VALUES ( '小明', '44343', '我是小明', '782')";
            int res = statement.executeUpdate(sql);
            System.out.println(res);
            JDBCUtils.close(statement,connection);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    private static void demo() {
        Connection connection;
        Statement statement;
        ResultSet resultSet;
        connection = JDBCUtils.getConnection(); // 获取连接对象
        try {
            statement = connection.createStatement();
            String sql = "select * from user";
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                System.out.println("ID: "+ resultSet.getInt("id") + " 姓名："+resultSet.getString("name")
                        + " 密码："+resultSet.getString("password")   + " 简介："+resultSet.getString("info"));
            }
            JDBCUtils.close(resultSet,statement,connection);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}
