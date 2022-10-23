package com.baidu.javase.exception;

public class ExceptionTest05 {
    public static void main(String[] args) {
        //第二种处理方式：try...catch进行捕捉
        //捕捉等于把异常拦下来，异常真正的解决了，调用者是不知道的。
        //Alt+Enter快捷键
        try {
            doSome();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void doSome() throws ClassNotFoundException{
        System.out.println("doSome!!!");
    }
}
