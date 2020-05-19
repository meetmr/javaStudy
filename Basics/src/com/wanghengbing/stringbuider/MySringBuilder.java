package com.wanghengbing.stringbuider;

public class MySringBuilder {
    public static void main(String[] args) {
        // 空参数构造
        StringBuffer str = new StringBuffer();
        str.append("王恒兵"); // 添加字符串
        System.out.println("str:" + str);

        // 有参构造
        StringBuffer str1 = new StringBuffer("ABC");
        System.out.println("str1 "+str1);
    }
}
