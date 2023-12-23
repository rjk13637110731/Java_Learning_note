import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        char answer = ' ';
        do{
            System.out.println("老韩问: 还钱吗? y/n");
            answer = myScanner.next().charAt(0);
            if (answer == 'n'){
                System.out.println("闪电五连鞭~");
            }else if(answer == 'y'){
                System.out.println("耗子尾汁！");
            }else{
                System.out.println("偷袭！");
            }
        }while(answer != 'y'); // 判断条件
    }
}
