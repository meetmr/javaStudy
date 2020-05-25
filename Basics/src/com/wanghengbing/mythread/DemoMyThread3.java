package com.wanghengbing.mythread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DemoMyThread3 implements Runnable{
    // 100 张票
    public int ticket = 100;
    public Object obg = new Object();
    Lock l = new ReentrantLock(); // 创建锁对象
    @Override
    public void run(){
        while (true){
            l.lock(); // 获取锁
            try {
                Thread.sleep(200);
                if (this.ticket >= 1){
                    System.out.println(Thread.currentThread().getName() + " 线程正在卖第："+this.ticket +"张票");
                    this.ticket--;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                l.unlock(); // 释放锁
            }

        }
    }


}
