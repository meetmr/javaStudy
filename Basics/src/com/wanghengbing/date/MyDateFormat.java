package com.wanghengbing.date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class MyDateFormat {
    public static void main(String[] args) throws ParseException {
        // 格式化日期
        SimpleDateFormat simpleDate = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒"); // 创建 SimpleDateFormat对象
        String format = simpleDate.format(new Date());
        System.out.println(format);

        System.out.println("===================");
        System.out.println(new SimpleDateFormat("yyyy:MM:dd HH:mm:ss").format(new Date()));

        System.out.println("===================");

        // 解析日期
        String format1 = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss").format(new Date());
        System.out.println(new SimpleDateFormat("yyyy:MM:dd HH:mm:ss").parse(format1));

    }
}
