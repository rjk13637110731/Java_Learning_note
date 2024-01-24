import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        // 创建一个Scanner可以接收用户输入
        // 因为不知道用户什么时候退出，使用do-while循环+break来控制
        Scanner myScanner = new Scanner(System.in);
        int[] arr = {1,2,3};

        do{
            int[] arrNew = new int[arr.length+1];

            for(int i = 0;i < arr.length;i++){
                arrNew[i] = arr[i];
            }

            // 输入元素
            System.out.println("请输入你要添加的元素：");
            int addNum = myScanner.nextInt();
            arrNew[arr.length] = addNum;

            // 重新指定数据空间
            arr = arrNew;

            // 输出
            for(int i = 0;i < arr.length;i++){
                System.out.print(arr[i] + "\t");
            }

            // 问用户是否继续
            System.out.println("你是否还要继续添加元素？(y/n):");
            char key = myScanner.next().charAt(0);
            if (key == 'n'){
                break;
            }
        }while(true);
        System.out.println("你退出了添加...");
    }
}
