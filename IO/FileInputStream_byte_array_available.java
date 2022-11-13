package com.baidu.javase.chapter23.baidu.com.javase.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest05 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("temp1");
            System.out.println("总字节数量：" + fis.available());

            /*
            //读1个字节
            int readByte = fis.read();
            //还剩下可读的字节数量是：
            System.out.println("剩下多少个字节没有读：" + fis.available());
            */

            //这个方法有什么用？、
            byte[] bytes = new byte[fis.available()];//这种方式不太适合大的文件。因为byte数组不能太大。
            //不需要循环了，直接读一次就行了。
            int readCount = fis.read(bytes);//6
            System.out.println(new String(bytes));//abcdef

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
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
