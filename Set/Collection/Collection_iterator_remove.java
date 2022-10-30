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
            //c2.remove(o);//直接通过集合去删除元素，没有通知迭代器，导致迭代器的快照和原集合状态不同。

            //出异常根本原因是：集合中的元素删除了，但是没有更新迭代器。（迭代器不知道集合变化了）
            //使用迭代器来删除元素，可以吗？
            //迭代器去删除时，会自动更新迭代器，并且更新集合。（删除集合中的元素）
            it2.remove();//删除的一定是迭代器指向的当前元素。

            System.out.println(o);
        }
        System.out.println(c2.size());//0
    }
}
