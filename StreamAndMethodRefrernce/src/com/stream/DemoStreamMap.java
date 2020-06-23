package com.stream;

import java.util.stream.Stream;

public class DemoStreamMap {
    public static void main(String[] args) {
        demo1();
    }

    private static void demo1() {
        // 转换
        Stream.of("1","2","3").map((String s)->{
            return Integer.parseInt(s);
        }).forEach((i)-> System.out.println(i));
    }
}
