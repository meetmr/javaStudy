package com.annotation;

import java.lang.annotation.*;

@Target({ElementType.TYPE}) // 作用与类 方法 还是成员属性
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno {
    String ClassName();
    String methodName();
}
