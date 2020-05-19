package com.wanghengbing.myInterfaceAbs;

public interface MyInterfaceAbs {

    // 周长
    public abstract float perimeter();

    // 面积
    public abstract float measure ();

    public abstract String info();

    // 默认方法 可以有方法体
    public default void demo(){
        System.out.println("默认方法");
    }
}
