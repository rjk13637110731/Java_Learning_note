package com.baidu.javase.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayTest01 {
    public static void main(String[] args) {
        //默认初始化容量是10
        //数组的长度是10
        List list1 = new ArrayList();
        //集合的size()方法获取的是当前集合中元素的个数，不是获取集合的容量。
        System.out.println(list1.size());

        //指定初始化容量是20
        //数组的长度是20
        List list2 = new ArrayList(20);
        System.out.println(list2.size());

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(7);
        list1.add(8);
        list1.add(9);
        list1.add(10);
        System.out.println(list1.size());

        //再增加一个元素
        list1.add(11);
        System.out.println(list1.size());
        //100 二进制转换成10进制：00000100右移一位00000010（2）【4/2】
        //原先是4，现在增长是2，增长之后是6，增长之后的容量是之前容量的1.5倍，6是4的1.5倍。
    }
}
