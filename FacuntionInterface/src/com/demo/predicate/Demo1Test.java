package com.demo.predicate;

import java.util.function.Predicate;

public class Demo1Test {
    public static Boolean checkString(String str , Predicate<String > predicate1,Predicate<String> predicate2){
        return predicate1.and(predicate2).test(str);
    }

    public static void main(String[] args) {
        /**
         * 一个字符串同时包含两个条件
         * 大于五个字符
         * 包含a
         * */
        String str = "erthrhrta";
        Boolean a = checkString(str, (String string) -> {
                    return string.length() > 5;
                },
                (String string) -> {
                    return string.toLowerCase().contains("a");
                }
        );
        System.out.println(a);
    }
}
