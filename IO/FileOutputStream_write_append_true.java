package com.baidu.javase.chapter23.baidu.com.javase.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileOutputStreamTest011 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            //以追加的方式在文件末尾写入，不会清空原文件内容。
            fos = new FileOutputStream("myfile",true);
            //开始写
            byte[] bytes = {97,98,99,100};
            //将bytes数组全部写出
            fos.write(bytes);//abcd
            //将bytes数组的一部分写出！
            fos.write(bytes,0,2);//再写出ab，文件内容现在为abcdab

            //字符串
            String s = "我是一个中国人，我骄傲！！！";
            //将字符串转换成byte数组。
            byte[] bs = s.getBytes();
            //写
            fos.write(bs);

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
