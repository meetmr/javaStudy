package com.function;

public class Man extends Human{

    @Override
    public void sayHello() {
        super.sayHello();
    }

    public void method(Greetble g){
        g.greet();
    }

    public void show(){
        method(()->{
            Human h = new Human();
            h.sayHello();
        });

        method(()->{
            super.sayHello();
        });

        method(super::sayHello);
    }

    public static void main(String[] args) {
        new Man().show();
    }
}
