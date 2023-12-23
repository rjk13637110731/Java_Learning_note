import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int classCount = 3;
        int studentNumber = 5;
        double score;
        double sumScore;
        double allScore = 0.0;
        for (int i = 1;i <= classCount;i++){
            System.out.println("班级：" + i);
            sumScore = 0.0;
            for (int j = 1;j <= studentNumber;j++){
                System.out.println("学生：" + j + "的成绩：");
                score = myScanner.nextInt();
                sumScore += score;
            }
            allScore += sumScore;
            System.out.println("班级：" + i + "的总成绩是：" + sumScore + "，平均成绩为：" + sumScore/studentNumber);
        }
        System.out.println("所有班级的总成绩为：" + allScore + "，所有班级平均成绩：" + allScore/classCount);
    }
}
