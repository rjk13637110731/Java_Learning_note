import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入月份：");
        int month = myScanner.nextInt();
        if (month >= 4 && month <= 10){
            System.out.println("请输入年龄：");
            int age = myScanner.nextInt();
            if (age >= 18 && age <= 60){
                System.out.println("成人票价为：60元/人");
            } else if (age < 18 && age >= 1) {
                System.out.println("儿童票价为半价：30元/人");
            }else if (age > 60){
                System.out.println("老人票价为1/3：20元/人");
            }else{
                System.out.println("输入年龄有误！");
            }
        }else if((month <= 12 && month >= 11) || (month >= 1 && month <= 3)){
            System.out.println("请输入年龄：");
            int age = myScanner.nextInt();
            if (age >= 18 && age <= 60){
                System.out.println("成人票价为：40元/人");
            } else if ((age < 18 && age >= 1) || (age > 60)) {
                System.out.println("其他票价为半价：20元/人");
            }else{
                System.out.println("输入年龄有误！");
            }
        }else{
            System.out.println("输入月份有误！");
        }
    }
}
