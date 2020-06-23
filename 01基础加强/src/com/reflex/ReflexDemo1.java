package com.reflex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
         获取Class对象的方式：
		1. Class.forName("全类名")：将字节码文件加载进内存，返回Class对象
			* 多用于配置文件，将类名定义在配置文件中。读取文件，加载类
		2. 类名.class：通过类名的属性class获取
			* 多用于参数的传递
		3. 对象.getClass()：getClass()方法在Object类中定义着。
			* 多用于对象的获取字节码的方式

		* 结论：
			同一个字节码文件(*.class)在一次程序运行过程中，只会被加载一次，不论通过哪一种方式获取的Class对象都是同一个。
        * */
public class ReflexDemo1 {
    public static void main(String[] args) throws Exception {
//       demo1();  // 获取Class对象的方式
//        demo2Field(); // 获取成员变量
//        demo3Constructor(); // 获取构造方法
        demo04Mathod();
    }

    private static void demo04Mathod() throws Exception {
        Class personClass = Person.class; // 获取Class对象
        Method ead = personClass.getMethod("eat"); // 获取class对象中的指定名称的方法
        ead.setAccessible(true);
        Person p = new Person();
        ead.invoke(p); //执行 但是需要传递对象
        System.out.println(ead);

        System.out.println("=============");
        Method print = personClass.getMethod("print", String.class);
        print.invoke(p,"张三");
    }

    private static void demo3Constructor() throws Exception {
        /*
         * * Constructor<?>[] getConstructors()
         * Constructor<T> getConstructor(类<?>... parameterTypes)

         * Constructor<T> getDeclaredConstructor(类<?>... parameterTypes)
         * Constructor<?>[] getDeclaredConstructors()
         *
         * */
        Class aClass = Class.forName("com.reflex.Person");  // 获取Class对象
        Constructor constructors = aClass.getConstructor(String.class, int.class); // 获取构造方法
        System.out.println(constructors);
        Object person = constructors.newInstance("张三", 30); // 创建对象
        System.out.println(person);
        System.out.println(aClass.newInstance());
    }


    private static void demo2Field() throws Exception {
        /*
        * * Field[] getFields() ：获取所有public修饰的成员变量
         * Field getField(String name)   获取指定名称的 public修饰的成员变量

         * Field[] getDeclaredFields()  获取所有的成员变量，不考虑修饰符
         * Field getDeclaredField(String name)
         *  setAccessible(true):暴力反射
         *
        * */
        Class aClass = Class.forName("com.reflex.Person"); // 获取Class对象的方式
        Field[] fields = aClass.getFields(); // 获取成员方法 public
        for (Field field : fields) {
            System.out.println(field);
        }

        Person p = new Person();
        Field name = aClass.getField("name");// 获取字节码中的成员变量
        Object pname = name.get(p); // 对对象进行获取值
        System.out.println(pname);
        name.set(p,"张三");
        System.out.println( name.get(p));
    }

    private static void demo1() throws ClassNotFoundException {
        // 1. Class.forName("全类名")：将字节码文件加载进内存，返回Class对象
        Class aClass = Class.forName("com.reflex.Person");
        System.out.println(aClass);

        //2. 类名.class：通过类名的属性class获取
        Class personClass = Person.class;
        System.out.println(personClass);

        // 3. 对象.getClass()：getClass()方法在Object类中定义着。
        Person p1 = new Person();
        Class  aClass1 = p1.getClass();
        System.out.println(aClass1);
    }
}
