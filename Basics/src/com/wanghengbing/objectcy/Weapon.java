package com.wanghengbing.objectcy;

public class Weapon {
    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Weapon() {
    }

    public Weapon(String code) {
        this.code = code;
    }

    public  void Bigmove(){
        System.out.println("天涯明月斩");
    }
}
