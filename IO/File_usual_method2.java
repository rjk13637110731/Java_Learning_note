package com.baidu.javase.chapter23.baidu.com.javase.io;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileTest02 {
    public static void main(String[] args) {
        File f1 = new File("E:\\a\\b\\c\\d\\e\\f\\123.doc");
        //获取文件名
        System.out.println("文件名：" + f1.getName());

        //判断是否是一个目录
        System.out.println(f1.isDirectory());//false

        //判断是否普是一个文件
        System.out.println(f1.isFile());//true

        //获取文件的最后一次修改时间
        long haomiao = f1.lastModified();//返回的是一个毫秒，这个毫秒是从1970年到现在的总毫秒数
        //将总毫秒数转换成日期
        Date time = new Date(haomiao);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String strTime = sdf.format(time);
        System.out.println(strTime);

        //获取文件大小
        System.out.println(f1.length());//获取文件大小，单位是字节
    }
}
