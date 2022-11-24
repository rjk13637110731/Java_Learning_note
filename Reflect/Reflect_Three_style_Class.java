package chapter25;

import java.util.Date;

public class ReflectTest01 {
    public static void main(String[] args) {
        //第一种方式：Class.forName()
        Class c1 = null;
        Class c2 = null;
        try {
            c1 = Class.forName("java.lang.String");//c1代表String.class文件，或者说c1代表String类型。
            c2 = Class.forName("java.lang.Date");//c2代表Date类型
            Class c3 = Class.forName("java.lang.Integer");//c3代表Integre类型
            Class c4 = Class.forName("java.lang.System");//c4代表System类型
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //第二种方式：java中任何一个对象都有一个方法：getClass();
        String s = "abc";
        Class x = s.getClass();//x代表String.class字节码文件，x代表String类型。
        System.out.println(c1 == x);//true（==判断的是对象的内存地址。）

        Date time = new Date();
        Class y = time.getClass();
        System.out.println(c2 == y);//true,因为c2和y两个变量中保存的地址是一样的，都指向方法区中的字节码文件。

        //java语言中任何一种类型，包括基本数据类型，它都有.class属性。
        Class z = String.class;//z代表String类型
        Class k = Date.class;//k代表Date类型
        Class f = int.class;//f代表int类型
        Class e = double.class;//e代表double类型

        System.out.println(x == z);//true
    }
}
