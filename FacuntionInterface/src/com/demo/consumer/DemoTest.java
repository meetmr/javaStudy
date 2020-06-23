package com.demo.consumer;

import java.util.function.Consumer;

/**
 *  Consumer 消费性接口
 */
public class DemoTest {
    public static void show(String name,Consumer<String> Consumer){
        Consumer.accept(name);
    }

    public static void main(String[] args) {
       show("找你呀",(String name)->{
           String reName = new StringBuffer(name).reverse().toString();
           System.out.println(reName);
       });
    }
}
