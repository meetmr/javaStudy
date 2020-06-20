package com.file.chase;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class Demo1Charset {
    public static void main(String[] args) throws IOException {
        // 使用urf-8将数据写入文件
//        write_utf_8();
        write_gbk();
    }

    private static void write_gbk() throws IOException {
        // 创建对象，指定输出流和编码格式
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\javaStudy\\demo\\gbk.txt"), "GBK");
        osw.write("写入数据");
        osw.close();
    }

    private static void write_utf_8() throws IOException {
        // 创建对象，指定输出流和编码格式
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\javaStudy\\demo\\utf_8.txt"), StandardCharsets.UTF_8);
        osw.write("写入数据");
        osw.close();
    }
}
