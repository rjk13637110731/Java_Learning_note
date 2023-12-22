import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        // 思路分析
        // 1.这道题，可以使用 分支来完成， 但是要求使用switch
        // 2.这里我们需要进行一个转换，编程思路
        // 如果成绩在 [60,100] ，(int)(成绩/6) = 1
        // 如果成绩在[0,60)，(int)(成绩/6) = 0
        // 代码实现

        System.out.println("请输入学生成绩：");
        Scanner myScanner = new Scanner(System.in);
        double score = myScanner.nextDouble();

        // 使用if-else保证输入的成绩是有效的0-100
        if (score >= 0 && score <= 100){
            int gread = (int)score/60;
            switch (gread){
                case 0:
                    System.out.println("成绩不及格");
                    break;
                case 1:
                    System.out.println("成绩及格");
                    break;
                default:
                    System.out.println("成绩输入有误");
                    break;
            }
        }else{
            System.out.println("成绩输入需要在0-100之间");
        }

        System.out.println("结束switch，继续执行后续代码！");
    }
}
