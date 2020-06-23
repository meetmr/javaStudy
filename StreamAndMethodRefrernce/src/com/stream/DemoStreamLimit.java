package com.stream;

import java.util.stream.Stream;

public class DemoStreamLimit {
    public static void main(String[] args) {
        demo1();
    }

    private static void demo1() {
        // 转换
        long count = Stream.of("1", "2", "3").map((String s) -> {
            return Integer.parseInt(s);
        }).limit(3).count();
        System.out.println(count);
    }
}
