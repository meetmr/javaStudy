package com.wanghengbing.morphic;

public abstract class Animal {
    public String name;

    public String color;

    public int age;

    public abstract void sleep();
    public abstract void eat();
    public abstract void call();

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }
}
