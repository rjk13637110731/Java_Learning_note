package com.baidu.javase.chapter23.baidu.com.javase.Bean;

//序列化

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.PushbackInputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectOutputStreamTest02 {
    public static void main(String[] args) throws Exception{
        List<User> userList = new ArrayList<>();
        userList.add(new User(1,"zhangsan"));
        userList.add(new User(2,"lisi"));
        userList.add(new User(3,"wangwu"));
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("users"));

        //序列化一个集合，这个集合对象中放了很多其他对象。
        oos.writeObject(userList);

        oos.flush();

        oos.close();
    }
}
