package com.wanghengbing.string;
/*
* String 当中与转换相关的常用方法
* public char[] toCharArray()  返回将当前字符串拆分成字符的数组
* public byte[] getBytes() 获得当前字符串底层的字节数组
* public String replace(CharSequence oldString, CharSequence new String) 字符串替换
*
* */

public class Demo04String {
    public static void main(String[] args) {
        char[] chars = "Hello".toCharArray();
        System.out.println(chars);

        byte[] bytes = "wang".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        System.out.println("王恒吧".replace("吧","兵")); // 字符串替换

        System.out.println("============================");

        String st1 = "ww,bb,cvc";
        String[] strArray = st1.split(",");
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }
    }
}
