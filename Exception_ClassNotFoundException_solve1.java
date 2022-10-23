package com.baidu.javase.exception;

public class ExceptionTest05 {
    //第一种处理方式：在方法声明的位置上继续使用throws，来完成异常的继续上抛。抛给调用者。
    //上抛类似于推卸责任。（继续把异常传给调用者）
    //在出异常处：Alt+Enter快速选择和添加上抛代码
    public static void main(String[] args) throws ClassNotFoundException {
        doSome();
    }

    public static void doSome() throws ClassNotFoundException{
        System.out.println("doSome!!!");
    }
}
