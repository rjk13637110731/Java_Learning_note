public class Main{
    public static void main(String[] args) {
        int number = 153;

        int num1 = number / 100; // 百位
        int num2 = number % 100 / 10; // 十位
        int num3 = number % 10; // 个位
        int sum = num1*num1*num1 +num2*num2*num2 + num3*num3*num3; // 求和

        if (sum == number){
            System.out.println(number + "是水仙花数");
        }else{
            System.out.println(number + "不是水仙花数");
        }
    }
}
