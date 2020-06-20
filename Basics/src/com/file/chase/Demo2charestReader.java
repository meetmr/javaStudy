package com.file.chase;

import java.io.*;

public class Demo2charestReader {
    public static void main(String[] args) throws IOException {
        //reader_gbk();     // 读取gbk文件类型
        //reader_urf_8();   // 读取urf_8文件类型
        reader_gbk_to_urf_8(); // 将gbk编码转换成urf_8
    }

    private static void reader_gbk_to_urf_8() throws IOException {
        // 定义一个输出流
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\javaStudy\\demo\\to_utf_8.txt"));
        // 定义读取流
        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\javaStudy\\demo\\gbk.txt"),"gbk");
        int len = 0;
        while ((len = isr.read()) != -1){
            osw.write(len);
        }
        osw.close();
        isr.close();
    }

    private static void reader_urf_8() throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\javaStudy\\demo\\utf_8.txt"),"utf-8");
        int len = 0;
        while ((len = isr.read()) != -1){
            System.out.print((char)len);
        }
        isr.close();
    }

    private static void reader_gbk() throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\javaStudy\\demo\\gbk.txt"),"gbk");
        int len = 0;
        while ((len = isr.read()) != -1){
            System.out.print((char)len);
        }
        isr.close();
    }

}
