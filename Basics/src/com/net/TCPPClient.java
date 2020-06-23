package com.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

// TCP 客户端
public class TCPPClient {
    public static void main(String[] args) throws IOException {
        // 1.创建客服端套接字
        Socket socket = new Socket("127.0.0.1",8585);

        // 2.获取输出流
        OutputStream os = socket.getOutputStream();
        // 3.向服务器写数据
        os.write("你好服务器".getBytes());

        // 4.获取输入流
        InputStream is = socket.getInputStream();
        // 5.读数据
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = is.read(bytes)) != -1){
            System.out.println(new String(bytes,0,len));
        }
        // 6.关闭
        socket.close();
    }
}
