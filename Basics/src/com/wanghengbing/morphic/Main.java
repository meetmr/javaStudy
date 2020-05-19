package com.wanghengbing.morphic;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("小毛","白色",1);  // 父类引用子类对象

        cat.eat();
        cat.sleep();
        cat.call();

        // 向下转型成为猫。前提是他本来就是猫

        Cat cat1 =  (Cat)cat;
        cat1.talent();
        System.out.println("================");

        Animal dog = new Dog("汪汪","灰色",2);
        dog.eat();
        dog.sleep();
        if (dog instanceof Dog){
            Dog dog1 = (Dog)dog;
            dog1.talent();
            System.out.println(dog1.getName());
        }
    }
}
