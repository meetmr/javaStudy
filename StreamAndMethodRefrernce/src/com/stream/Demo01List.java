package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Demo01List {
    public static void main(String[] args) {
        //demo(); // 普通方式
        demo1();
    }

    private static void demo1() {
        List<String > lst = new ArrayList<>();
        lst.add("张无忌");
        lst.add("周志明");
        lst.add("小敏");
        lst.add("张强");
        lst.add("张三丰");

        lst.stream()
                .filter(name -> name.startsWith("张")) // 张开始
                .filter(name -> name.length() == 3)  // 等于3个字符
                .forEach(name-> System.out.println(name)); // 输出
        
    }

    private static void demo() {
        List<String > lst = new ArrayList<>();
        lst.add("张无忌");
        lst.add("周志明");
        lst.add("小敏");
        lst.add("张强");
        lst.add("张三丰");

        List<String> lista = new ArrayList<>();
        for (String s : lst) {
            if (s.startsWith("张")){
                lista.add(s);
            }
        }

        List<String> listb = new ArrayList<>();
        for (String s : lista) {
            if (s.length() == 3){
                listb.add(s);
            }
        }

        for (String s:listb){
            System.out.println(s);
        }
    }
}
