package com.jdbc.template;

import com.jdbc.utils.JDBCDruid;
import org.springframework.jdbc.core.JdbcTemplate;

public class TemolateDemo1 {
    public static void main(String[] args) {
        JdbcTemplate template = new JdbcTemplate(JDBCDruid.getDataSource());
        String sql = "update user set salay = 100 where id = ?";
        int update = template.update(sql, 6);
        System.out.println(update);
    }
}
