package com.wanghengbing.inside;

public class People {

    public int num = 10;

    public class Heart{ // 内部类  可以使用public 或者是什么都不用写

        public int num = 20;
        public void beat(){
            int num = 30;
            System.out.println("心脏跳动");
            System.out.println(num);
            System.out.println(this.num);
            System.out.println(People.this.num);
        }
    }

    public void demo(){
         class Demo1{  //权限修饰符不用写
            public void info(){
                System.out.println("局部内部类");
            }
        }
        new Demo1().info();
    }

    public void beat(){
        new Heart().beat();
    }

}
