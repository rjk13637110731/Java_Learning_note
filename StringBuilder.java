package com.baidu.javase.array.StringBuffer;

public class StringBuilderTest {
    public static void main(String[] args) {
        //初始容量也是16
        //使用StringBuilder也是可以完成字符串的拼接。
        StringBuilder sb = new StringBuilder();

        sb.append(100);
        sb.append(true);
        sb.append("hello");
        sb.append("kitty");

        System.out.println(sb);
    }
}
