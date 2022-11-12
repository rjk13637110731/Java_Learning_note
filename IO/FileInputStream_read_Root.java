package com.baidu.javase.chapter23.baidu.com.javase.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest03 {
    public static void main(String[] args) {
        FileInputStream fis  = null;

        try {
            //相对路径的话，相对路径一定是从当前所在的位置作为起点开始找！
            //IDEA默认的当前路径是哪里？工程Project的根就是IDEA的默认的当前路径。
            fis = new FileInputStream("temp");
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally{
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
