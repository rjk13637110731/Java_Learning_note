package com.baidu.javase.exception;

public class ExceptionTest13 {
    public static void main(String[] args) {
        try{
            System.out.println("try...");
            System.exit(0);//退出JVM
        }finally{
            //退出JVM虚拟机之后，finally语句块中的代码就不再执行了！
            System.out.println("finally...");
        }
    }
}
