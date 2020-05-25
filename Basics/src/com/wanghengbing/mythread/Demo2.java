package com.wanghengbing.mythread;

public class Demo2 {
    public static void main(String[] args) throws InterruptedException {
        new Thread(new MyRunnable()).start();
        for (int i = 0; i <200 ; i++) {
            Thread.sleep(20);
            System.out.println("main :" + i);
        }
    }
}
