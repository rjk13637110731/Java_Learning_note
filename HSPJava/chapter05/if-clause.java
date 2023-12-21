import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        // 思路分析：
        // 1.接收一个输入的年龄，应该定义一个Scanner对象
        // 2.把年龄保存到一个变量 int age
        // 3.使用if判断，输出对应的信息

        // 应该定义一个Scanner对象
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入年龄：");
        // 把年龄保存到一个变量 int age
        int age = myScanner.nextInt();
        // 使用if判断，输出对应的信息
        if (age > 18){
            System.out.println("你年龄大于18，要对自己的行为负责，送入监狱");
        }
        System.out.println("程序继续...");
    }
}
