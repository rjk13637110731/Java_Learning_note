import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        //思路分析
        // 1.先创建一个Scanner对象，接收用户输入,int month
        // 2.使用switch匹配
        // 3.使用穿透来完成，比较简洁
        // 代码实现
        
        System.out.println("请输入月份：");
        Scanner myScanner = new Scanner(System.in);
        int month = myScanner.nextInt();

        switch(month){
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("冬季");
                break;
            default:
                System.out.println("输入有误！");
                break;
        }

        System.out.println("结束switch，继续执行后续代码！");
    }
}
