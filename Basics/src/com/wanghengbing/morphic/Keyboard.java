package com.wanghengbing.morphic;

public class Keyboard implements Usb {
    @Override
    public void OpenDevice() {
        System.out.println("打开键盘设备");
    }

    @Override
    public void CloseDevice() {
        System.out.println("关闭键盘设备");
    } // 鼠标

    public void typing(){
        System.out.println("打字");
    }
}
