package chapter25.src;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class AboutPath {
    public static void main(String[] args) throws FileNotFoundException {
        //这种方式的路径缺点是：移植性差，在IDEA中默认的当前路径是project的根。
        //这个代码假设离开了IDEA，换到了其他位置，可能当前路径就不是project的根了，这个时候这个路径就无效了。
        FileReader reader = new FileReader("chapter25/classinfo.properties");

        //接下来说一中比较通用的一种路径。几十代码更换位置了，这样编写仍然是通用的。
        //注意：使用以下通用方式的前提是：这个文件必须在类路径下。
        //什么是类路径下：凡是在src下的都是类路径下。（记住）
        //src是类的根路径。
        /*
            Thread.currentThread()   当前线程对象
            getContextClassLoader()  是线程对象的方法，可以获取到当前线程的类加载器对象
            getResource("")    （获取资源）是类加载器对象的方法，当前线程的类加载器默认从类的根路径下加载资源,从类的根路径下
                                开始写路径的。
         */
        String path = Thread.currentThread().getContextClassLoader().getResource("classinfo.properties").getPath();

        //采用以上代码可以拿到一个文件的绝对路径。
        System.out.println(path);//E:\JavaDocument\chapter16\src\chapter25\src\classinfo.properties
    }
}
