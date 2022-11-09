package com.baidu.javase.Map.reviewList;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {
        //创建Map集合
        Map<Integer,String> map = new HashMap<>();

        //添加元素
        map.put(1,"zhangsan");
        map.put(9,"lisi");
        map.put(10,"wangwu");
        map.put(2,"king");
        map.put(2,"simith");//key可以重复，value会被覆盖

        //获取元素个数
        System.out.println(map.size());//4

        //取key是2的元素
        System.out.println(map.get(2));

        //遍历Map集合，几种方式都要会
        //第一种方式：先获取所有的key，遍历key的时候，通过key获取value
        Set<Integer> keys = map.keySet();
        for (Integer key : keys){
            System.out.println(key + " = " + map.get(key));
        }

        //第二种方式：是将Map集合转换成Set集合，Set集合中每一个元素是Node，节点
        //这个Node节点中，有key和value
        Set<Map.Entry<Integer,String>> nodes = map.entrySet();
        for (Map.Entry<Integer,String> node : nodes){
            System.out.println(node.getKey() + " <===> " + node.getValue());
        }
    }
}
