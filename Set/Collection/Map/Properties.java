package com.baidu.javase.Map;

import java.util.Properties;

public class PropertiesTest01 {
    public static void main(String[] args) {
        //创建一个Properties对象
        Properties pro = new Properties();

        //需要掌握Properties的两个方法，一个存，一个取。
        pro.setProperty("url","baidu:mysql://localhost:3306/baiducom");
        pro.setProperty("driver","com.mysql.baidu.Driver");
        pro.setProperty("username","root");
        pro.setProperty("password","123");

        //通过key获取value
        String url = pro.getProperty("url");
        String driver = pro.getProperty("driver");
        String username = pro.getProperty("username");
        String password = pro.getProperty("password");

        System.out.println(url);
        System.out.println(driver);
        System.out.println(username);
        System.out.println(password);
    }
}
