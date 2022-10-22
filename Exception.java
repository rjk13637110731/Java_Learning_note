package com.baidu.javase.exception;

public class ExceptionTest02 {
    public static void main(String[] args) {
        //通过异常类实例化“异常对象”
        NumberFormatException nfe = new NumberFormatException("数字格式化异常！");

        //输出信息：java.lang.NumberFormatException: 数字格式化异常！
        System.out.println(nfe);

        //通过"异常类"创建"异常对象"
        NullPointerException npe = new NullPointerException("空指针异常发生了！");

        //输出结果：java.lang.NullPointerException: 空指针异常发生了！
        System.out.println(npe);
    }
}
