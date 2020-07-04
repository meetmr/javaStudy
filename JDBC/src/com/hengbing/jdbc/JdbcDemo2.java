package com.hengbing.jdbc;

import java.sql.*;

public class JdbcDemo2 {
    public static void main(String[] args) throws Exception {
//        demo1(); // 获取结果集
        demo2();
    }

    private static void demo2() {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/db3", "root", "root");
            statement = connection.createStatement();
            String sql = "select * from user";
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                System.out.println("ID: "+ resultSet.getInt("id") + " 姓名："+resultSet.getString("name")
                        + " 密码："+resultSet.getString("password")   + " 简介："+resultSet.getString("info"));
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            if(resultSet != null){
                try {
                    resultSet.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if(statement != null){
                try {
                    statement.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if(connection != null){
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }


    public static void demo1()  {


        Connection connection = null;
        Statement statement = null;
        try {
            // 1 导入驱动包
            Class.forName("com.mysql.jdbc.Driver");
            // 2 注册驱动
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/db3", "root", "root");

            // 定义sql
            String sql = "select * from user";

            //3 获取执行对象
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()){ // 遍历结果
                System.out.println("ID: "+ resultSet.getInt(1) + " 姓名："+resultSet.getString(2)
                        + " 密码："+resultSet.getString(3)   + " 简介："+resultSet.getString(4));
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            if (statement != null){
                try {
                    statement.close();
                }catch (SQLException e){
                    e.printStackTrace();
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
}
