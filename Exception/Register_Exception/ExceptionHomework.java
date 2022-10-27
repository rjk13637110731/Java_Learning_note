package com.baidu.javase.exception;

public class ExceptionHomework {
    public static void main(String[] args) {
        UserService userService = new UserService();
        try {
            userService.register("Zha","123456");
        } catch (RegisterException e) {
            System.out.println(e.getMessage());;
        }
    }
}
