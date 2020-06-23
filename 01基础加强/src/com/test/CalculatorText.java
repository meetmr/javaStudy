package com.test;

import com.junit.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class CalculatorText {
    @Before // 执行之前
    public void init(){
        System.out.println("开始执行");
    }
    @After // 执行之后
    public void close(){
        System.out.println("执行结束");
    }
    @Test
    public void textAdd(){
        Calculator c = new Calculator();
        int res = c.add(1,5);
        Assert.assertEquals(6,res); // 断言操作 判断结果是否正确
    }

    @Test
    public void textSub(){
        System.out.println( new Calculator().sub(54,45));
    }
}
