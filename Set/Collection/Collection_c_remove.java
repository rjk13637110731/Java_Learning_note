package com.baidu.javase.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest06 {
    public static void main(String[] args) {
        Collection c2 = new ArrayList();
        c2.add("abc");
        c2.add("def");
        c2.add("xyz");

        //遍历
        Iterator it2 = c2.iterator();
        while (it2.hasNext()){
            Object o = it2.next();

            //删除元素
            // 删除元素后，集合的结构发生了变化，应该重新去获取迭代器
            //但是循环下一次的时候，并没有重新获取迭代器，所以会出现异常：java.util.ConcurrentModificationException
            c2.remove(o);

            System.out.println(o);
        }
    }
}
