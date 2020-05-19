package com.wanghengbing.objectarray;

import java.util.ArrayList;

/*
    如果希望向集合ArrayL ist当中存储基本类型数据，必须使用基本类型对应的“包装类”。
    自动装箱：基本类型 -》 包装类型
    自动拆箱：包装类型 -》 基本类型

    byte        Byte
    short       Short
    int         Integer
    long        Long
    float       Float
    double      Double
    char        Character
    boolean     Boolean


*/
public class DemoArrayBasic {
    public static void main(String[] args) {
        ArrayList<Integer> in = new ArrayList<>();
        in.add(200);
        in.add(4);
        System.out.println(in.get(0));
    }
}
