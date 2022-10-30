package com.baidu.javase.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest06 {
    public static void main(String[] args) {
        //创建集合
        Collection c = new ArrayList();

        //获取迭代器
        //注意：此时获取的迭代器，指向的是那时集合中没有元素状态下的迭代器。
        //一定要注意：集合结构只要发生改变，迭代器必须重新获取。
        //当集合结构发生改变时，迭代器没有重新获取，调用next()方法时会出现此异常：java.util.ConcurrentModificationException
        Iterator it = c.iterator();

        //添加元素
        c.add(1);//Integer类型
        c.add(2);
        c.add(3);

        while(it.hasNext()){
            //编写代码时，next()返回值类型必须是Object类型
            Object obj = it.next();
            System.out.println(obj);
        }
    }
}
