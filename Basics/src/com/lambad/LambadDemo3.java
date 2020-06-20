package com.lambad;

public class LambadDemo3 {
    public static void main(String[] args) {
        incokeCalc(10,30,(int a,int b)->{
            return a+b;
        });

        incokeCalc(10,30,(int a,int b)->{
            return a+b;
        });

        incokeCalc(10,30,(a,b)->a+b);
    }

    public static void incokeCalc(int a,int b,Calculator calculator){
        int c = calculator.calc(a,b);
        System.out.println("结果是:"+c);
    }
}
