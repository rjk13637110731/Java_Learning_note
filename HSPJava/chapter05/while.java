public class Main{
    public static void main(String[] args){
        int i = 1; // 循环变量初始化
        while(i <= 10){ // 循环条件
            System.out.println("Hello World！" + i); // 执行语句
            i++; // 循环变量迭代
        }
        System.out.println("退出while，继续...");
        System.out.println("i = " + i);
    }
}
