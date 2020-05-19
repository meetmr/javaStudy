package com.wanghengbing.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MyHashMap {
    public static void main(String[] args) {
        HashMap<String ,String> map = new HashMap<>(); //跟php的关联数组一月
        map.put("php","王恒兵");
        map.put("java","王恒兵1");
        map.put("c","王恒兵3");
        System.out.println(map);
        System.out.println(map.get("java"));

        for (String s :map.keySet()){
            System.out.println(map.get(s));
        }

        // 遍历集合
        Set<Map.Entry<String, String>> entries = map.entrySet();  // 获取Entry 内部类
        Iterator<Map.Entry<String, String>> iterator = entries.iterator(); // 获取迭代器
        while (iterator.hasNext()){ // 迭代
            Map.Entry<String, String> next = iterator.next(); // 获取元素
            String key = next.getKey(); // 获取key
            String value = next.getValue(); // 获取value
            System.out.println(key + value);
        }
    }
}
