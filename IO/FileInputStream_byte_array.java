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

            //开始读，采用byte数组，一次读取多个字节，最多读取"数组.length"个字节。
            byte[] bytes = new byte[4];//准备一个4个长度的byte数组，一次最多读取4个字节
            //这个方法的返回值是：读取到的字节数量。（不是字节本身）
            int readCount = fis.read(bytes);
            System.out.println(readCount);//第一次读到了4个字节。
            //将字节数组全部转换成字符串
            //System.out.println(new String(bytes));//abcd，通过向字符串构造函数传入byte[]数组，就可以将byte[]数组转换成字符串。
            //不应该全部都转换，应该是读取了多少个字节，转换多少个。
            System.out.println(new String(bytes,0,readCount));//abcd

            readCount = fis.read(bytes);//第二次只能读取2个字节。将之前4个字节中的前2个字节覆盖
            System.out.println(readCount);//2
            //将字节数组全部转换成字符串
            //System.out.println(new String(bytes));//efcd
            //不应该全部都转换，应该是读取了多少个字节，转换多少个。
            System.out.println(new String(bytes,0,readCount));//ef

            readCount = fis.read(bytes);//一个字节都没读到，返回-1
            System.out.println(readCount);//-1

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
