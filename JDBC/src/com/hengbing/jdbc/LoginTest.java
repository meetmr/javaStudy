package com.hengbing.jdbc;

import com.hengbing.util.JDBCUtils;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LoginTest {
    public static void main(String[] args) {
        Map<String, String> userInfo = getUserInfo();
        Login(userInfo); // 静态sql
//        LoginPre(userInfo); // 预编译sql
    }

    /**
     * 预编译sql
     * @param userInfo
     */
    private static void LoginPre(Map<String, String> userInfo) {
        Connection connection;
        connection= JDBCUtils.getConnection();
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        try {
            String sql = "select * from user where name = ? and password = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,userInfo.get("username"));
            preparedStatement.setString(2,userInfo.get("password"));
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
                System.out.println("登录成功");
                System.out.println(" 姓名："+resultSet.getString("name")
                        + " 密码："+resultSet.getString("password"));
            }else {
                System.out.println("登录失败");
            }
            JDBCUtils.close(resultSet,preparedStatement,connection);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }


    /**
     * 静态sql
     * 登录
     * @param userInfo
     */
    private static void Login(Map<String, String> userInfo) {
        if (userInfo == null){
            System.out.println("账号信息为空");
            return;
        }
        Connection connection;
        connection= JDBCUtils.getConnection();
        Statement statement;
        ResultSet resultSet;
        try {
            statement= connection.createStatement();
            String sql = "select * from user where name = '"+userInfo.get("username")+"' and password = '"+userInfo.get("password")+"'";
            System.out.println(sql);
            resultSet = statement.executeQuery(sql);
            if (resultSet.next()){
                System.out.println("登录成功");
                System.out.println(" 姓名："+resultSet.getString("name")
                        + " 密码："+resultSet.getString("password"));
            }else {
                System.out.println("登录失败");
            }
            JDBCUtils.close(resultSet,statement,connection);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    private static Map<String ,String> getUserInfo() {
        HashMap<String, String> user = new HashMap<String, String>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入账号：");
        String username = scanner.next();
        user.put("username",username);
        System.out.println("请输入密码：");
        String password = scanner.next();
        user.put("password",password);
        return  user;
    }


}
