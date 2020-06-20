package com.objectfile;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

// 反序列化对象
public class DemoObjectInput {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        PersonSerializable(); // 自定义对象反序列化
    }

    private static void PersonSerializable() throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("D:\\javaStudy\\demo\\object.txt"));
        Person person = (Person) objectInputStream.readObject();
        System.out.println(person);
        System.out.println(person.getName());
    }
}
