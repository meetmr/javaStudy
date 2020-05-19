package com.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyList {
    public static void main(String[] args) {
        List<String> lis = new ArrayList<>(); // 定义list集合
        lis.add("1");  // 添加元素
        lis.add("a");
        lis.add("e");
        lis.add("32");
        lis.add("134");
        System.out.println(lis);

        // 移除元素
        String remove = lis.remove(2);
        System.out.println(remove);
        System.out.println(lis);

        // 替换
        String a = lis.set(2, "A");
        System.out.println(a);
        System.out.println(lis);


        // 获取
        System.out.println(lis.get(1));

        // for 遍历
        for (int i = 0; i < lis.size(); i++) {
            System.out.print(" "+lis.get(i));
        }
        System.out.println("===================");
        // foreach遍历
        for (String s :lis){
            System.out.print(" _ " + s);
        }

        System.out.println("===================");
        // 迭代器
        Iterator lisit = lis.iterator();
        while (lisit.hasNext()){
            System.out.print("  " + lisit.next());
        }
    }
}
