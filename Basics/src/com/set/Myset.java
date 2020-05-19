package com.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Myset {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(); //定义一个集合
        // 添加元素
        set.add(5);
        set.add(34);
        set.add(54);
//        set.add(5); // 不允许重复的元素。
        System.out.println(set);

        Iterator<Integer> iterator = set.iterator();// 只能使用迭代
        while (iterator.hasNext()){
            System.out.print(" "+iterator.next());
        }

        //foreach
        for (Integer i:set){
            System.out.print(" "+i);
        }
        System.out.println("+===================");
        // 删除一个元素
        set.remove(5);
        System.out.println(set);
        // 删除全部元素
        set.clear();
        System.out.println(set);
        // 判断是否为空
        System.out.println(set.isEmpty());

    }
}
