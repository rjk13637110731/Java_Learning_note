package com.baidu.javase.Map;

import java.util.TreeSet;

public class TreeSetTest05 {
    public static void main(String[] args) {
        TreeSet<Vip> vips = new TreeSet<>();

        vips.add(new Vip("zhangsi",20));
        vips.add(new Vip("zhangsan",20));
        vips.add(new Vip("king",18));
        vips.add(new Vip("soft",17));

        for (Vip vip : vips){
            System.out.println(vip);
        }
    }
}

class Vip implements Comparable<Vip>{
    String name;
    int age;

    public Vip(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Vip{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Vip v) {
        //写排序规则，按照什么进行比较。
        if (this.age == v.age){
            //年龄相同时，按照名字排序。
            //姓名是String类型，可以直接比较，调用compareTo()方法来完成比较。
            return this.name.compareTo(v.name);
        }else{
            //年龄不一样
            return this.age - v.age;
        }
    }
}
