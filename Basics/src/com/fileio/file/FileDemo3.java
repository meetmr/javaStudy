package com.fileio.file;

import java.io.File;

public class FileDemo3 {
    public static void main(String[] args) {
//        filePath();

//        fileName();

//        fileSize();

//        fileExists();

        fileDir();
    }

    // 判断是否是目录
    private static void fileDir() {
        File file = new File("D:\\cf\\QQBrowser_Setup_CF.exe"); // 不是目录
        System.out.println(file.isDirectory());

        File file1 = new File("D:\\cf\\");
        System.out.println(file1.isDirectory());

        System.out.println("======================");
        File file2 = new File("D:\\cf\\QQBrowser_Setup_CF.exe");
        System.out.println(file2.isFile());

        File file3 = new File("D:\\cf\\");
        System.out.println(file1.isFile());

        File file4 = new File("D:\\c3f\\"); // 不存在
        System.out.println(file4.isFile()); // 返回false
    }


    // 判断是否存在
    private static void fileExists() {
        File file = new File("D:\\cf\\QQBrowser_Setup_CF.exe");
        System.out.println(file.exists());

        File file2 = new File("D:\\c2f\\QQBrowser_Setup_CF.exe");
        System.out.println(file2.exists());

        File file3 = new File("D:\\cf");
        System.out.println(file3.exists());

        File file4 = new File("a");
        System.out.println(file4.exists());

        File file5 = new File("javaStudy.iml");
        System.out.println(file5.exists());
    }

    // 文件大小
    public static void fileSize(){
        File file = new File("D:\\cf\\QQBrowser_Setup_CF.exe");
        System.out.println(file.length()); // 获取的是文件的大小 以字节为单位的  如果不存在 返回的是0

        File file1 = new File("D:\\java最新");
        System.out.println(file1.length());
    }

    // 路径相关
    public static void filePath(){
        File file = new File("D:\\cf\\a.java");
        System.out.println(file.getAbsolutePath()); // 返回的都是绝对路径
        System.out.println(file.getPath()); // 返回路径

        File file1 = new File("a.java");
        System.out.println(file1.getAbsolutePath());
        System.out.println(file1.getPath());
    }

    // 文件名称
    public static void fileName(){
        File file = new File("D:\\cf\\a.java"); //
        System.out.println(file.getName()); // 如果是文件 返回的是文件名 a.java

        File file1 = new File("D:\\cf\\");
        System.out.println(file1.getName()); // 如果是目录 返回的是目录名 cf

    }
}
