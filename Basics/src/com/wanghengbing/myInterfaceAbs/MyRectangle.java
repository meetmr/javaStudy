package com.wanghengbing.myInterfaceAbs;

public class MyRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(12,30);
        System.out.println(r1.info());
        System.out.println(r1.perimeter());
        System.out.println(r1.measure());
        r1.demo();
    }
}
