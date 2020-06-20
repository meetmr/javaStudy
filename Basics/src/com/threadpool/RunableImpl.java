package com.threadpool;

public class RunableImpl implements Runnable{
    @Override
    public void run() {
        System.out.println("我是一个线程"+Thread.currentThread().getName());
    }
}
