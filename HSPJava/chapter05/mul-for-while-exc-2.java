import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int classCount = 3;
        int studentNumber = 5;
        double score;
        int count = 0;
        for (int i = 1;i <= classCount;i++){
            System.out.println("班级：" + i);
            for (int j = 1;j <= studentNumber;j++){
                System.out.println("学生：" + j + "的成绩：");
                score = myScanner.nextDouble();
                if (score >= 60){
                    count++;
                }
            }
        }
        System.out.println("所有班级及格人数为：" + count);
    }
}
