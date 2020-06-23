package com.demo.lambad;

import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.Comparator;

public class DemoComparator {
    public static Comparator<String> getCloneable(){
//        return new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.length() - o1.length();
//            }
//        };

//        return (String o1, String o2 )->{
//            return o2.length() - o1.length();
//        };

        return ( o1,  o2 )->o2.length() - o1.length();
    }

    public static void main(String[] args) {
        String[] arr = {"aaa","bbbb","wqwq","wqreuytty"};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr,getCloneable());
        System.out.println(Arrays.toString(arr));

    }
}
