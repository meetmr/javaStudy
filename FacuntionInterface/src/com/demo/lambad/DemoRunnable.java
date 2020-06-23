package com.demo.lambad;

public class DemoRunnable {
    public static void run(Runnable runnable){
        new Thread(runnable).start();
    }

    public static void main(String[] args) {

        // 使用匿名内部类
        run(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "启动");
            }
        });

        // lambad表达式
        run(() -> {
            System.out.println(Thread.currentThread().getName() + "启动");
        });

        // lambad表达式 优化版
        run(()-> System.out.println(Thread.currentThread().getName() + "启动"));
    }
}
