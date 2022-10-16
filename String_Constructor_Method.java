package com.baidu.javase.String;

public class StringTest04 {
    public static void main(String[] args) {
        //创建字符串最常用的一种方式：
        String s1 = "hello world!";
        //s1这个变量中保存的是一个内存地址，按说以下输出应该是一个地址。
        //但是输出一个字符串，说明String类已经重写了toString()方法。
        System.out.println(s1);//输出结果：hello world!
        System.out.println(s1.toString());

        //只掌握常用的构造方法
        byte[] bytes = {97,98,99};//97是a，98是b，99是c
        String s2 = new String(bytes);
        //在这里会输出内存地址码？
        //前面说过：输出一个引用的时候，会自动调用toString()方法，默认Object的话，会自动输出对象的内存地址。
        //通过输出结果，我们得出一个结论：String类已经重写了toString()方法。
        //输出字符串对象的话，输出的不是对象的内存地址，而是字符串本身。
        System.out.println(s2);//输出结果为：abc
        System.out.println(s2.toString());//输出结果为：abc

        //String(字节数组，数组元素下标的起始位置，长度);
        //将byte数组中的一部分转换成字符串。
        String s3 = new String(bytes,1,2);
        System.out.println(s3);//bc

        //将char数组全部转换成字符串
        char[] chars = {'我','是','中','国','人'};
        String s4 = new String(chars);
        System.out.println(s4);

        //将char数组的一部分转换成字符串
        String s5 = new String(chars,2,3);
        System.out.println(s5);

        String s6 = new String("hello world!");
        System.out.println(s6);
    }
}
