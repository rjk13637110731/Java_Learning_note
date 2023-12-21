public class Main{
    public static void main(String[] args){
        // 思路分析：
        // 1. 定义 int year 保存年
        // 2. 年份能被4整除，但不能被100整除 => year % 4 == 0 && year % 100 != 0
        // 3. 年能被400整除 => year % 400 == 0
        // 4. 上面的 2 和 3 是或的关系
        // 代码实现：
        int year = 2023;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            System.out.println(year + "是闰年！");
        }else{
            System.out.println(year + "不是闰年！");
        }
    }
}
