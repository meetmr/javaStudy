package com.wanghengbing.morphic;

public class Dog extends Animal{

    public Dog(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void sleep() {
        System.out.println("小狗睡觉");
    }

    @Override
    public void eat() {
        System.out.println("小狗吃饭");
    }

    @Override
    public void call() {
        System.out.println("汪汪汪");
    }

    public void talent(){
        System.out.println("看门");
    }
}
