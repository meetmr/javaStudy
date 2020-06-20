package com.fileio.file;

import java.io.File;

public class FileDemo2 {
    public static void main(String[] args) {
        // File(String pathname)
        // 通过将给定路径名字符串转换为抽象路径名来创建一个新 File 实例。
        File file = new File("D:\\WHB"); // 把路径封装成file对象
        System.out.println(file);

        //File(File parent, String child)
        //根据 parent 抽象路径名和 child 路径名字符串创建一个新 File 实例。
        File file1 = new File(file,"\\1.js");
        System.out.println(file1);

        //File(String parent, String child)
        //根据 parent 路径名字符串和 child 路径名字符串创建一个新 File 实例。
        File file2 = new File("c:","\\q");
        System.out.println(file2);

    }
}
