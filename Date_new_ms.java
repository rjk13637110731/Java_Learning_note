package com.baidu.javase.Date;

import sun.jvm.hotspot.code.CompressedStream;

import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest03 {
    public static void main(String[] args) {
        //这个时间什么意思？
        //1970-01-01 00:00:00 001
        Date time = new Date(1);//参数是1个毫秒

        SimpleDateFormat sfd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String str = sfd.format(time);
        //北京是东8区，差八个小时。
        System.out.println(str);//1970-01-01 08:00:00 001

        //获取昨天的此时时间？
        Date time2 = new Date(System.currentTimeMillis() - 24*60*60*1000);
        String str2 = sfd.format(time2);
        System.out.println(str2);//2022-10-20 08:29:15 363
    }
}
