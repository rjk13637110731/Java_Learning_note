public class Main{
    public static void main(String[] args) {
        // 传统思路
        double hen1 = 3;
        double hen2 = 5;
        double hen3 = 1;
        double hen4 = 3.4;
        double hen5 = 2;
        double hen6 = 50;

        double totalWeight = hen1 + hen2 + hen3 + hen4 + hen5 + hen6;

        double avgWeight = totalWeight / 6;
        System.out.println("总体重 = " + totalWeight + " 平均体重 = " + avgWeight);
    }
}
