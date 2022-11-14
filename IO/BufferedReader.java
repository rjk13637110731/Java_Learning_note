package com.baidu.javase.chapter23.baidu.com.javase.io;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferReaderTest {
    public static void main(String[] args) throws Exception{//抛出异常，省劲，不能这样写，按照之前的框架写就可以。
        FileReader reader = new FileReader("temp");
        //当一个流的构造方法中，需要一个流的时候，这个被传进来的流叫做：节点流。
        //外部负责包装的这个流叫做：包装流，还有一个名字叫做：处理流。
        //像当前这个程序来说：FileReader就是一个节点流，BufferedReader就是包装流/处理流。
        BufferedReader br = new BufferedReader(reader);

        /*
        //读一行
        String firstLine = br.readLine();
        System.out.println(firstLine);

        String secondLine = br.readLine();
        System.out.println(secondLine);

        String thirdLine = br.readLine();
        System.out.println(thirdLine);
        */

        //使用循环读取每一行，读到最后，没有任何字符，返回null。
        //br.readLine()方法读的是一行，但不包含换行符，后边的换行符没有读出来。
        String s = null;
        while ((s = br.readLine()) != null){
            System.out.println(s);
        }

        //关闭流
        //只需要关闭包装流/处理流，不需要关闭节点流，源代码中，包装流调用close()函数时，里面的节点流会自动调用节点流关闭。
        br.close();
    }
}
