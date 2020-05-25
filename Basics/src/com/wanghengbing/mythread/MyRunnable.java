package com.wanghengbing.mythread;

public class MyRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <2000; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("run :" + i);
        }
    }
}
