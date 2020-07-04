package com.datasource.druid;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class DruidDemo1 {
    public static void main(String[] args) throws Exception {
        // 1、 导入jar
        // 2、 加载配置文件
        Properties pro = new Properties();
        InputStream resourceAsStream = DruidDemo1.class.getClassLoader().getResourceAsStream("druid.properties");
        pro.load(resourceAsStream);
        // 3、 获取连接池
        DataSource dataSource = DruidDataSourceFactory.createDataSource(pro);
        // 4、获取连接对象
        Connection connection = dataSource.getConnection();
        // 5、获取执行对象
        Statement statement = connection.createStatement();
        // 6、定义sql
        String sql = "select * from user";
        // 7、执行sql
        ResultSet resultSet = statement.executeQuery(sql);
        // 8、遍历结果
        while (resultSet.next()){
            System.out.println(resultSet.getInt("id"));
        }
        // 9、释放资源
        resultSet.close();
        statement.close();
        connection.close();

    }
}
