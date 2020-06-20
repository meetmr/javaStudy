package com.lambad;

public class lambadDemo1 {
    public static void main(String[] args) {
        // 使用匿名类实现
        invokeCook(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("吃饭了哦~~");
            }
        });

        // 使用 lambad 表达式实现
        invokeCook(()->{
            System.out.println("吃饭了哦~~");
        });
    }

    public static void invokeCook(Cook cook){
        cook.makeFood();
    }
}
