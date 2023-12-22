public class Main{
    public static void main(String[] args){
        // 思路分析
        // 化繁为简
        // 1. 先输出0-5
        // 2. 后面的 + 是 5-i
        // 先死后活
        // 1. 5 替换成变量 end
        
        int start = 0;
        int end = 5;
        for (int i = start;i <= end;i++){
            System.out.println(i + " + " + (end - i) + " = " + end);
        }
    }
}
