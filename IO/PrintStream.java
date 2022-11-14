package com.baidu.javase.chapter23.baidu.com.javase.io;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamTest {
    public static void main(String[] args) throws Exception {
        //联合起来写
        System.out.println("Hello world！");

        //分开写
        PrintStream ps = System.out;
        ps.println("Hello Zhangsan!");
        ps.println("Hello Lisi");
        ps.println("Hello kitty");

        //标准输出流不需要手动close()关闭
        //可以改变标准输出流的输出方向吗？可以
        /*
        //这些是之前System类使用过的方法和属性。
        System.gc();
        System.currentTimeMillis();
        PrintStream ps2 = System.out;
        System.exit(0);
        System.arraycopy(....);
        */

        //标准输出流不再指向控制台，指向“log”文件。
        PrintStream printStream = new PrintStream(new FileOutputStream("log"));
        //修改输出方向，将输出方向更改到“log”文件。
        System.setOut(printStream);
        //再输出到log文件中了。
        System.out.println("hello World!");
        System.out.println("hello Zhangsan!");
        System.out.println("hello Kitty!");
    }
}
