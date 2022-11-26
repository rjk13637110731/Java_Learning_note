package baidu.com.bean;

//反射属性：Field

public class Student {
    //Field翻译为字段，其实就是属性/成员
    //4个Field，分别采用了不同的访问控制权限修饰符
    public int no;//public int no称为整个Field对象。
    private String name;//Field对象
    protected int age;
    boolean sex;
    public static final double MATH_PI = 3.1415926;
}
