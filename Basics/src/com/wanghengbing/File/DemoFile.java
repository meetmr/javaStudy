package com.wanghengbing.File;

import java.io.File;
import java.util.Objects;

public class DemoFile {
    public static void main(String[] args) {
        // 读取目录
        getMake("F:/java");
    }

    public static void  getMake(String file_path){
        File file = new File(file_path);
        if (!file.exists()){
            System.out.println("文件不存在");
            return;
        }
        System.out.println(file_path);
        if (file.isDirectory()){
            String[] s = file.list();
            for (String e: Objects.requireNonNull(s)) {
                File item = new File(file_path+"/"+e);
                if (item.isDirectory()){ // 判断是否是目录
//                    ArrayList<String> file_name = new ArrayList<>();
                    getMake(file_path+"/"+e);
//                    path.add(file_name);
                }
            }
//            for (int i = 0; i <s.length ; i++) {
//
//            }
        }

    }
}
