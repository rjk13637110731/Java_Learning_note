package com.baidu.javase.chapter23.baidu.com.javase.io;

import java.io.File;

public class FileTest01 {
    public static void main(String[] args) throws Exception {
        //创建一个File对象
        File f1 = new File("E:\\file");
        //判断路径是否存在！
        System.out.println(f1.exists());

        //如果E:\file不存在，则以文件的形式创建出来
        if (!f1.exists()){
            //以文件的形式新建
            f1.createNewFile();
        }

        //如果D:\file不存在，则以目录的形式创建出来
        if (!f1.exists()){
            //以目录的形式新建
            f1.mkdir();
        }

        //可以创建多重目录吗？可以
        File f2 = new File("E:/a/b/c/d/e/f");
        if (!f2.exists()){
            //以多重目录的形式新建
            f2.mkdirs();
        }

        File f3 = new File("E:\\a\\b\\c\\d\\e\\f\\123.doc");
        //获取文件的父路径
        String parentPath = f3.getParent();
        System.out.println(parentPath);//E:\a\b\c\d\e\f
        File parentFile = f3.getParentFile();
        System.out.println("获取绝对路径：" + parentFile.getAbsolutePath());//获取绝对路径：E:\a\b\c\d\e\f

        File f4 = new File("copy");
        System.out.println("获取绝对路径：" + f4.getAbsolutePath());//获取绝对路径：E:\JavaDocument\chapter16\copy
    }
}
