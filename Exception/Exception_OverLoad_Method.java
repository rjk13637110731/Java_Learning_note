package com.baidu.javase.exception;

public class ExceptionTest17 {
    public static void main(String[] args) {

    }
}

class Animal{
    public void doSome(){

    }

    public void doOther() throws Exception{

    }
}

class Cat extends Animal{
    //编译报错
    public void doSome() throws Exception{

    }

    //编译正常
    public void doOther() {//方法重写可以不抛异常

    }

    //编译正常
    public void doOther() throws Exception{//方法重写可以抛父类相同异常

    }

    //编译正常
    public void doOther() throws NullPointerException{//方法重写可以抛出比父类更小的异常

    }
}
