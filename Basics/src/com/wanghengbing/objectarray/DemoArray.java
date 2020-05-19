package com.wanghengbing.objectarray;

public class DemoArray {
    public static void main(String[] args) {
        // 对象数组
        People[] people_array = new People[3];

        people_array[0] = new People("王恒兵",22);
        people_array[1] = new People("谢国燕",20);
        people_array[2] = new People("王恒星",19);

        System.out.println(people_array[0].getName()); // 直接通过数组调用
        System.out.println(people_array[0].getAge());


        System.out.println(people_array[1].getName()); // 直接通过数组调用
        System.out.println(people_array[1].getAge());


        System.out.println(people_array[2].getName()); // 直接通过数组调用
        System.out.println(people_array[2].getAge());

    }
}
