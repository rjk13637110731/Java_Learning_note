public class Main{
    public static void main(String[] args){
        // 思路分析：
        // 1. 定义两个变量 int num1,int num2
        // 2. 定义一个变量 int sum = num1 + num2;
        // 3. sum%3,5后，等于0 说明可以整除
        // 4. 使用if-else 来提示对应信息
        // 走代码
        int num1 = 55;
        int num2 = 35;
        int res = num1 + num2;
        if ((res % 3 == 0) && (res % 5 ==0)){
            System.out.println("两数之和 = " + res + "既能被3整除也能被5整除！");
        }
    }
}
