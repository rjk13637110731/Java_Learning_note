package com.baidu.javase.chapter23.baidu.com.javase.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest01 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            //创建文件字节输入流对象
            //java中会将E:\JavaDocument..转换成E:\\JavaDocument..,因为\为转义字符
            //写成E:/JavaDocument..也是可以的。
            fis = new FileInputStream("E:\\JavaDocument\\chapter16\\src\\com\\baidu\\javase\\chapter23\\temp");

            //开始读
            int readData = fis.read();//这个方法的返回值是：读取到的“字节”本身。
            System.out.println(readData);//97

            readData = fis.read();
            System.out.println(readData);//98

            readData = fis.read();
            System.out.println(readData);//99

            readData = fis.read();
            System.out.println(readData);//100

            readData = fis.read();
            System.out.println(readData);//101

            readData = fis.read();
            System.out.println(readData);//102

            //读到文件末尾了，再读的时候，读取不到任何数据，返回-1。
            readData = fis.read();
            System.out.println(readData);//-1

            readData = fis.read();
            System.out.println(readData);//-1

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            //在finally语句块中确保流一定关闭。
            if (fis != null) {//b避免空指针异常
                //关闭流的前提是：流一定不是空。流是null的时候，没必要关闭。
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
