package com.wanghengbing.morphic;

public class Notebook {
    public String brand;
    public float price;

    public Notebook(String brand,float price){
        this.brand = brand;
        this.price = price;
    }

    public void Open(){
        System.out.println("打开电脑");
    }

    public void  Close(){
        System.out.println("关闭设备");
    }

    public void UseDevice(Usb usb){
        usb.OpenDevice();
        if (usb instanceof Keyboard){
            Keyboard key = (Keyboard)usb;
            key.typing();
        }

        if (usb instanceof Mouse){
            Mouse mouse = (Mouse)usb;
            mouse.Click();
        }
        usb.CloseDevice();
    }

    public void Info(){
        System.out.println("{电脑名："+this.brand +"价格："+this.price+"}");
    }
}
