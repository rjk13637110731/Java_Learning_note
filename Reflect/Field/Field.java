import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

//反射Student类当中所有的Field

public class ReflectTest05 {
    public static void main(String[] args) throws Exception{
        //获取Student类
        Class studentClass = Class.forName("baidu.com.bean.Student");
        String className = studentClass.getName();
        System.out.println("完整类名：" + className);//完整类名：baidu.com.bean.Student

        String simpleName = studentClass.getSimpleName();
        System.out.println("简类名：" + simpleName);//简类名：Student

        //获取类中所有的public修饰的Field。
        Field[] fields = studentClass.getFields();
        System.out.println(fields.length);//测试数组中只有1个元素

        //取出这个Field
        Field f = fields[0];

        //取出这个Field它的名字
        String fieldName = f.getName();
        System.out.println(fieldName);//no,对应public修饰的属性

        //获取所有的Field
        Field[] fs = studentClass.getDeclaredFields();
        System.out.println(fs.length);//4

        System.out.println("=================================");
        //遍历
        for (Field field : fs){
            //获取属性的修饰符列表
            int i = field.getModifiers();//返回的修饰符是一个数字，每一个数字是修饰符的代号！！！
            System.out.println(i);
            //可以将这个"代号"数字转换成"字符串"吗？可以
            String modifierString = Modifier.toString(i);
            System.out.println(modifierString);

            //获取属性的类型
            Class fieldType = field.getType();
            String fName0 = fieldType.getName();
            System.out.println("fiel类型：" + fName0);
            //简单名字：
            String fSimpleName = fieldType.getSimpleName();
            System.out.println("简单名字：" + fSimpleName);

            //获取属性的名字
            String fName = field.getName();
            System.out.println("field名字：" + fName);
        }
    }
}
