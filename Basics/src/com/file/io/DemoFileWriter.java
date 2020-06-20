package com.file.io;

import java.io.FileWriter;
import java.io.IOException;

// 字符输出流
public class DemoFileWriter {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("D:\\1\\2.txt");
        fileWriter.write("王恒兵");
        fileWriter.flush(); // 写入后，必须刷新缓冲区
        fileWriter.close();
    }
}
