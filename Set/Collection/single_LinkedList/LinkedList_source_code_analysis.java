package com.baidu.javase.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest01 {
    public static void main(String[] args) {
        //LinkedList集合底层也是有下标的。
        //注意：ArrayList之所以检索效率比较高，不是单纯因为下标的原因。是因为底层数组发挥的作用。
        //LinkedList集合照样有下标，但是检索/查找某个元素的时候效率比较低，因为只能从头结点开始一个一个遍历。
        List list = new LinkedList();
        list.add("a");
        list.add("b");
        list.add("c");

        for (int i = 0;i < list.size();i++){
            Object obj = list.get(i);
            System.out.println(obj);
        }

        //LinkedList集合没有初始化容量
        //最初这个链表没有任何元素，first和last引用都是null
        //不管是LinkedList还是ArrayList，以后写代码时不需要关心具体是哪个集合。
        //因为我们要面向接口编程，调用的方法都是 接口中的方法。

        //List list2 = new LinkedList();//这样写表示底层你使用了双向链表。
        List list2 = new ArrayList();//这样写表示底层你使用了数组。

        //以下这些方法，你面向的都是接口编程
        list2.add("123");
        list2.add("456");
        list2.add("789");
        for (int i = 0;i < list2.size();i++){
            System.out.println(list2.get(i));
        }
    }
}
