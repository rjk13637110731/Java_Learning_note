package com.baidu.javase.chapter23.baidu.com.javase.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest01 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            //myfile文件不存在的时候会自动新建！
            //这种方式谨慎使用，这种方式会先将原文件你清空，然后重新写入。
            fos = new FileOutputStream("myfile");
            //开始写
            byte[] bytes = {97,98,99,100};
            //将bytes数组全部写出
            fos.write(bytes);//abcd
            //将bytes数组的一部分写出！
            fos.write(bytes,0,2);//再写出ab，文件内容现在为abcdab

            //写完之后一定要刷新
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
