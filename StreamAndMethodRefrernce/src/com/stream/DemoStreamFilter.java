package com.stream;

import java.util.stream.Stream;

public class DemoStreamFilter {
    public static void main(String[] args) {
        demo1();
    }

    /**
     * filter 参数过滤
     */
    private static void demo1() {
        Stream.of("张三", "李四", "王五","李明")
                .filter((name)-> name.startsWith("李"))
                .forEach((name)-> System.out.println(name));
    }
}
