package com.baidu.javase.exception;

public class ExceptionTest04 {
    public static void main(String[] args) {
        //main方法中调用doSome()方法
        //因为doSome()方法声明的位置上有：throws ClassNotFoundException，我们在调用doSome()方法的时候，必须对
        //这种异常进行预先处理。如果不处理，编译器就报错。
        doSome();//报错
    }

    /**
     * doSome()方法在方法声明的位置上使用了：throws ClassNotFoundException
     * 这个代码表示doSome()方法在执行过程中，有可能会出现ClassNotFoundException异常。
     * 叫做类没找到异常。这个异常直接父类时候：Exception，所以ClassNotFoundException属于编译时异常。
     * @throws ClassNotFoundException
     */
    public static void doSome() throws ClassNotFoundException{
        System.out.println("doSome!!!");
    }
}
