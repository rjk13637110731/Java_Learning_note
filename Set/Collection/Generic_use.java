package com.baidu.javase.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericTest01 {
    public static void main(String[] args) {
        //使用JDK5.0之后的泛型机制
        //使用泛型 List<Animal>之后，表示List集合中只允许存储Animal类型的数据，其他类型不允许存储。
        //用泛型来指定集合中存储的数据类型。
        List<Animal> myList = new ArrayList<Animal>();

        //指定List集合中只能存储Animal，那么存储String就编译报错了。
        //这样用了泛型之后，集合中元素的数据类型更加统一了。
        //myList.add("abc");//报错，因为"abc"是字符串，不是Animal类型数据。

        //准备对象
        Cat c = new Cat();
        Bird b = new Bird();

        //向集合中添加元素
        myList.add(c);
        myList.add(b);

        //获取迭代器，遍历
        //这个Iterator<Animala>表示迭代器迭代的是Animal类型。
        Iterator<Animal> it = myList.iterator();
        while (it.hasNext()){
           /*
            //使用泛型之后，每一次迭代返回的数据都是Animal类型。
            Animal a = it.next();
            //这里不需要强制类型转换，直接调用。
            a.move();
            */

            //调用子类型特有的方法还是需要向下转型的！
            Animal a = it.next();
            if (a instanceof Cat){
                Cat x = (Cat) a;
                x.catchMouse();
            }else if (a instanceof Bird){
                Bird y = (Bird)a;
                y.fly();
            }
        }
    }
}

class Animal {
    //父类自带方法
    public void move(){
        System.out.println("动物在移动！");
    }
}

class Cat extends Animal{
    //特有方法
    public void catchMouse(){
        System.out.println("猫捉老鼠！");
    }
}

class Bird extends Animal{
    //特有方法
    public void fly(){
        System.out.println("鸟儿在飞翔！");
    }
}
