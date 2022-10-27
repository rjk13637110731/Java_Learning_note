package com.baidu.javase.array.Homework.Weapon1;

public class Test {
    public static void main(String[] args) {
        //创建一个军队对象
        Army army = new Army(4);//军队只有4个武器

        //创建武器对象
        Fighter fighter = new Fighter();
        Fighter fighter2 = new Fighter();
        Tank tank = new Tank();
        WuZiJi wuZiJi = new WuZiJi();
        GaoShePao gaoShePao = new GaoShePao();

        //添加武器
        try {
            army.addWeapon(fighter);
            army.addWeapon(tank);
            army.addWeapon(wuZiJi);
            army.addWeapon(gaoShePao);
            army.addWeapon(fighter2);
        } catch (AddWeaponException e) {//接住上面抛过来的异常
            System.out.println(e.getMessage());;
        }

        //让所有可移动的移动
        army.moveAll();
        //让所有可攻击的攻击
        army.attackAll();
    }
}