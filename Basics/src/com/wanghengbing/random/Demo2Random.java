package com.wanghengbing.random;

import java.util.Random;
import java.util.Scanner;

public class Demo2Random {
    public static void main(String[] args) {
        int n ,i=0;
        System.out.println("欢迎进入参数小游戏 系统将会随机生成1-100的数字，请猜猜是什么吧！");
        System.out.println("请输入一个数:");
        n = new Scanner(System.in).nextInt();
        int random_num = new Random().nextInt(100) +1;
        while (true){
            n = new Scanner(System.in).nextInt();
            if (n > random_num){
                System.out.println("很抱歉输入大了,请重新输入：");
                i++;
            }else if(n < random_num){
                System.out.println("很抱歉输入小了,请重新输入：");
                i++;
            }else {
                System.out.println("恭喜猜对了");
                System.out.println("你输入的是: "+ n +" 系统生成的是："+random_num);
                i++;
                break;
            }
        }
        System.out.println("程序结束 总共输入了"+i+"次才答对");


    }
}
