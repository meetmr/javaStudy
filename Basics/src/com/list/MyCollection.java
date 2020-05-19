package com.list;

import java.util.ArrayList;
import java.util.Collection;

/*
*
* Collection是所有单列集合的父接口，因此在Collection中定义了单列集合(List和Set)通用的一些方法，这些方法可用于操作所有的单列集合。方法如下：
 * `public boolean add(E e)`：  把给定的对象添加到当前集合中 。
 * `public void clear()` :清空集合中所有的元素。
 * `public boolean remove(E e)`: 把给定的对象在当前集合中删除。
 * `public boolean contains(E e)`: 判断当前集合中是否包含给定的对象。
 * `public boolean isEmpty()`: 判断当前集合是否为空。
 * `public int size()`: 返回集合中元素的个数。
 * `public Object[] toArray()`: 把集合中的元素，存储到数组中。
 *
* */
public class MyCollection {
    public static void main(String[] args) {
        // 创建集合对象，使用多态 String
        Collection<String> collection = new ArrayList<>();
        collection.add("王恒兵"); // 向集合中添加数据
        collection.add("张三"); // 向集合中添加数据

        System.out.println("清空之前的集合 "+collection);
        collection.clear(); // 清空集合
        System.out.println("清空之后的集合 "+collection);

        collection.add("里斯"); // 再向集合中添加数据
        collection.add("比u比u"); // 再集合中添加数据

        System.out.println("没删除之前的集合 "+collection);
        collection.remove("里斯");  // 把给定的对象在当前集合中删除
        collection.remove("里斯1");  // 删除一个不存在的元素  会返回false
        System.out.println("删除之后的集合 "+collection);

        System.out.println("清空之前的集合"+collection.isEmpty()); // 判断集合是否为空
        collection.clear();
        System.out.println("清空之后的集合 "+ collection.isEmpty());
        // Integer
        Collection<Integer> collection1 = new ArrayList<>();
        collection1.add(20); // 向集合中添加数据
        collection1.add(280);
        collection1.add(250);
        collection1.add(5);
        System.out.println(collection1);
        System.out.println("集合个数为 "+collection1.size());

        // 集合转换成数组
        Object[] array = collection1.toArray();
        System.out.println("转换成数组 打印的是地址"+ array);  // [Ljava.lang.Object;@1c53fd30
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] +" ");

        }

    }
}
