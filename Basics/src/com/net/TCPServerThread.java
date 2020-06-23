package com.net;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerThread {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8787);
        while (true){
            Socket accept = serverSocket.accept();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        InputStream inputStream = accept.getInputStream();
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                        String line = bufferedReader.readLine();
                        System.out.println(line);
                        String[] arr = line.split(" ");
                        String htmlPath = arr[1].substring(1);
                        File file = new File("");
                        String filePath = file.getCanonicalPath();
                        System.out.println(filePath);

                        FileInputStream fis = new FileInputStream(filePath+"\\"+htmlPath);
                        System.out.println(filePath+"\\"+htmlPath);

                        OutputStream os = accept.getOutputStream();
                        os.write("HTTP/1.1 200 OK\r\n".getBytes());
                        os.write("Content-Type:text/html".getBytes());
                        os.write("\r\n".getBytes());

                        int len = 0;
                        byte[] bytes = new byte[1024];
                        while ((len = fis.read(bytes)) != -1){
                            os.write(bytes,0,len);
                        }

                    }catch (IOException e){
                        System.out.println(e);
                    }
                }
            }).start();
        }
//        serverSocket.close();
    }
}
