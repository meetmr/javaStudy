package com.stream;

import java.util.stream.Stream;

public class DemoStreamConcat {
    public static void main(String[] args) {
        demo1();
    }

    private static void demo1() {
        Stream<String> stream1 = Stream.of("张三", "李四");
        String[] str = {"喜羊羊","美羊羊"};
        Stream<String> stream2 = Stream.of(str);
        Stream.concat(stream1,stream2).forEach((name)-> System.out.println(name)); // 合并
    }
}
