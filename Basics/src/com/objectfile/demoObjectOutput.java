package com.objectfile;

import java.io.*;
import java.util.HashMap;
import java.util.Set;

public class demoObjectOutput {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        PersonSerializable(); // 自定义对象序列化
//        MapSerializable(); // 内置对象序列化
        MapSeriaFlizable(); // 内置对象反序列化
    }

    private static void MapSeriaFlizable() throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("D:\\javaStudy\\demo\\map.txt"));
        HashMap<String,String> map = (HashMap<String, String>) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(map);
    }

    private static void MapSerializable() throws IOException {
        // 定义一个map
        HashMap<String,String> map = new HashMap<>();
        map.put("蒂尼日本","180");
        map.put("小黛蒂","80");
        map.put("小黛蒂1","10");
        map.put("小黛蒂3","0");
        Set<String> strings = map.keySet();
        for (String string : strings) {
            System.out.println("键:"+string+"值:"+map.get(string));
        }

        // 序列化后存到文件中
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("D:\\javaStudy\\demo\\map.txt"));
        outputStream.writeObject(map);
        outputStream.close();
    }

    private static void PersonSerializable() throws IOException {
        // 对象序列化
        Person person = new Person("王恒兵",18);
        System.out.println(person);

        // 创建序列化输出流
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("D:\\javaStudy\\demo\\object.txt"));
        outputStream.writeObject(person);
        outputStream.close();
    }
}
