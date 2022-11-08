package com.baidu.javase.Map;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTest061 {
    public static void main(String[] args) {
        //创建TreeSet集合的时候，需要使用这个比较器
        //TreeSet<WuGui> wuGuis = new TreeSet<>();//这样不行，没有通过构造方法传递一个比较器进去。

        //大家可以使用匿名内部类的方式（这个类没有名字，直接new接口。）
        TreeSet<WuGui1> wuGuis = new TreeSet<>(new Comparator<WuGui1>() {
            @Override
            public int compare(WuGui1 o1, WuGui1 o2) {
                return o1.age - o2.age;
            }
        });

        wuGuis.add(new WuGui1(1000));
        wuGuis.add(new WuGui1(800));
        wuGuis.add(new WuGui1(810));

        //遍历
        for (WuGui1 wuGui : wuGuis){
            System.out.println(wuGui);
        }
    }
}

//乌龟
class WuGui1{
    int age;
    public WuGui1(int age){
        this.age = age;
    }

    @Override
    public String toString() {
        return "小乌龟[" +
                "age=" + age +
                ']';
    }
}
