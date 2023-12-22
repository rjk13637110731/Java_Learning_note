import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入一个字符(a-g)：");
        char ch1 = myScanner.next().charAt(0);

        switch (ch1){
            case 'a':
                System.out.println("星期1");
                break;
            case 'b':
                System.out.println("星期2");
                break;
            case 'c':
                System.out.println("星期3");
                break;
            case 'd':
                System.out.println("星期4");
                break;
            case 'e':
                System.out.println("星期5");
                break;
            case 'f':
                System.out.println("星期6");
                break;
            case 'g':
                System.out.println("星期7");
                break;
            default:
                System.out.println("输入有误，请重新输入！");
                break;
        }
    }
}
