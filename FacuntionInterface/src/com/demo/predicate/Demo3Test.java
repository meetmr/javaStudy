package com.demo.predicate;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Demo3Test {
    public static List<String> screen(String[] arr, Predicate<String> predicate,Predicate<String> predicate2){
        ArrayList<String> listStr = new ArrayList<>();
        for (String str :arr){
            boolean test = predicate.and(predicate2).test(str);
            if (test){
                listStr.add(str);
            }
        }
        return  listStr;
    }

    public static void main(String[] args) {
        String[] arr = {"迪丽热巴,女","马尔哈子,男"};
        List<String> lst = screen(arr, (String a) -> {
            return a.split(",")[0].length() == 4;
        }, (String a) -> {
            return a.split(",")[1].equals("女");
        });
        for (String s : lst) {
            System.out.println(s);
        }
    }
}
