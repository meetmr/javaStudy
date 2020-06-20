package com.prop;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Demo1Prop {
    public static void main(String[] args) throws IOException {
//        demo1(); // 普通用法
//        demo2(); // 将数据写入到文件
        demo3(); // 从文件中读取数据
    }

    // 从文件中读取数据
    private static void demo3() throws IOException {
        Properties properties = new Properties();
        properties.load(new FileReader("D:\\1\\3.txt"));
        Set<String> strings = properties.stringPropertyNames();
        for (String string : strings) {
            System.out.println("键："+string +" 值："+properties.getProperty(string));
        }
    }

    private static void demo2() throws IOException {
        Properties properties = new Properties(); // 创建对象
        properties.setProperty("王恒兵","18"); // 写入数据
        properties.setProperty("王恒兵1","181");
        properties.setProperty("王恒兵2","181");
        FileWriter fileWriter = new FileWriter("D:\\1\\3.txt");
        properties.store(fileWriter, "save");
//        properties.store(new FileWriter("D:\\1\\3.txt"), "保持数据");
        fileWriter.close();
    }

    // 普通使用
    private static void demo1() {
        Properties properties = new Properties(); // 创建对象
        properties.setProperty("王恒兵","18"); // 写入数据
        properties.setProperty("王恒兵1","181");
        properties.setProperty("王恒兵2","181");
        Set<String> strings = properties.stringPropertyNames(); // 获取键到集中
        for (String string : strings) {
            System.out.println("键："+string +" 值："+properties.getProperty(string));
        }
    }
}
