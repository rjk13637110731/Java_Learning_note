package com.baidu.javase.exception;

public class ExceptionTest12 {
    public static void main(String[] args) {
        /*
        try和finally，没有catch语句块可以吗？可以。
        try不能单独使用。

        以下代码执行的顺序：
            先执行try...
            再执行finally...
            最后执行return(return只要执行，方法必然结束)
         */
        try{
            System.out.println("try...");
            return;
        }finally{
            System.out.println("finally...");//finally中的这行代码一定会执行。能执行到。
        }

        //System.out.println("hello world");//这里不能写语句，因为这个代码是无法执行到的。
    }
}
