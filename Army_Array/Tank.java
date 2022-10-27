package com.baidu.javase.array.Homework.Weapon1;

public class Tank extends Weapon implements Moveable,Shootable{
    @Override
    public void move() {
        System.out.println("坦克移动！");
    }

    @Override
    public void shoot() {
        System.out.println("坦克开炮！");
    }
}
