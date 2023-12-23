public class Main{
    public static void main(String[] args){
        int i = 1;
        int sum = 0;
        do{
            System.out.println("i = " + i);
            sum += i;
            i++;
        }while(i <= 100);
        System.out.println("1 + 2 + 3 + ... + 100 = " + sum);
    }
}
