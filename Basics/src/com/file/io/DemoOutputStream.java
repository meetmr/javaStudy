package com.file.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class DemoOutputStream {
    public static void main(String[] args) throws IOException {
        // 创建一个输出流
        FileOutputStream fps = new FileOutputStream("D:\\1\\1.txt");
        fps.write(97);
        fps.write(97);
        fps.write(6);
        fps.write(97);
        fps.close();
    }
}
