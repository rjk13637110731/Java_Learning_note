package com.baidu.javase.enum2;

public class SwitchTest01 {
    public static void main(String[] args) {

        //switch支持枚举类型。也支持String、int数据类型。
        //低版本的JDK只支持int，高版本的支持int、String、枚举。
        //byte、short、char也可以，因为存在自动类型转换。
        switch (Season.AUTUMN){
            case SPRING://必须省略Season.
                System.out.println("春天");
                break;
            case SUMMER:
                System.out.println("夏天");
                break;
            case AUTUMN:
                System.out.println("秋天");
                break;
            case WINTER:
                System.out.println("冬天");
                break;
            default:
                System.out.println("输入有误！");
                break;
        }
    }
}
