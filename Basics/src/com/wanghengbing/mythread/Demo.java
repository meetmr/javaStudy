package com.wanghengbing.mythread;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        MyThread myth = new MyThread();
        myth.start();
        for (int i = 0; i <200 ; i++) {
            Thread.sleep(20);
            System.out.println("main :" + i);
        }
    }
}
