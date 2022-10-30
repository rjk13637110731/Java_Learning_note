package com.baidu.javase.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class CollectionTest05 {
    public static void main(String[] args) {
        //创建集合对象
        Collection c = new ArrayList();

        //创建用户对象
        User u1 = new User("jack");
        User u2 = new User("jack");

        //加入集合
        c.add(u1);

        //判断集合中是否包含u2：没有重写equals()方法之前：
        //System.out.println(c.contains(u2));//false

        //重写equals()方法之后：比较的是name。
        System.out.println(c.contains(u2));//true
        c.remove(u2);
        System.out.println(c.size());//0，因为User类中重写了equals()方法。

        Integer x = new Integer(10000);
        c.add(x);

        Integer y = new Integer(10000);
        System.out.println(c.contains(y));//true，比较的是内容，Integer里面的equals()方法重写了。

        //创建集合对象
        Collection cc = new ArrayList();
        //创建字符串对象
        String s1 = new String("hello");
        //加进去
        cc.add(s1);
        //创建字符串对象
        String s2 = new String("hello");
        //删除s2对象
        cc.remove(s2);//s1.equals(s2) java认为s1和s2是一样的。删除s2就是删除s1。
        //集合中元素个数是多少？
        System.out.println(cc.size());//0
    }
}

class User{
    private String name;
    public User(){}
    public User(String name){
        this.name = name;
    }

    //重写equals()方法：
    //将来调用equals()方法的时候，一定是调用这个重写的equals()方法
    //这个equals()方法的比较原理是：只要姓名一样就表示同一个用户。
    @Override
    public boolean equals(Object o) {
        if (o == null || !(o instanceof User)) return false;
        if (o == this) return true;
        User u = (User)o;
        //如果两个名字一样表示同一个人。（不再比较对象的内存地址了，比较内容。）
        return u.name.equals(this.name);
    }
}
