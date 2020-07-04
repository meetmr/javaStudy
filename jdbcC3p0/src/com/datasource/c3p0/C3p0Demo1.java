package com.datasource.c3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/*
*  c3p0  连接演示
*
* */
public class C3p0Demo1 {
    public static void main(String[] args) throws SQLException {
        DataSource ds = new ComboPooledDataSource(); // 创建连接池对象
        Connection connection = ds.getConnection(); // 获取连接对象
        System.out.println(connection);
    }
}
