package com.wanghengbing.string;

public class DemoString {
    public static void main(String[] args) {
        // 无参数创建
        String s1 = new String();
        System.out.println(s1);

        // 字符参数创建
        char[]  charsArray = new char[]{'a','b'};
        String s2 = new String(charsArray);
        System.out.println(s2);

        // 字节参数创建，字节是数组，数字会转成 abc
        byte[] bytesArray = {97,98,99};
        String s3 = new String(bytesArray);
        System.out.println(s3);

        // 直接创建
        String s4 = "玩航海家二号改变";
        System.out.println(s4);
    }
}
