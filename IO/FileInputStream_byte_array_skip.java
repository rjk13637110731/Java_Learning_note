package com.baidu.javase.chapter23.baidu.com.javase.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest051 {
    public static void main(String[] args) {
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("temp1");
            System.out.println("总字节数量：" + fis.available());

            //skip跳过几个字节不读取，这个方法也可能以后会用！
            fis.skip(3);
            System.out.println(fis.read());//读的是"d"所对应的字节ASCII值：100
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
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
