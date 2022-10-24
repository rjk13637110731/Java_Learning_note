package com.baidu.javase.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest06 {
    public static void main(String[] args){        
        System.out.println("main begin");
        try {//try尝试
            m1();
        } catch (FileNotFoundException e) {//catch是捕捉异常走的分支。
            System.out.println("文件不存在，可能是路径错误，也可能该文件已经被删除！");
        }
        System.out.println("main over");
    }

    public static void m1() throws FileNotFoundException {
        System.out.println("m1 begin");
        m2();
        System.out.println("m1 over");
    }

    public static void m2() throws FileNotFoundException {
        System.out.println("m2 begin");
        m3();
        System.out.println("m2 begin");
    }
    public static void m3() throws FileNotFoundException {
        new FileInputStream("F:\\BaiduNetdiskDownload\\学习方法.txt");
    }
}
