package com.baidu.javase.chapter23.baidu.com.javase.io;

//反序列化

/*
java.io.InvalidClassException:
com.baidu.javase.chapter23.baidu.com.javase.Bean.Student;
local class incompatible:
stream classdesc serialVersionUID = -5135977285039870700, (十年前)
local class serialVersionUID = 8611361750127462991(十年后)
 */

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputStreamTest01{
    public static void main(String[] args) throws Exception{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("students"));

        //开始反序列化，读
        Object obj = ois.readObject();

        //反序列化回来是一个学生对象，所以会调用学生对象的toString()方法。
        System.out.println(obj);
        ois.close();
    }
}
