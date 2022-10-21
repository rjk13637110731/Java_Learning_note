package com.baidu.javase.enum2;

//采用美剧的方式改造程序

public class EnumTest02 {
    public static void main(String[] args) {
        Result r = divide(10,0);
        System.out.println(r == Result.SUCCESS ? "计算成功" : "计算失败");

    }

    /**
     * 计算两个int数据类型的商
     * @param a int数据
     * @param b int数据
     * @return Result.SUCCESS表示成功，Result.FAIL表示失败。
     */
    public static Result divide(int a,int b){
        try{
            int c = a / b;
            return Result.SUCCESS;
        }catch (Exception e){
            return Result.FAIL;
        }
    }
}

//枚举：一枚一枚可以列举出来的，才建议使用枚举类型
//枚举编译之后也是生成class文件
//枚举也是一种引用数据类型。
//枚举中的每一个值，可以看做是常量。
enum Result{
    //SUCCESS 是枚举Result中的一个值，FAIL 也是枚举Result中的一个值。
    //枚举中的每一个值，可以看做是“常量”。
    SUCCESS,FAIL
}
