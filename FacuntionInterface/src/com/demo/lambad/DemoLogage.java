package com.demo.lambad;

public class DemoLogage {
    public static void showLog(int level,MessageBuilder messageBuilder){
        if (level == 1){
            System.out.println(messageBuilder.builderMessage());
        }
    }

    public static void main(String[] args) {
        String msg1 = "消息1";
        String msg2 = "消息2";
        String msg3 = "消息3";
//        showLog(1,()->{
//          return msg1 + msg2 +msg3;
//        });

        showLog(3,()->{
            System.out.println(1); // 不会执行
            return msg1 + msg2 +msg3;
        });
    }
}
