package com.net;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

// 实现文件上传
public class TCPFileUPServer {
    public static void main(String[] args) throws IOException {
       // 1、创建serevr
       ServerSocket server = new ServerSocket(8787);
       // 2、获取socket实列
       while (true){
           Socket socket = server.accept();
           // 3、获取输入流
           InputStream socket_is = socket.getInputStream();
           // 创建文件输出流
           FileOutputStream fileOutputStream = new FileOutputStream("D:\\javaStudy\\demo\\"+System.currentTimeMillis()+".zip");
           int len = 0;
           byte[] bytes = new byte[1024];
           while ((len = socket_is.read(bytes)) != -1){
               fileOutputStream.write(bytes,0,len);
           }
           OutputStream outputStream = socket.getOutputStream();
           outputStream.write("上传成功".getBytes());

           server.close();
           fileOutputStream.close();
       }
    }
}
