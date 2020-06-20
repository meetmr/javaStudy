package com.fileio.file;

import java.io.File;
import java.io.IOException;

public class FileDemo4 {
    public static void main(String[] args) throws IOException {
//        fileCreteNewFile(); // 创建新的空白文件
//        fileDelete();  // 删除文件或者是目录
//        fileMkdir(); //创建目录
//        fileMkdirs(); // 创建
//        fileList();
        fileListFills();
    }

    // 遍历文件夹 返回的是字符串
    private static void fileList() {
        File file = new File("D:\\cf");
        String[] list = file.list();

        for (String s : list) {
            System.out.println(s);
        }

    }

    // 遍历文件夹 返回的是文件对象
    private static void fileListFills() {
        File file = new File("D:\\cf");
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1);
        }

    }

    // 创建目录包含不存在的目录
    private static void fileMkdirs() {
        File file = new File("D:\\cf\\新建文件夹\\ab\\c\\a.txt");
        System.out.println(file.mkdirs());
    }

    // 创建目录
    private static void fileMkdir() {
        File file = new File("D:\\cf\\新建文件夹\\a");
        System.out.println(file.mkdir());
    }


    // 删除文件或者是目录
    private static void fileDelete() {
        File file = new File("D:\\cf\\新建文件夹\\a");
        System.out.println(file.delete());
    }

    // 创建新的空白文件
    private static void fileCreteNewFile() throws IOException {
        File file = new File("D:\\cf\\新建文件夹\\a");
        System.out.println(file.createNewFile());
    }
}
