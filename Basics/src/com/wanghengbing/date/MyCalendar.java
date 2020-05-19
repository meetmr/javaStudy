package com.wanghengbing.date;

import java.util.Calendar;

public class MyCalendar {
    public static void main(String[] args) {
        Calendar instance = Calendar.getInstance(); // 获取当前系统的日历
        System.out.println(instance);

        System.out.println("================");
        System.out.println(instance.get(Calendar.YEAR) + "年" + (instance.get(Calendar.MONTH)+1) +"月" + instance.get(Calendar.DATE));
    }

}
