package com.baidu.javase.enum2;//标识符，关键字不能做标识符。enum是关键字

public class EnumTest01 {
    public static void main(String[] args) {
        //System.out.println(10/0);//报错，异常：java.lang.ArithmeticException: / by zero
        int retValue = divide(10,2);
        System.out.println(retValue == 1? "计算成功":"计算失败");

        int retValue2 = divide(10,0);
        System.out.println(retValue2 == 0? "计算失败":"计算成功");

        System.out.println("===================================");
        
        boolean retValue3 = divide2(10,2);
        System.out.println(retValue3 == true? "计算成功":"计算失败");

        boolean retValue4 = divide2(10,0);
        System.out.println(retValue4 == false? "计算失败":"计算成功");
    }

    /**
     * 以下程序，计算两个int类型数据的商，计算成功返回1，计算失败返回0。
     * @param a int类型的数据
     * @param b int类型的数据
     * @return 返回1表示成功，返回0表示失败！
     */
    public static int divide(int a,int b){
        try{
            int c = a/b;
            //程序执行到此处表示以上代码没有发生异常，表示执行成功！
            return 1;
            //若 return 10; 返回10已经偏离了需求，实际上已经出错了，但是编译器没有查出来。
            //我们想一直追求的是：所有的错误尽可能的让编译器找出来，所有的错误越早发现越好。
        }catch (Exception e){
            //程序执行到此处，表示以上程序出现了异常，表示执行失败！
            return 0;
        }
    }

    //更改上述方法，这个设计不错。
    /**
     * 以下程序，计算两个int类型数据的商，计算成功返回1，计算失败返回0。
     * @param a int类型的数据
     * @param b int类型的数据
     * @return 返回1表示成功，返回0表示失败！
     */
    public static boolean divide2(int a,int b){
        try{
            int c = a/b;
            //程序执行到此处表示以上代码没有发生异常，表示执行成功！
            return true;
        }catch (Exception e){
            //程序执行到此处，表示以上程序出现了异常，表示执行失败！
            return false;
        }
    }
}
