package com.baidu.javase.Date;

//获取自1970年1月1日 00:00:00 000到当前系统时间的总毫秒数

public class DateTest02 {
    public static void main(String[] args) {
        long nowTimeMills = System.currentTimeMillis();
        System.out.println(nowTimeMills);

        //统计一个方法耗时
        //在调用目标方法之前记录一个毫秒数
        long begin = System.currentTimeMillis();
        print();
        //在执行完目标方法之后记录一个毫秒数
        long end = System.currentTimeMillis();

        System.out.println("耗费时长为：" + (end-begin) + "毫秒");
    }

    //需求：统计一个方法执行所需的时长
    public static void print(){
        for (int i = 0;i < 1000000;i++){
            //System.out.println("i = " + i);
        }
    }
}
