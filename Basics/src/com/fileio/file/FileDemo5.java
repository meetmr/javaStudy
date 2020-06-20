package com.fileio.file;

import java.io.File;

public class FileDemo5 {
    public static void main(String[] args) {
        File s = new File("D:\\cf\\");
        filePrint(s);
    }

    private static void filePrint(File s) {
        System.out.println(s);
        File[] files = s.listFiles();
        for (File file1 : files) {
            if (file1.isDirectory()){
                filePrint(file1);
            }else {
                System.out.println(file1);
            }
        }

    }
}
