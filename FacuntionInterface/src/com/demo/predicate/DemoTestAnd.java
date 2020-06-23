package com.demo.predicate;

import java.util.function.Predicate;

// 判断类接口
public class DemoTestAnd {
    public static Boolean checkString(String s, Predicate<String> pre){
        return pre.test(s);
    }


    public static void main(String[] args) {
        String s = "qwe";

        // 判断是非常是否大于6个字符
        Boolean aBoolean = checkString(s, (String str) -> {
            return str.length() > 6;
        });

//        checkString(s,(str)-> str.length() > 6); // 简化版
        System.out.println(aBoolean);
    }
}
