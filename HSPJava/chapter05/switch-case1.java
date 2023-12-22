import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        System.out.println("请输入字符(a-z)：");
        Scanner myScanner = new Scanner(System.in);
        char c = myScanner.next().charAt(0);
        char ch;
        switch (c){
            case 'a':
                ch = Character.toUpperCase(c);
                System.out.println(ch);
                break;
            case 'b':
                ch = Character.toUpperCase(c);
                System.out.println(ch);
                break;
            case 'c':
                ch = Character.toUpperCase(c);
                System.out.println(ch);
                break;
            case 'd':
                ch = Character.toUpperCase(c);
                System.out.println(ch);
                break;
            case 'e':
                ch = Character.toUpperCase(c);
                System.out.println(ch);
                break;
            default:
                System.out.println("others");
                break;
        }
        System.out.println("结束switch，继续执行后续代码！");
    }
}
