package com.baidu.javase.collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest01 {
    public static void main(String[] args) {
        //演示一下HashSet集合特点
        Set<String> strs = new HashSet<>();

        //添加元素
        strs.add("hello3");
        strs.add("hello4");
        strs.add("hello1");
        strs.add("hello2");
        strs.add("hello3");

        //遍历
        for (String s : strs){
            System.out.println(s);
        }
    }

}
