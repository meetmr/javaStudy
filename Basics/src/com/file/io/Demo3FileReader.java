package com.file.io;

import java.io.FileReader;
import java.io.IOException;

public class Demo3FileReader {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("D:\\1\\1.txt");
        int len = 0;
        // 读取字符
//        while((len = fileReader.read()) != -1){
//            System.out.print((char) len);
//        }

        char[] str = new char[1024];
        while ((len = fileReader.read(str)) != -1){
            System.out.print(new String(str,0,len));
        }
        fileReader.close();
    }
}
