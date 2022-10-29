package com.baidu.javase.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest01 {
    public static void main(String[] args) {
        //创建一个集合对象
        //Collection c = new Collection();//接口是抽象的，无法实例化。

        //多态
        Collection c = new ArrayList();

        //测试Collection接口中的常用方法
        c.add(1200);//自动装箱，实际上是放进去了一个对象的内存地址。实际上是：Integer x = new Integer(1200);
        c.add(3.14);//自动装箱
        c.add(new Object());
        c.add(new Student());
        c.add(true);//自动装箱
    }
}

class Student{

}
