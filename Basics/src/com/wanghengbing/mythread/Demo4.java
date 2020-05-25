package com.wanghengbing.mythread;

public class Demo4 {
    public static void main(String[] args) {
        DemoMyThread3 nyth = new DemoMyThread3();
        new Thread(nyth).start();
        new Thread(nyth).start();
        new Thread(nyth).start();
    }
}
