package com.hengbing.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcRes {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        List<User> userList = new ArrayList<>();
        try {
            Class.forName("com.mysql.jdbc.Driver"); // 导入驱动
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/db3", "root", "root"); // 创建驱动
            statement = connection.createStatement(); // 获取执行对象
            String sql = "select * from user";
            resultSet = statement.executeQuery(sql); // 获取结果集

            while (resultSet.next()){
                userList.add(new User(resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("password"),
                        resultSet.getString("info"),
                        resultSet.getDouble("salay")
                        ));

            }
//            userList.stream().filter((user)->user.getName().startsWith("李")).forEach(System.out::println); // 筛选姓名为李的对象

              userList.forEach((user)->{
                  System.out.println(user.getName());
              });

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
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

    }

}
