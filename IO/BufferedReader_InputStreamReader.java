package com.baidu.javase.chapter23.baidu.com.javase.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class BufferedReaderTest02 {
    public static void main(String[] args) throws Exception{
        //字节流
        FileInputStream in = new FileInputStream("temp");

        //通过转换流转换(InputStreamReader将字节流转换成字符流)
        //这里的in是节点流，reader是包装流/处理流
        InputStreamReader reader = new InputStreamReader(in);

        //这个构造方法只能传进一个字符流，不能传字节流。
        //这里的reader是节点流，br是包装流/处理流。
        BufferedReader br = new BufferedReader(reader);

        //合并写法：
        BufferedReader br1 = new BufferedReader(new InputStreamReader(new FileInputStream("temp")));
        
        //读
        String line = null;
        while((line = br.readLine()) != null){
            System.out.println(line);
        }

        //关闭流：直接关闭最外层
        br.close();
    }
}
