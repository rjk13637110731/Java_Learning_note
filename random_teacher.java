//老师写的
package com.baidu.javase.Number;

import java.util.Arrays;
import java.util.Random;

public class RandomTest03 {
    public static void main(String[] args) {
        //创建Random对象,[0-100]之间的数
        Random random = new Random();

        //准备一个长度为5的一维数组
        int[] arr = new int[5];//默认值都是0
        for (int i = 0;i<arr.length;i++){
            arr[i] = -1;//生成数组元素都是-1，与0区分开
        }

        int index = 0;
        //循环生成随机数
        while (index < arr.length){
            int num = random.nextInt(101);
            //判断arr数组中有没有num这个数，如果不包含就把num放进去，包含就再次生成
            if (!contains(arr,num)){
                arr[index++] = num;//先赋值，再加1
            }
        }

        //遍历以上数组
        for (int i = 0;i < arr.length;i++){
            System.out.print(arr[i] + "\t");
        }
    }

    /**
     * 专门写一个方法，这个方法专门用来判断数组中是否包含某个元素。
     * @param arr 数组
     * @param key 元素
     * @return true表示包含，false表示不包含
     */
    public static boolean contains(int[] arr,int key){
        /*这个方法有Bug
        //对数组进行升序
        Arrays.sort(arr);

        //进行二分法查找,>=0表示找到了，包含这个元素。
        return Arrays.binarySearch(arr,key) >= 0;
        */

        for (int i = 0;i < arr.length;i++){
            if (arr[i] == key){
                //条件成立包含
                return true;
            }
        }
        //表示不包含
        return false;
    }
}
