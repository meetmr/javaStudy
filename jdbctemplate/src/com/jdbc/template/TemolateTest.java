package com.jdbc.template;

import com.jdbc.utils.JDBCDruid;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class TemolateTest {
    JdbcTemplate template = new JdbcTemplate(JDBCDruid.getDataSource());

    @Test
    public void testupdate(){ // 执行更新操作
        String sql = "update user set salay = 2200 where id = ?";
        int update = template.update(sql, 1);
        System.out.println(update);
    }

    @Test
    public void testadd(){ // 执行插入操作
        String sql = "insert into user(`name`,`password`,`info`,`salay`)value (?,?,?,?)";
        int add = template.update(sql, "王五","fdafafa","我是王五",50);
        System.out.println(add);
    }

    @Test
    public void testdelete(){ // 执行删除操作
        String sql = "delete from user where id = ?";
        int delete = template.update(sql, 8);
        System.out.println(delete);
    }

    @Test
    public void testMap(){ // 执行查询操作
        String sql = "select * from user where id = ?";
        Map<String, Object> stringObjectMap = template.queryForMap(sql, 1);  // queryForMap 只能是 1
        System.out.println(stringObjectMap);
    }

    @Test
    public void testList(){ // 执行查询操作
        String sql = "select * from user";
        List<Map<String, Object>> maps = template.queryForList(sql); // 把map封装成list集合
        maps.forEach(System.out::println);
    }

    @Test
    public void testMyObject(){ // 执行查询操作 封装成自定义对象
        String sql = "select * from user";
        List<User> userList = template.query(sql, new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet resultSet, int i) throws SQLException {
                return new User(resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("password"),
                        resultSet.getString("info"),
                        resultSet.getDouble("salay")
                );
            }
        });

        userList.forEach(System.out::println);
    }

    @Test
    public void testObject(){ // 执行查询操作 封装成自定义对象
        String sql = "select * from user";
        List<User> userList = template.query(sql, new BeanPropertyRowMapper<User>(User.class)); // 使用的时候，必须显示的定义默认构造函数

        userList.forEach(System.out::println);
    }

    @Test
    public void testCount(){ //  查询总记录数
        String sql = "select count(id) from user";
        Long aLong = template.queryForObject(sql, Long.class);
        System.out.println(aLong);
    }
}
