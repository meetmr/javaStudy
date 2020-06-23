package com.demo.functionlnterface;

public class MyFunctionInterfaceImpl implements MyFunctionInterface {
    @Override
    public void method() {
        System.out.println("直接调用接口的实现类");
    }
}
