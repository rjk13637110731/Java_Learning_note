package com.baidu.javase.array.Homework.Weapon1;

public class Army {
    //武器数组
    private Weapon[] weapons;
    public Army(int count){
        //动态初始化，数组中每一个元素默认值是null。
        //武器数组是有了，但是武器数组里面没有放武器。
        weapons = new Weapon[count];
    }

    public void addWeapon(Weapon weapon) throws AddWeaponException {
        //武器数组中放武器
        for (int i = 0;i < weapons.length;i++){
            if (null == weapons[i]){
                weapons[i] = weapon;
                System.out.println(weapon + "武器添加成功！");
                return;
            }
        }
        //程序执行到此处说明：武器没有添加成功
        throw new AddWeaponException("武器数量已达到上限！");
    }

    public void attackAll(){
        //所有可移动的武器攻击
        for (int i = 0;i < weapons.length;i++){
            if (weapons[i] instanceof Shootable){
                //调用子类特有方法，需要强制转型
                Shootable shootable = (Shootable) weapons[i];//强转
                shootable.shoot();
            }
        }
    }

    public void moveAll(){
        //所有可移动的武器移动
        for (int i = 0;i < weapons.length;i++){
            if (weapons[i] instanceof Moveable){
                //调用子类特有方法，需要强制转型
                Moveable moveable = (Moveable) weapons[i];//强转
                moveable.move();
            }
        }
    }
}
