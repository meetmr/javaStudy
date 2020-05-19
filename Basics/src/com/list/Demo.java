package com.list;

public class Demo {
    public static void main(String[] args) {
        MyGenericClass<String> mylist = new MyGenericClass<>(); // String
        mylist.setName("name");
        System.out.println(mylist.getName());

        MyGenericClass<Integer> mylist1 = new MyGenericClass<>();
        mylist1.setName(1520);
        System.out.println(mylist1.getName());

        info("a");

    }

    // 含有泛型的方法
    public static  <M> void info(M m){
        System.out.println(m);
    }
}
