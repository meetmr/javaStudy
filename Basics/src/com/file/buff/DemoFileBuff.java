package com.file.buff;

import java.io.*;

public class DemoFileBuff {
    public static void main(String[] args) throws IOException {
//        demoOutputStream(); // 输入流
//        demoInputStream(); // 输出流
        demoCope(); // 文件复制
    }

    private static void demoCope() {
        long s = System.currentTimeMillis();
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            FileInputStream fileInputStream = new FileInputStream("D:\\javaStudy\\demo\\1.rar"); // 创建输入流对象
            FileOutputStream fileOutputStream = new FileOutputStream("D:\\javaStudy\\demo\\cope.rar"); // 创建输出流对象
            bufferedInputStream  = new BufferedInputStream(fileInputStream);
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
//            int len = 0;
//            while ((len = bufferedInputStream.read()) != -1){ // 消耗:5578毫秒
//                bufferedOutputStream.write(len);
//            }
            int len = 0;
            byte[] bytes = new byte[1024];
            while ((len = bufferedInputStream.read(bytes)) != -1){ // 消耗:358毫秒  这种方法很快
                bufferedOutputStream.write(bytes,0,len);
            }

        }catch (IOException e){
            System.out.println(e.getMessage());
        }finally {
           try {
               if (bufferedInputStream != null){
                   bufferedInputStream.close();
               }
               if(bufferedOutputStream != null){
                   bufferedOutputStream.close();
               }
           }catch (IOException e){
               System.out.println(e.getMessage());
           }
        }
        long e = System.currentTimeMillis();
        System.out.println("消耗:"+ (e-s) +"毫秒");
    }

    private static void demoOutputStream() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\1\\5.txt");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        bufferedOutputStream.write("数据写入到缓存区".getBytes());
        bufferedOutputStream.close();
        fileOutputStream.close();
    }

    private static void demoInputStream() throws IOException {
        // 创建一个字节输入流
        FileInputStream fileInputStream = new FileInputStream("D:\\1\\5.txt");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        int len = 0;
        while ((len = bufferedInputStream.read()) != -1){
            System.out.println(len);
        }
        bufferedInputStream.close();
        fileInputStream.close();
    }
}
