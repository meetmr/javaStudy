package com.file.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo1OutputStream {
    public static void main(String[] args) throws IOException {
        // 创建一个输出流
        FileOutputStream fps = new FileOutputStream("D:\\1\\1.txt",true);
        String str = "王恒兵";
        byte[] bytes = str.getBytes();
        fps.write(bytes);
        fps.write("\n".getBytes());
        fps.write(bytes);
        fps.close();

    }
}
