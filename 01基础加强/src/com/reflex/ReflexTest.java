package com.reflex;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflexTest {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties(); //获取配置对象

        ClassLoader classLoader = ReflexTest.class.getClassLoader(); // 获取class目录下的配置文件
        InputStream is = classLoader.getResourceAsStream("pro.properties");
        properties.load(is);

        String className = properties.getProperty("className");  // 获取值
        String methodName = properties.getProperty("methodName");

        Class<?> aClass = Class.forName(className);
        Object o = aClass.newInstance();
        Method[] methods = aClass.getMethods();

        Method method = aClass.getMethod(methodName,String.class);
        method.invoke(o,"张三");

    }
}
