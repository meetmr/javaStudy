package com.wanghengbing.morphic;

public class Mouse implements Usb {
    @Override
    public void OpenDevice() {
        System.out.println("打开鼠标设备");
    }

    @Override
    public void CloseDevice() {
        System.out.println("关闭鼠标设备");
    } // 鼠标

    public void Click(){
        System.out.println("鼠标移动");
    }
}
