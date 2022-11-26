import baidu.com.bean.Vip;

import java.lang.reflect.Constructor;

public class ReflectTest12 {
    public static void main(String[] args) throws Exception{
        //不使用反射机制怎么创建对象
        Vip v1 = new Vip();
        Vip v2 = new Vip(110,"zhangsan","2011-10-13",true);

        //使用反射机制创建对象
        Class c = Class.forName("baidu.com.bean.Vip");

        //调用无参数构造方法
        Object obj = c.newInstance();
        System.out.println(obj);

        //调用有参数的构造方法
        //第一步：先获取到这个有参数的构造方法
        Constructor con = c.getDeclaredConstructor(int.class,String.class,String.class,boolean.class);
        //第二步：调用构造方法new对象
        Object newObj = con.newInstance(110,"jackson","1990-10-12",true);
        System.out.println(newObj);

        //获取无参数构造方法
        Constructor con2 = c.getDeclaredConstructor();//参数什么也不写
        Object newObj2 = con2.newInstance();
        System.out.println(newObj2);
    }
}
