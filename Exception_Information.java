package com.baidu.javase.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest10 {
    public static void main(String[] args) {
        try {
            m1();
        } catch (FileNotFoundException e) {

            //获取异常的简单描述信息
            String msg = e.getLocalizedMessage();
            System.out.println(msg);

            //打印异常堆栈追踪信息：
            //在实际的开发中，建议使用这个，养成好习惯。
            //这行代码一定要写上，不然出问题你也不知道。
            e.printStackTrace();//一般都是使用这个。
            /*打印的异常堆栈追踪信息
            java.io.FileNotFoundException: F:\BaiduNetdiskDownload\学习1方法.txt (系统找不到指定的文件。)
                at java.base/java.io.FileInputStream.open0(Native Method)
                at java.base/java.io.FileInputStream.open(FileInputStream.java:216)
                at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
                at java.base/java.io.FileInputStream.<init>(FileInputStream.java:111)
                at com.baidu.javase.exception.ExceptionTest10.m3(ExceptionTest10.java:26)
                at com.baidu.javase.exception.ExceptionTest10.m2(ExceptionTest10.java:22)
                at com.baidu.javase.exception.ExceptionTest10.m1(ExceptionTest10.java:18)
                at com.baidu.javase.exception.ExceptionTest10.main(ExceptionTest10.java:9)
                因为26行出问题导致22行，22行出问题导致18行，18行出问题导致9行。
                应该先查看26行代码，因为26行代码是错误的根源。
             */
        }

        //这里的程序不耽误执行，很健壮（服务器不会因为遇到异常而宕机）。
        System.out.println("Hello world");
    }

    public static void m1() throws FileNotFoundException {
        m2();
    }

    public static void m2() throws FileNotFoundException {
        m3();
    }

    public static void m3() throws FileNotFoundException {
        new FileInputStream("F:\\BaiduNetdiskDownload\\学习1方法.txt");
    }
}
