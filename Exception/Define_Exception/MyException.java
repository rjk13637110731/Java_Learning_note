package com.baidu.javase.exception;

public class MyException extends Exception{//编译时异常
    public MyException(){

    }

    public MyException(String s){
        super(s);
    }
}

/*
public class MyException extends RuntimeException{//运行时异常

}
 */
