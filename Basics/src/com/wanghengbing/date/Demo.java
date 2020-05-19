package com.wanghengbing.date;
import java.util.Date;
/*
*
* import java.util.Date;
* 表示毫秒
*/
public class Demo {
    public static void main(String[] args) {
        // 获取当前系统的毫秒
        System.out.println(System.currentTimeMillis());  //1589625150218

        System.out.println("====================");
        // 毫秒转换日期
        Date da = new Date();
        // 通过Date 无参构造 获取系统时间 Sat May 16 18:36:54 CST 2020
        System.out.println(da);

        System.out.println("====================");
        // 通过Date 有参 把毫秒转换成日期
        long time = System.currentTimeMillis();
        System.out.println(new Date(time));

        System.out.println("====================");
        // 通过Date 获取毫秒 getTime()
        System.out.println(new Date().getTime());
    }
}
