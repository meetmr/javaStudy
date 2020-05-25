package com.wanghengbing.mythread;

import static java.lang.Thread.sleep;

// 创建多线程类，需要继承Thread类并重新run方法
public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <20; i++) {
            try {
                sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("run :" + i);
        }
    }
}
