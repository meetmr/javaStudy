package com.wanghengbing.object;

public class Student {
    private String name; // 姓名
    private int age;  // 年龄
    private String Student_number; //  学号

//    // 构造函数
//    public Student(String name,int age,String Student_number){
//        this.name = name;
//        this.age = age;
//        this.Student_number = Student_number;
//    }

    public void setName(String name){
        if (name == null){
            System.out.println("参数错误");
        }
        this.name = name;
    }


    public String setName(){
       return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
       return age;
    }

    public void setStudent_number(String  setStudent_number){
        this.Student_number = Student_number;
    }

    public String getStudent_number(){
        return this.Student_number;
    }

    public void info(){
        System.out.println("【 学生名称："+this.name+" 学生年龄："+this.age+" 学生学号："+this.Student_number+" 】");
    }

    public void eat(){
        System.out.println("吃饭");
    }

    public void sleep(){
        System.out.println("睡觉");
    }

    public void study(){
        System.out.println("学习");
    }

    public void mytoString(){
        System.out.println(this.toString());

    }
}
