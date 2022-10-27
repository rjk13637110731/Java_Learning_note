package com.baidu.javase.array.Homework.Weapon1;

public class WuZiJi extends Weapon implements Moveable{
    //只能移动

    @Override
    public void move() {
        System.out.println("运输机起飞！");
    }
}
