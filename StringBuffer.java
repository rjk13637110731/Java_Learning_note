package com.baidu.javase.array.StringBuffer;

public class StringBufferTest02 {
    public static void main(String[] args) {
        //无参构造
        //创建一个初始化容量为16个byte[] 数组。（字符串缓冲区对象）
        StringBuffer stringBuffer = new StringBuffer();

        //拼接字符串，以后拼接字符串统一用append()方法。append是追加的意思。
        //append()方法底层在进行追加的时候，如果byte数组满了，会自动扩容。
        stringBuffer.append("a");
        stringBuffer.append("b");
        stringBuffer.append("d");
        stringBuffer.append(3.14);
        stringBuffer.append(true);
        stringBuffer.append(100L);

        System.out.println(stringBuffer);

        //有参构造
        //指定初始化容量的StringBuffer对象（字符串缓冲区对象）
        StringBuffer sb = new StringBuffer(100);
        sb.append("hello");
        sb.append("world");
        sb.append("hello");
        sb.append("Kitty");

        System.out.println(sb);
    }
}
