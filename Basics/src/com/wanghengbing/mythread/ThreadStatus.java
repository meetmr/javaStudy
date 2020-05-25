package com.wanghengbing.mythread;

public class ThreadStatus {
    public static void main(String[] args) {
        Object obg = new Object(); // 定义锁对象

        new Thread(){ // 创建消费者
            @Override
            public void run(){
                synchronized (obg){
                    System.out.println("我想吃包子");
                    try {
                        obg.wait(); // 线程等待
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("吃包子");
                }

            }
        }.start();

        new Thread(){ // 生产者
            @Override
            public void run(){
                synchronized (obg){
                    System.out.println("做包子中");
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("包子做好了");
                    obg.notify(); // 唤醒线程
                }

            }
        }.start();
    }
}
