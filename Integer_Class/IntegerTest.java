package com.baidu.javase.array.integer;

public class IntegerTest01 {
    //入口
    public static void main(String[] args) {
        //有没有这种需求：调用doSome()方法的时候，需要传入一个数字进去。
        //但是数字是基本数据类型，而doSome()方法参数的类型是Object。
        //可见doSome()方法是无法接收基本数据类型的数字。那怎么办？可以传入一个数字对应的包装类进去。

        //把100这个数字经过构造方法进行包装成对象。
        MyInt  myInt = new MyInt(100);
        //doSome()方法虽然不能直接传100数字，但是可以传一个100对应的包装类型。
        doSome(myInt);
    }

    public static void doSome(Object obj){
        System.out.println(obj);//100
    }
}
