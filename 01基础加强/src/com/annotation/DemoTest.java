package com.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@MyAnno(ClassName = "com.annotation.Demo",methodName="print")
public class DemoTest {
    public static void main(String[] args) throws Exception {
        Class<DemoTest> demoTestClass = DemoTest.class; // 获取本来class对象
        MyAnno annotation = demoTestClass.getAnnotation(MyAnno.class); // 获取注解class对象
        String className = annotation.ClassName(); // 获取注解中的值
       String methodName = annotation.methodName();

        Class<?> aClass = Class.forName(className);
        Method method = aClass.getMethod(methodName, String.class);
        Object o = aClass.newInstance();
        method.invoke(o,"张三");
    }
}
