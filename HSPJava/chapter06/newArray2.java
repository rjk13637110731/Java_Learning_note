import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        // 创建一个数组
        // 先声明，再  分配空间new
        double scores[]; // 声明数组，这时， scores 是 null
        scores = new double[5]; // 分配了内存的空间，可以存储数据
        // 等价于 double[] scores = new double[5];

        // 循环输入
        Scanner myScanner = new Scanner(System.in);
        for(int i = 0;i < scores.length;i++){
            System.out.println("请输入第" + (i+1) + "个元素的值：");
            scores[i] = myScanner.nextDouble();
        }

        // 输出，遍历数组
        System.out.println("==数组的元素/值的情况如下：==");
        for(int i = 0;i < scores.length;i++){
            System.out.println("请输入第" + (i+1) + "个元素的值：" + scores[i]);
        }
    }
}
