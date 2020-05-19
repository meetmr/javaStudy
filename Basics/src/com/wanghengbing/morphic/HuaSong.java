package com.wanghengbing.morphic;

public class HuaSong {
    public static void main(String[] args) {
        Notebook huasuo = new Notebook("华颂",50.4f);  // 创建电脑
        huasuo.Info(); // 电脑信息
        huasuo.Open();  // 打开电脑

        // 使用设备
        Usb mouse = new Mouse(); //创建一个鼠标 使用多态
//        mouse.OpenDevice(); // 加载鼠标
        huasuo.UseDevice(mouse);    // 电脑使用
        System.out.println("===========================");
        Usb keyboard = new Keyboard();   // 创建一个键盘 使用多态

//        keyboard.OpenDevice();// 加载键盘
        huasuo.UseDevice(keyboard);    // 电脑使用


        System.out.println("===========================");
//        mouse.CloseDevice(); // 关闭鼠标
//        keyboard.CloseDevice(); // 关闭键盘
        huasuo.Close();  // 关闭电脑+
    }
}
