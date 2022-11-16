package com.baidu.javase.chapter23.baidu.com.javase.Bean;

import java.io.Serializable;

public class Student implements Serializable {
    //Java虚拟机看到Serializable接口之后，会自动生成一个序列化版本号。
    //这里没有手动写出来，Java虚拟机会默认提供这个序列化版本号。
    private int no;
    private String name;

    public Student(){

    }

    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    @Override
    public String toString() {
        return "Student{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
