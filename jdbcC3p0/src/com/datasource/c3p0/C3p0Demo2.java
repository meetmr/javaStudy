package com.datasource.c3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
*  c3p0  连接演示
*
* */
public class C3p0Demo2 {
    public static void main(String[] args) throws SQLException {
      DataSource ds = new ComboPooledDataSource(); // 创建连接池对象
      Connection connection = ds.getConnection();  // 获取连接对象
      String sql = "select * from user";
      Statement statement = connection.createStatement(); // 获取执行对象
      ResultSet resultSet = statement.executeQuery(sql);
      while (resultSet.next()){
          System.out.println(resultSet.getInt("id"));
      }
      resultSet.close();
      statement.close();
      connection.close();
    }
}
