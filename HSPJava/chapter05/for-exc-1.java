public class Main{
    public static void main(String[] args){
        int sum = 0;
        for (int i = 1;i <= 100;i++){
            if (i % 9 == 0){
                System.out.println("i = " + i);
                sum += i;
            }
        }
        System.out.println("sum = " + sum);
    }
}
