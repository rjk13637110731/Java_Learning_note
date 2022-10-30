package com.baidu.javase.collection;

import java.util.*;

public class ListTest01 {
    public static void main(String[] args) {
        //创建List类型的集合
        //List myList = new LinkedList();
        //List myList = new Vector();
        List myList = new ArrayList();

        //添加元素
        myList.add("A");//默认都是向集合末尾添加元素。
        myList.add("B");
        myList.add("C");
        myList.add("C");
        myList.add("D");

        //在列表指定位置插入元素（第一个参数是下标），其余元素往后移
        //这个方法使用不多，因为对于ArrayList集合来说效率比较低。
        myList.add(1,"KING");

        //根据下标获取元素
        Object firstObj = myList.get(0);
        System.out.println(firstObj);

        System.out.println("==================");

        //因为有下标，所以List集合有自己比较特殊的遍历方式
        //通过下标遍历。List集合特有的方式，Set没有。
        for (int i = 0;i < myList.size();i++){
            Object obj = myList.get(i);
            System.out.println(obj);
        }

        System.out.println("==================");

        //获取指定对象第一次出现处的索引
        System.out.println(myList.indexOf("KING"));//1

        //获取指定对象最后一次出现处的索引
        System.out.println(myList.lastIndexOf("C"));//4

        //删除指定下标位置的元素
        //删除下标为0的元素
        myList.remove(0);
        System.out.println(myList.size());//5

        System.out.println("==================");

        //修改指定位置上的元素
        myList.set(2,"Soft");

        //迭代
        Iterator it = myList.iterator();
        while (it.hasNext()){
            Object o = it.next();
            System.out.println(o);
        }
    }
}
