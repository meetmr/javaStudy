package com.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

// TCP 服务端
public class TCPPCServer {
    public static void main(String[] args) throws IOException {
        // 1、创建一个服务器
        ServerSocket server = new ServerSocket(8585);
        // 2、获取socket实列
        Socket accept = server.accept();
        // 3、获取输入流
        InputStream is = accept.getInputStream();
        // 4、读取数据
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = is.read(bytes)) != -1){
            System.out.println(new String(bytes,0,len));
        }
        // 5、获取输出流
        OutputStream os = accept.getOutputStream();
        // 6、写数据
        os.write("收到".getBytes());
        // 7、关闭
        server.close();
    }
}

