package com.baidu.javase.chapter23.baidu.com.javase.io;

import java.io.File;

public class FileTest03 {
    public static void main(String[] args) {
        //File[] listFiles()
        //获取当前目录下所有的子目录文件
        File f = new File("E:\\ISALE");
        File[] files = f.listFiles();
        //foreach
        for (File file : files){
            System.out.println(file.getAbsolutePath());//子目录文件路径
            System.out.println(file.getName());//文件名
        }
    }
}
