package com.lambad;

import java.util.Arrays;
import java.util.Comparator;

public class LamvadDemo2 {
    public static void main(String[] args) {
        Person[] arr = {
                new Person("柳岩",38),
                new Person("杨幂",18),
                new Person("胡歌",32),
                new Person("民勤",10),
        };

        // 排序
        Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge(); // 升序是 前面一个减去后面一个。如果是降序则相反
            }
        });

        for (Person person : arr) {
            System.out.println(person);
        }

        Person[] arr_person = {
                new Person("柳岩1",38),
                new Person("杨幂2",18),
                new Person("胡歌3",32),
                new Person("民勤4",10),
        };

        // 使用Lambad 实现
        System.out.println("====================");
        Arrays.sort(arr,(Person o1, Person o2)->{
            return o1.getAge() - o2.getAge(); // 升序是 前面一个减去后面一个。如果是降序则相反
        });

        for (Person person : arr) {
            System.out.println(person);
        }
    }
}
