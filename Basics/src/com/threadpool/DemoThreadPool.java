package com.threadpool;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// 创建线程池
public class DemoThreadPool {
    public static void main(String[] args) {
        // 创建一个指定数量的线程池  是静态方法不用new
        ExecutorService ex = Executors.newFixedThreadPool(2);
        ex.submit(new RunableImpl()); // 传递线程任务，运行run()方法
        ex.submit(new RunableImpl()); // 程序会一直运行
        ex.submit(new RunableImpl());
    }
}
