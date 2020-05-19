package com.wanghengbing.morphic;

public class Cat  extends Animal{

    public Cat(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void sleep() {
        System.out.println("猫咪睡觉");
    }

    @Override
    public void eat() {
        System.out.println("猫咪吃饭");
    }

    @Override
    public void call() {
        System.out.println("喵喵喵喵");
    }

    public void talent(){
        System.out.println("抓老鼠");
    }
}
