package com.baidu.javase.chapter23.baidu.com.javase.io;

import java.io.FileReader;
import java.util.Properties;

public class IOPropertiesTest01 {
    public static void main(String[] args) throws Exception{
        /*
        Properties是一个Map集合，key和value都是String类型
        想将userinfo文件中的的数据加载到Properties对象当中。
         */

        //新建一个输入流对象
        FileReader reader = new FileReader("userinfo");

        //新建一个Map集合
        Properties pro = new Properties();

        //调用Properties对象 的load方法，将文件中的数据加载到Map集合中
        pro.load(reader);//将输入流传进去，文件中的数据顺着管道加载到Map集合中，其中等号左边做key，右边做value

        //通过key来获取value
        String username = pro.getProperty("username");
        System.out.println(username);

        String password = pro.getProperty("password");
        System.out.println(password);
    }
}
