package com.net;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

// 实现文件上传
public class TCPFileUPClient {
    public static void main(String[] args) throws IOException {
        // 1、创建一个客户端
        Socket socket = new Socket("127.0.0.1",8787);
        // 2、获取输出流
        OutputStream outputStream = socket.getOutputStream();
        // 3、创建一个文件输入流
        FileInputStream fileInputStream = new FileInputStream("D:\\javaStudy\\demo\\1.zip");
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = fileInputStream.read(bytes)) != -1){
            outputStream.write(bytes);
        }
        outputStream.flush();
        socket.shutdownOutput();
        // 4.获取输入流
        InputStream is = socket.getInputStream();
        // 5.读数据
        int len1 = 0;
        byte[] bytes1 = new byte[1024];
        while ((len1 = is.read(bytes1)) != -1){
            System.out.println(new String(bytes1,0,len1));
        }
        socket.shutdownInput();
        System.out.println("上传成功");
        socket.close();
    }
}
