package com.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
*
* * **迭代**：即Collection集合元素的通用获取方式。在取元素之前先要判断集合中有没有元素，如果有，就把这个元素取出来，继续在判断，如果还有就再取出出来。一直把集合中的所有元素全部取出。这种取出方式专业术语称为迭代。
Iterator接口的常用方法如下：
* `public E next()`:返回迭代的下一个元素。
* `public boolean hasNext()`:如果仍有元素可以迭代，则返回 true。
Collection
*   iterator()  获取迭代器
* */
public class MyIterator {
    public static void main(String[] args) {

        Collection<String> collection = new ArrayList<>(); // 定义一个集合
        collection.add("王恒兵");  // 添加一个集合
        collection.add("王恒兵1");  // 添加一个集合
        collection.add("王恒兵23");  // 添加一个集合
        collection.add("王恒兵3");  // 添加一个集合
        Iterator<String> iterator = collection.iterator(); // 获取迭代器
        while (iterator.hasNext()){  // 判断是否有元素可以迭代
            System.out.println(iterator.next()); // 返回迭代的下一个元素。

        }
        for(String s1 :collection){
            System.out.println(s1);
        }


        Collection<Integer> collection1 = new ArrayList<>();
        for (int i = 0; i <20 ; i++) {
            if(i % 2 == 0){
                collection1.add(i);
            }
        }

        System.out.println(collection1);

        // 获取迭代器
        Iterator<Integer> iterator1 = collection1.iterator();
        // while 遍历迭代
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }

        // for 遍历迭代
        for (Iterator<Integer> it2 = collection1.iterator();it2.hasNext();){
            System.out.print(" "+it2.next());
        }

        // foreach 遍历迭代
        for (Integer i: collection1) {
            System.out.print("\n"+i +" ");
        }

    }
}
