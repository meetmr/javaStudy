package com.annotation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class DemoTest1 {
    public static void main(String[] args) throws IOException {
        Calculator c = new Calculator();
        Class<? extends Calculator> aClass = c.getClass(); // 获取对象class对象
        Method[] methods = aClass.getMethods(); // 获取这个对象的所有方法
        int num = 0;
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("buf.txt"));
        for (Method method : methods) { // 循环遍历所有方法
            if (method.isAnnotationPresent(Check.class)){ // 判断此方法是否被 Check注解注解
                try {
                    method.invoke(c); // 执行
                } catch (Exception e) { // 如果出现异常了
                    num++;
                    bufferedWriter.write("出现异常了");
                    bufferedWriter.newLine();
                    bufferedWriter.write(e.getCause().getClass().getSimpleName()+"出现异常");
                    bufferedWriter.newLine();
                    bufferedWriter.write("异常原因:");
                    bufferedWriter.newLine();
                    bufferedWriter.write(e.getCause().getMessage());
                    bufferedWriter.newLine();
                    bufferedWriter.write("===================");
                    bufferedWriter.newLine();
                }
            }
        }
        bufferedWriter.write("本次异常数量:"+num);
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
