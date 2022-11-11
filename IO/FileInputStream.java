package com.baidu.javase.chapter23.baidu.com.javase.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputStreamTest01 {
    public static void main(String[] args) {
        try {
            //创建文件字节输入流对象
            //java中会将E:\JavaDocument..转换成E:\\JavaDocument..,因为\为转义字符
            //写成E:/JavaDocument..也是可以的。
            FileInputStream fis = new FileInputStream("E:\\JavaDocument\\chapter16\\src\\com\\baidu\\javase\\chapter23\\temp");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
