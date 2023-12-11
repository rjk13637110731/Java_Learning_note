import java.util.Scanner; //表示把java.util下的Scanner类导入

public class Main{
    public static void main(String[] args){
        // 演示接受用户的输入
        // 步骤
        // Scanner类 表示 简单文本扫描器，在java.util 包下
        // 1. 引入/导入 Scanner类所在的包
        // 2. 创建 Scanner 对象，new 创建一个对象，体会
        // myScanner 就是 Scanner类的对象
        Scanner myScanner = new Scanner(System.in);
        // 3.接受用户的输入，使用相关的方法
        System.out.println("请输入名字：");
        
        // 程序等待用户输入
        String name = myScanner.next(); // 接受用户的输入
        System.out.println("请输入年龄：");
        int age = myScanner.nextInt();
        System.out.println("请输入薪水：");
        double sal = myScanner.nextDouble();
        System.out.println("人的信息如下：");
        System.out.println("name = " + name + " age = " + age + " sal = " + sal);
    }
}
