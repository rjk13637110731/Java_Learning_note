public class Main{
    public static void main(String[] args){
        int i = 1; // 循环变量初始化
        do{
            // 循环执行语句
            System.out.println("Hello " + i);
            i++; // 循环变量迭代
        }while(i <= 10); // 循环判断语句
        System.out.println("退出 do while，继续.. " + i);
    }
}
