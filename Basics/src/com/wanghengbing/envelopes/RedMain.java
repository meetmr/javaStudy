package com.wanghengbing.envelopes;
/*
*  1、设置程序标题
*  2、设置群众名称
*  3、实现发红包
*
* */
public class RedMain {
    public static void main(String[] args) {
        Envelopes red = new Envelopes("发红包");
        red.setOwnerName("王思聪");
//        red.setOpenWay(new NormalMode()); // 普通红包
        red.setOpenWay(new RandomMode()); // 随机红包
    }
}
