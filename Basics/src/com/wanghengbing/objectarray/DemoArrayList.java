package com.wanghengbing.objectarray;

import java.util.ArrayList;
import java.util.Scanner;

/*
数组的长度不可以发生改变。
但是Arraylist集合的长度是可以随意变化的。
对于ArrayList来说，有一一个尖括号<E>代表泛型。
泛型:也就是装在集合当中的所有元素，全都是统一-的什么类型。
注意:泛型只能是引用类型，不能是基本类型.
*/

public class DemoArrayList {
    public static void main(String[] args) {
        // 创建一个String list集合
        ArrayList<String> list = new ArrayList<String>();
        System.out.println(list); // 打印出来是 []
        list.add("王恒兵");
        list.add("王恒兵");
        System.out.println(list); // 打印出来是 [王恒兵, 王恒兵]

        // 创建一个 People list集合
        ArrayList<People> pe = new ArrayList<People>();
        System.out.println(list); // 打印出来是 []
        pe.add(new People("王恒兵",200));  // 向集合中添加People
        pe.add(new People("小谢",200));   // 向集合中添加People
        System.out.println(pe); // 打印出来是 [com.wanghengbing.objectarray.People@75412c2f, com.wanghengbing.objectarray.People@282ba1e] 对象的地址

        // 读取元素
        System.out.println(pe.get(1).getName()); // 打印出来是  通过get获取集合中的数据

        // 删除元素
        pe.remove(0);
        System.out.println(pe);

        // 获取集合的个数
        System.out.println(pe.size());

    }
}
