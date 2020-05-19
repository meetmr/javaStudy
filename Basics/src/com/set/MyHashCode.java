package com.set;

import java.util.HashSet;
import java.util.Set;

public class MyHashCode {
    public static void main(String[] args) {
        System.out.println("2332".hashCode());
        System.out.println("23322".hashCode());
        System.out.println("种地".hashCode());

        // 定义一个集合
        Set<Person> set = new HashSet<>();
        Person p1 = new Person("西施",5);
        Person p2 = new Person("西施",5);
        Person p3 = new Person("西施",50);
        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(set);  // 没有重新 equals hashCode 会相同
    }
}
