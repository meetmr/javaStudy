package com.wanghengbing.date;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        String birthday = sc.next();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");

        Date birbirthday = sdf.parse(birthday); // 转成时间类型
        long birthdaytime = birbirthday.getTime(); // 转成毫秒
        System.out.println((System.currentTimeMillis() - birthdaytime) / 1000/3600/24);
    }
}
