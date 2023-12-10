public class Main{
    public static void main(String[] args){
        // && 演示
        int age = 50;
        if (age > 20 && age < 90){
            System.out.println("ok100");
        }

        // &演示
        if (age > 20 & age < 90){
            System.out.println("ok200");
        }

        // 区别
        int a = 4;
        int b = 9;
        if (a < 1 && ++b < 50){
            System.out.println("ok300");
        }
        System.out.println("a = " + a + " b = " + b);

        if (a < 1 & ++b < 50){
            System.out.println("ok300");
        }
        System.out.println("a = " + a + " b = " + b);
    }
}
