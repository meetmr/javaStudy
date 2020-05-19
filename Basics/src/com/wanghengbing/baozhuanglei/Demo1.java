package com.wanghengbing.baozhuanglei;

public class Demo1 {
    public static void main(String[] args) {
        // 基本类型-> 字符串类型
        int int1 = 100;
        String str1 = int1+"";
        System.out.println(str1 + 100);

        int int2 = 200;
        String str2 = Integer.toString(int2);
        System.out.println(str2+500);

        String str3 = String.valueOf(200);
        System.out.println(str3+10);

        // 字符串->基本类型
        int i = Integer.parseInt("100");
        System.out.println(i+50);

    }
}
