package com.baidu.javase.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericTest01 {
    public static void main(String[] args) {
        //先不使用泛型机制，分析程序存在缺点
        List myList = new ArrayList();

        //准备对象
        Cat c = new Cat();
        Bird b = new Bird();

        //将对象添加到集合当中
        myList.add(c);
        myList.add(b);

        //遍历集合，取出每个Animal，让它move
        Iterator it = myList.iterator();
        while (it.hasNext()) {

            //通过迭代器取出的就是Object
            //Animal a = it.next();//出错，没有这个语法。

            Object obj = it.next();
            //obj中没有move()方法，无法调用，需要向下转型!
            if (obj instanceof Animal){
                Animal a = (Animal)obj;
                a.move();
            }

            /*
            Object obj = it.next();
            if (obj instanceof Cat){
                ((Cat) obj).catchMouse();
            }else if(obj instanceof Bird){
                ((Bird) obj).fly();
            }
             */
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
