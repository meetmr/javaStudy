package com.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class DemoStreamforEach {
    public static void main(String[] args) {
//        demo1();
        demo2();
    }

    private static void demo2() {
        String[] strings = {"张三", "李四", "王五"};
        Stream.of(strings).forEach((name)-> System.out.println(name));
    }

    /**
     * forEach 是终结方法
     */
    private static void demo1() {
        // 获取Stream流
        Stream<String> stream = Stream.of("张三", "李四", "王五");
        stream.forEach((name)-> System.out.println(name));
    }
}
