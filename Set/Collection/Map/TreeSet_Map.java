package com.baidu.javase.Map;

import java.util.TreeSet;

public class TreeSetTest01 {
    public static void main(String[] args) {
        //创建一个TressSet集合
        TreeSet<String> ts = new TreeSet<>();

        //添加String
        ts.add("zhangsan");
        ts.add("lisi");
        ts.add("wangwu");
        ts.add("zhangsi");
        ts.add("wangliu");

        //遍历
        for (String s : ts){
            //按照字典顺序，升序！
            System.out.println(s);
        }

        TreeSet<Integer> ts2 = new TreeSet<>();
        ts2.add(100);
        ts2.add(200);
        ts2.add(900);
        ts2.add(800);
        ts2.add(600);
        ts2.add(10);

        //遍历
        for (Integer elt : ts2){
            //升序
            System.out.println(elt);
        }
    }
}

/*
数据库中有很多数据：
userid      name        birth
----------------------------------
1           zs          1980-11-11
2           ls          1980-10-11
3           ww          1981-11-11
4           zl          1979-11-10

编写程序从数据库中取出数据，在页面展示用户信息的时候，按照生日升序或者降序。
这个时候可以使用TreeSet集合，因为TreeSet集合放进去，拿出来就是有顺序的。
 */
