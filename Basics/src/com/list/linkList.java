package com.list;

import java.util.Iterator;
import java.util.LinkedList;

public class linkList {
    public static void main(String[] args) {
        LinkedList<String > list = new LinkedList<>();
        list.add("王恒吧");
        list.add("3223");
        list.add("王566恒吧");
        list.add("王恒5656吧");  // 添加

        for (int i = 0; i < list.size(); i++) {
            System.out.print(" "+list.get(i));
        }
        System.out.println("=================");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.print(" "+ iterator.next());
        }

        list.addFirst("aaa");  // 向头部添加一个元素   等同于add push
        System.out.println("\n"+list);

        list.addLast("xxx");
        System.out.println("\n"+list);
        list.pop(); // 移除头部元素
        System.out.println("\n"+list);
        list.removeLast(); // 移除尾部元素
        System.out.println("\n"+list);

    }
}
