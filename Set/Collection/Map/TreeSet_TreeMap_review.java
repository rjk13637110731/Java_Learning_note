package com.baidu.javase.Map.reviewList;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        //集合的创建（可以测试下TreeSet集合中存储String/Integer的，这些类都是SUN写好的。）
        //编写比较器可以改变规则
        TreeSet<Integer> ts = new TreeSet<>(new Comparator<Integer>() {//传入比较器是可以实现降序排列
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 -o1;//自动拆箱
            }
        });

        //添加元素
        ts.add(1);
        ts.add(100);
        ts.add(10);
        ts.add(0);
        ts.add(10);
        ts.add(10);
        ts.add(10);

        //遍历：迭代器方式
        Iterator<Integer> it = ts.iterator();
        while (it.hasNext()){
            //测试TreeSet集合中的元素是可排序的
            System.out.println(it.next());
        }

        //遍历：foreach方式
        for (Integer i : ts){
            System.out.println(i);
        }

        //创建TreeSet集合对象，存储自定义数据类型
        TreeSet<A> atree = new TreeSet<>();
        atree.add(new A(100));
        atree.add(new A(200));
        atree.add(new A(500));
        atree.add(new A(300));
        atree.add(new A(400));
        atree.add(new A(1000));

        //遍历
        for (A a : atree){
            System.out.println(a);
        }

        TreeSet<B> btree = new TreeSet<>(new BComparator());
        btree.add(new B(500));
        btree.add(new B(100));
        btree.add(new B(200));
        btree.add(new B(600));
        btree.add(new B(300));
        btree.add(new B(50));

        for (B b : btree){
            System.out.println(b);
        }

        TreeSet<C> ctree = new TreeSet<>(new Comparator<C>() {
            @Override
            public int compare(C o1, C o2) {
                return o2.i - o1.i;
            }
        });
        ctree.add(new C(50000));
        ctree.add(new C(10000));
        ctree.add(new C(20000));
        ctree.add(new C(60000));
        ctree.add(new C(30000));
        ctree.add(new C(5000));

        for (C c : ctree){
            System.out.println(c);
        }
    }
}

//第一种方式：实现Comparable接口的
class A implements Comparable<A>{
    int i;

    public A(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "A{" +
                "i=" + i +
                '}';
    }

    @Override
    public int compareTo(A o) {
        return this.i - o.i;
    }
}

//第二种方式：单独写个类比较器，实现Comparator接口，第一个方式
class B{
    int i;

    public B(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "B{" +
                "i=" + i +
                '}';
    }
}
//比较器
class BComparator implements Comparator<B>{

    @Override
    public int compare(B o1, B o2) {
        return o1.i - o2.i;
    }
}

//第二种方式：单独写个类比较器，实现Comparator接口，第二个方式，匿名内部类
class C{
    int i;

    public C(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "C{" +
                "i=" + i +
                '}';
    }
}
