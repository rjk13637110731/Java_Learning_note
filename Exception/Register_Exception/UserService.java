package com.baidu.javase.exception;

public class UserService {
    public void register(String username,String password) throws RegisterException {
        int len = username.length();
        //引用等于null的这个判断最好放到前面，避免出现空指针异常。
        //username == null; 不如写成 null == username;避免出现少写一个等号，变成赋值操作。
        if (null== username || len < 6 || len > 14 ){
            RegisterException e = new RegisterException("用户名长度异常，长度必须在[6-14]之间！");
            throw e;
        }

        //程序执行到此处，用户名合法
        System.out.println("注册成功，欢迎["+ username +"]");
    }
}

class RegisterException extends Exception{
    public RegisterException(){

    }

    public RegisterException(String s){
        super(s);
    }
}
