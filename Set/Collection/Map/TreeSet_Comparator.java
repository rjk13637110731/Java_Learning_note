package com.baidu.javase.Map;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTest06 {
    public static void main(String[] args) {
        //创建TreeSet集合的时候，需要使用这个比较器
        //TreeSet<WuGui> wuGuis = new TreeSet<>();//这样不行，没有通过构造方法传递一个比较器进去。

        //给构造方法传递一个比较器。
        TreeSet<WuGui> wuGuis = new TreeSet<>(new WuGuiComparator());

        wuGuis.add(new WuGui(1000));
        wuGuis.add(new WuGui(800));
        wuGuis.add(new WuGui(810));

        //遍历
        for (WuGui wuGui : wuGuis){
            System.out.println(wuGui);
        }
    }
}

//乌龟
class WuGui{
    int age;
    public WuGui(int age){
        this.age = age;
    }

    @Override
    public String toString() {
        return "小乌龟[" +
                "age=" + age +
                ']';
    }
}

//单独在这里编写一个比较器
//比较器实现java.util.Comparator接口。（Comparable是java.lang包下的，Comparator是java.util包下的。）
class WuGuiComparator implements Comparator<WuGui>{

    @Override
    public int compare(WuGui o1, WuGui o2) {
        //指定比较规则
        //按照年龄排序
        return o1.age - o2.age;
    }
}
