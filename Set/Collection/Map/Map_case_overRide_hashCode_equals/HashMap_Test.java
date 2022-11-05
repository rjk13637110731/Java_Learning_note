package com.baidu.javase.Map;

import java.util.HashSet;
import java.util.Set;

public class HashMapTest02 {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan");
        Student s2 = new Student("zhangsan");

        //重写equals之前是false。
        //System.out.println(s1.equals(s2));//false

        //重写equals之后：
        System.out.println(s1.equals(s2));//true（s1和s2表示相等）

        /*System.out.println("s1的hashCode = " + s1.hashCode());//1324119927
        System.out.println("s2的hashCode = " + s2.hashCode());//81628611

        //s1.equals(s2)结果已经是true了，表示s1和s2是一样的，相同的，那么往HashSet集合中放的话，
        //按道理说只能放进去一个。（HashSet集合特点：无序不可重复。）
        Set<Student> students = new HashSet<>();
        students.add(s1);
        students.add(s2);
        System.out.println(students.size());//这个结果按说应该是1。但是这个结果是2，显然不符合HashSet集合存储的特点。怎么办？*/

        //重写hashCode()方法之后
        System.out.println("s1的hashCode = " + s1.hashCode());//-1432604525
        System.out.println("s2的hashCode = " + s2.hashCode());//-1432604525

        Set<Student> students = new HashSet<>();
        students.add(s1);
        students.add(s2);
        System.out.println(students.size());//1
    }
}
