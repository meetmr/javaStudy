package com.wanghengbingscanner;

import java.util.Scanner;

public class DemoScanner {

    public static void main(String[] args){
        System.out.print("请输入一个数字:");
        Scanner sc = new Scanner(System.in); // 从键盘输入
        int num = sc.nextInt(); // 获取从键盘输入的int
        System.out.println("输入的数字:"+(int)num);

        System.out.print("请输入一个数字:");
        String str = sc.next(); // 获取从键盘输入的int
        System.out.println("输入的字符串:"+str);

        String str1 = new Scanner(System.in).next();
        System.out.println("输入的字符串:"+str1);
    }

}
