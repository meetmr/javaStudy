package com.demo.functionlnterface;

public class Demo {
    /*
    * 使用函数式接口，可以将接口当初函数的参数，也可以当成函数的返回值。
    *
    * */

    /**
     * 将接口当初函数的参数
     * @param myFunctionInterface
     */
    public static void demo(MyFunctionInterface myFunctionInterface){
        myFunctionInterface.method();
    }

    public static void main(String[] args) {
        // 直接调用接口的实现类
        demo(new MyFunctionInterfaceImpl());

        // 调用接口重写方法
        demo(new MyFunctionInterface() {
            @Override
            public void method() {
                System.out.println("调用接口重写方法");
            }
        });

        // 使用lambad表达式调用
        demo(()->{
            System.out.println("使用lambad表达式调用");
        });

        // 使用lambad简化表达式调用
        demo(()-> System.out.println("使用lambad简化表达式调用"));
    }
}
