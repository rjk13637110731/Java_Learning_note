package com.baidu.javase.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest01 {
    public static void main(String[] args) {
        //测试HashMap集合key部分的元素特点：
        //Integer是key，它的hashCode()和equals()方法都重写了。
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"zhangsan");
        map.put(6666,"lis");
        map.put(7777,"wangwu");
        map.put(2222,"zhaoliu");
        map.put(2222,"king");//key重复的时候，value会自动覆盖。

        System.out.println(map.size());

        //遍历Map集合
        Set<Map.Entry<Integer,String>> set = map.entrySet();
        for (Map.Entry<Integer,String> entry : set){
            //验证结果：HashMap集合key部分元素，无序不可重复。
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
