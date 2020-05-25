package com.wanghengbing.mythread;

public class DemoMyThread2 implements Runnable{
    // 100 张票
    public int ticket = 100;
    public Object obg = new Object();
    @Override
    public void run(){
        while (true){
            this.Runticket();
        }
    }

    public synchronized void Runticket(){ // 设置同步方法
        if (this.ticket >= 1){
            System.out.println(Thread.currentThread().getName() + " 线程正在卖第："+this.ticket +"张票");
            this.ticket--;

        }
    }
}
