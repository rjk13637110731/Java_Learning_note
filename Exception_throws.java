package com.baidu.javase.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest06 {
    public static void main(String[] args) throws IOException {
        System.out.println("main begin");
        m1();
        System.out.println("main over");
    }

    public static void m1() throws IOException {
        System.out.println("m1 begin");
        m2();
        System.out.println("m1 over");
    }

    public static void m2() throws IOException {//抛别的不行，抛FileNotFoundException的父对象IOException这样是可以的。
        //因为IOException包括FileNotFoundException，或者直接抛Exception也可以，throws后面也可以写多个异常，可以是用逗号隔开。
        System.out.println("m2 begin");

        //编译器报错的原因：m3()方法声明的位置上有：throws FileNotFoundException
        //我们在调用m3()没有对异常进行预处理，所以编译器报错。
        m3();
        System.out.println("m2 begin");
    }
    public static void m3() throws FileNotFoundException {
        //调用SUN JDK 中某个类的构造方法
        //这个累还没接触过，后期IO流的时候就知道了，我们只是借助这个类学习一下异常处理机制
        //创建一个输入流对象，该流指向一个文件

        /*
            编译报错的原因是什么？
            第一：这里调用了一个构造方法：FileInputStream(String name)
            第二：这个构造方法的声明位置上有：throws FileNotFoundException
            第三：通过类的继承结构看到：FileNotFoundException父类是IOException，IOException的父类是Exception，
                  最终得知，FileNotFoundException是编译时异常。
            错误原因：编译时异常要求程序员编写程序阶段必须对它进行处理，不处理编译器就报错。
         */
        //new FileInputStream("F:\\BaiduNetdiskDownload\\学习方法.txt")

        //我们采用第一种处理方式：在方法声明的位置上使用throws继续上抛。
        new FileInputStream("F:\\BaiduNetdiskDownload\\学习方法.txt");
    }
}
