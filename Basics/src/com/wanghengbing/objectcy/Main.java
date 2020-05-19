package com.wanghengbing.objectcy;

public class Main {
    public static void main(String[] args) {
        Hero w1 = new Hero("天涯",new Weapon("2000"),20);
        System.out.println(w1.getName());
        w1.getWeapon().Bigmove();
        System.out.println(w1.getWeapon().getCode());
    }
}
