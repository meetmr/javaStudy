package com.stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class DemoStremaTest {
    public static void main(String[] args) {
//       demo1();
        demo2();
    }

    private static void demo2() {
        ArrayList<String> noe = new ArrayList<>();
        noe.add("迪丽热巴");
        noe.add("荣远桥");
        noe.add("苏星河");
        noe.add("石破天");
        noe.add("石中玉");
        noe.add("老子");
        noe.add("庄子");
        noe.add("洪七公");

        ArrayList<String> tow = new ArrayList<>();
        tow.add("古力娜扎");
        tow.add("张无忌");
        tow.add("赵丽颖");
        tow.add("张三丰");
        tow.add("尼古拉斯凯奇");
        tow.add("张天华");
        tow.add("张二狗");
        ArrayList<Person> people = new ArrayList<>();
        Stream.concat(noe.stream().filter((name) -> name.length() == 3).limit(3),
                tow.stream().filter((name) -> name.startsWith("张")).skip(2)).forEach((name)->people.add(new Person(name)));

        people.forEach((name)->{
            System.out.println(name);
        });

    }

    private static void demo1() {
        ArrayList<String> noe = new ArrayList<>();
        noe.add("迪丽热巴");
        noe.add("荣远桥");
        noe.add("苏星河");
        noe.add("石破天");
        noe.add("石中玉");
        noe.add("老子");
        noe.add("庄子");
        noe.add("洪七公");

        Stream<String> noe1 = noe.stream().filter((name) -> name.length() == 3).limit(3);

        ArrayList<String> tow = new ArrayList<>();
        tow.add("古力娜扎");
        tow.add("张无忌");
        tow.add("赵丽颖");
        tow.add("张三丰");
        tow.add("尼古拉斯凯奇");
        tow.add("张天华");
        tow.add("张二狗");
        Stream<String> tow2 = tow.stream().filter((name) -> name.startsWith("张")).skip(2);

        ArrayList<Person> people = new ArrayList<>();
        Stream.concat(noe1, tow2).forEach((name)->{
            people.add(new Person(name));
        });
        people.forEach((name)->{
            System.out.println(name);
        });
    }
}
