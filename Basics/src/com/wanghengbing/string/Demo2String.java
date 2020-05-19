package com.wanghengbing.string;

/*
* 对于基本类型来说：是比较数值是否相同
* 对于引用类型来说：是比较地址
* public boolean equals(Object anObject) //字符串比较
* */
public class Demo2String {
    public static void main(String[] args) {
        // 字符串比较
        String s1 = "abc";
        String s2 = "abc";
        char[] charArray = new char[]{'a','b','c'};
        String s3 = new String(charArray);

        // 直接 == 比较
        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // false
        System.out.println(s2 == s3); // false

        System.out.println("===================");

        // 用 equals 比较
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // true
        System.out.println(s2.equals(s3)); // true
    }
}
