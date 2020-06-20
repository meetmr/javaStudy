package com.file.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoInputStream {
    public static void main(String[] args) throws IOException {
       // FileRead(); // FileRead一次读取一个字节
//        FileRead1(); // 读取指定数组个数的字节
//        FileRead2();
        FileCope();
    }

    private static void FileCope() throws IOException {
        long s = System.currentTimeMillis();
        // 文件复制
        FileInputStream imgInput = new FileInputStream("D:\\javaStudy\\demo\\1.rar"); // 创建文件输入流
        FileOutputStream imgOut = new FileOutputStream("D:\\javaStudy\\demo\\12.rar"); // 创建文件输出流
//        int input = 0;
//        while ((input = imgInput.read()) != -1){ // 读取文件
//            imgOut.write(input); // 写入数据到文件中
//        }
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = imgInput.read(bytes)) != -1){
            imgOut.write(bytes,0,len);
        }
        imgInput.close(); // 关闭流
        imgOut.close(); // 关闭流
        long e = System.currentTimeMillis();
        System.out.println(e-s);
    }

    private static void FileRead2() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("D:\\1\\1.txt");
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = fileInputStream.read(bytes)) != -1){
            System.out.println(new String(bytes,0,len));
        }
    }

    private static void FileRead1() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("D:\\1\\1.txt");
        byte[] bytes = new byte[2];
        int len = fileInputStream.read(bytes);
        System.out.println(len);
        System.out.println(new String(bytes)); // 转换成字符串

        len = fileInputStream.read(bytes);
        System.out.println(len);
        System.out.println(new String(bytes)); // 转换成字符串

        len = fileInputStream.read(bytes);
        System.out.println(len);
        System.out.println(new String(bytes)); // 转换成字符串

        len = fileInputStream.read(bytes);
        System.out.println(len);
        System.out.println(new String(bytes)); // 转换成字符串
    }

    public static void FileRead() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("D:\\1\\1.txt");
        int read = 0;
        while ((read = fileInputStream.read()) != -1){ // 一次读取一个字节
            System.out.println(read);
        }
        fileInputStream.close();
    }
}
