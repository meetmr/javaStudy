package com.wanghengbing.inside;

public class Amin {
    public static void main(String[] args) {
        People p1 = new People(); // 使用外部类访问外部类的方法 外部方法简介调用内部类的方法
        p1.beat();
        System.out.println("===================");
        // 直接创建内部类
        People.Heart h1 = new People().new Heart();
        h1.beat();
        System.out.println("===================");
        // 使用局部内部类
        p1.demo();

        System.out.println("===================");
        // 匿名内部类
        Myintrrface myintrrface = new Myintrrface(){
            @Override
            public void Info() {
                System.out.println("匿名内部类");
            }
        };
        myintrrface.Info();

        System.out.println("===================");

        new Myintrrface(){
            @Override
            public void Info() {
                System.out.println("匿名内部类2");
            }

            public void Run(){
                this.Info();
            }
        }.Run();

        System.out.println("===================");

        new Myintrrface(){
            @Override
            public void Info() {
                System.out.println("匿名内部类2");
            }

            public Myintrrface Run(){
                System.out.println("Run");
                return this;
            }
        }.Run().Info();

    }
}
