package com.baidu.javase.array.Homework.Weapon1;

public class GaoShePao extends Weapon implements Shootable {
    //只能攻击，不能移动
    @Override
    public void shoot() {
        System.out.println("高射炮开炮！");
    }
}
