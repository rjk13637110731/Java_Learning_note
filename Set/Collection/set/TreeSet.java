package com.baidu.javase.collection;

import java.util.HashSet;
import java.util.Set;

public class TreeSetTest {
    public static void main(String[] args) {
        //创建集合对象
        Set<String> strs = new HashSet<>();

        //添加元素
        strs.add("A");
        strs.add("C");
        strs.add("Z");
        strs.add("X");
        strs.add("B");
        strs.add("C");

        //遍历，从小到大自动排序
        for (String s : strs){
            System.out.println(s);
        }
    }
}
