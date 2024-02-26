import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        // 白眉鹰王、金毛狮王、紫衫龙王、青翼蝠王
        String[] names = {"白眉鹰王","金毛狮王","紫衫龙王","青翼蝠王"};
        Scanner myScanner = new Scanner(System.in);

        System.out.println("请输入名字：");
        String findName = myScanner.next();

        // 技巧编程思想
        int index = -1;

        for(int i = 0;i < names.length;i++){
            // 比较 字符串比较 equals
            if(findName.equals(names[i])){
                System.out.println("恭喜你找到 " + findName);
                System.out.println("下标为 = " + i);
                // 把i保存到index中
                index = i;
                break;// 退出
            }
        }

        if(index == -1){
            System.out.println("sorry，没有找到 " + findName);
        }
    }
}
