package chapter25;

import chapter25.bean.User;

import java.io.FileReader;
import java.util.Properties;

/*
验证反射机制的灵活性
 */
public class ReflectTest03 {
    public static void main(String[] args) throws Exception{
        //这种方式代码就写死了，只能创建一个User类型的对象
        //User user = new User();

        //以下代码是灵活的，代码不需要改动，可以修改配置文件，配置文件修改之后，可以创建出不同的实例对象。
        //通过IO流读取classinfo.properties文件
        FileReader reader = new FileReader("E:\\JavaDocument\\chapter16\\src\\chapter25\\classinfo.properties");
        //创建属性类对象Map
        Properties pro = new Properties();//key和value都是String
        //加载
        pro.load(reader);
        //关闭流
        reader.close();

        //通过key获取value
        String className = pro.getProperty("className");
        //System.out.println(className);//chapter25.bean.User

        //通过反射机制实例化对象
        Class c = Class.forName(className);
        Object obj = c.newInstance();
        System.out.println(obj);
    }
}
