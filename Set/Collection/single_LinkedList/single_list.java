package com.baidu.javase.collection;

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
    }
}
