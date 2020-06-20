package com.fileio.file;

import java.io.File;

/*
*  java.io.file
*  可以创建删除、获取、判断文件或是文件夹
*  对文件夹进行遍历
*  获取文件的信息
*  与系统无关的类，任何操作系统都可以使用这个类的方法
*
*  重点：
*  1、file   文件
*  2、directory  文件夹 目录
*  3、path 路径
* */
public class FileDemo01 {
    public static void main(String[] args) {
    /*
    *
    * static String pathSeparator  与系统有关的路径分隔符，为了方便，它被表示为一个字符串。
      static char pathSeparatorChar   与系统有关的路径分隔符。
      static String separator    与系统有关的默认名称分隔符，为了方便，它被表示为一个字符串。
      static char separatorChar  与系统有关的默认名称分隔符。
    * */

        System.out.println(File.pathSeparator);  //;
        System.out.println(File.pathSeparatorChar); //;
        System.out.println(File.separator); // \
        System.out.println(File.separatorChar); // \
    }
}
