package com.lambad;

public class LambadDemo {
    public static void main(String[] args) {
        // lambad 表达式
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "新线程");
        }).start();
    }
}
