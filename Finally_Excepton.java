package com.baidu.javase.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest11 {
    public static void main(String[] args) {
        FileInputStream fis = null;//声明的位置放到try外，这样在finally中才能用。
        try {
            //创建输入流对象
            fis = new FileInputStream("F:\\BaiduNetdiskDownload\\学习方法.txt");

            //开始读文件...
            String s = null;
            //这里一定出现空指针异常！
            s.toString();
            System.out.println("Hello kitty");

            //流使用完需要关闭，因为流是占用资源的
            //即使以上程序出现异常，流也必须关闭。放在这里有可能流关不了。
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }catch (NullPointerException e){
            e.printStackTrace();
        }finally{

            System.out.println("hello  hook");

            //流的关闭放在这里比较保险
            //finally中的代码一定会执行的，即使try中的代码出现了异常。
            if(fis != null){//避免空指针异常。
                try {
                    //close()方法有异常，采用捕捉的方式处理。
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println("Hello world!");
    }
}
