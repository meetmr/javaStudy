package com.wanghengbing.baozhuanglei;

public class Demo {
    public static void main(String[] args) {
        // 手动装箱
        Integer int1 = new Integer(40); // 普通用法
        Integer int2 = new Integer('4');
        System.out.println(int1);
        System.out.println(int2);

        Integer int3 = Integer.valueOf(20); // 静态方法
        Integer int4 = Integer.valueOf("5"); // 这里必须是对于基本类型数据的字符串

        // 手动拆箱
        Integer int5 = Integer.valueOf(40); // 定义一个包装类
        System.out.println(int5);
        int int6 = int5.intValue();
        System.out.println(int6);

        // 自动装箱
        Integer int7 = 5;  // 相当于 Integer int7 = Integer.valueOf(5);
        // 自动拆箱
        int7 = int7 + 0; // 相当于 int7.intValue()+0;
        System.out.println(int7);

    }
}
