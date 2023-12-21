import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入保国同志的芝麻信用分（1-100）：");
        // 接收用户输入
        // 请思考，如果小伙伴输入的不是小数，而是hello...
        // 这里我们后面可以使用异常处理机制搞定，老师点一下
        double score = myScanner.nextDouble();

        // 先对输入的信用分，进行一个范围的有效判断，1-100，否则提示输入错误
        if (score >= 1 && score <= 100){
            // 判断，因为有4种情况，所以使用多分支
            if (score >= 100){
                System.out.println("信用极好");
            }else if(score > 80 && score <= 99){
                System.out.println("信用优秀");
            } else if (score >= 60 && score <= 80) {
                System.out.println("信用一般");
            } else {
                System.out.println("信用不及格");
            }
        }else{
            System.out.println("信用分需要在 1 - 100，请重新输入：");
        }
    }
}
