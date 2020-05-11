package com.wanghengbing.random;
import java.util.Random;

public class DemoRandom {
    public static void main(String[] args) {
        Random r1 = new Random();
        System.out.println(r1.nextInt());
        for (int i = 0;i<100;i++){
            System.out.println(r1.nextInt(6)+1);
        }
    }
}
