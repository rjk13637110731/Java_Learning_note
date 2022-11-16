package com.baidu.javase.chapter23.baidu.com.javase.io;

import com.baidu.javase.chapter23.baidu.com.javase.Bean.Student;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/*
java.io.NotSerializableException
    Student对象不支持序列化！

    参与序列化和反序列化的对象，必须实现Serializable接口。
 */

public class ObjectOutputStreamTest01 {
    public static void main(String[] args) throws Exception{
        //创建Java对象
        Student s = new Student(1111,"zhangsan");
        
        //序列化
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("students"));

        //序列化对象
        oos.writeObject(s);

        //刷新
        oos.flush();

        //关闭
        oos.close();
    }
}
