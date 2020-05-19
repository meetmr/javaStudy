package com.list;

// 定义泛型类
public class MyGenericClass <E> {
    private E name;

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
}
