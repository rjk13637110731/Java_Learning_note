//自己写的
package com.baidu.javase.Number;

import java.util.Random;

public class RandomTest02 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[5];

        for(int i = 0;i < 5;i++){
            while(true){
                boolean flag = true;
                int num1 = random.nextInt(100);
                for (int j = 0;j <= i;j++){
                    if (arr[j] == num1 && i!= j){
                        break;
                    }else{
                        arr[i] = num1;
                        flag = false;
                        break;
                    }
                }
                if (flag){
                    continue;
                }else{
                    break;
                }
            }
        }

        for (int i = 0;i < arr.length;i++){
            System.out.print(arr[i] + "\t");
        }
    }
}
