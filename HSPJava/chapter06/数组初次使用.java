public class Main{
    public static void main(String[] args) {
        // 数组思路
        // 定义一个数组
        double[] hens = {3,5,1,3.4,2,50};
        // 1.double[] 表示 是double类型的数组，数组名就是 hens
        // 2.{3,5,1,3.4,2,50} 表示数组的值/元素，依次表示数组的第几个元素

        // 遍历数组得到数组的所有元素的和，使用for循环
        // 1.我们可以通过 hens[下标] 来访问数组的元素
        //   下标是从 0 开始编号的，比如第一个元素就是 hens[0]
        //    第二个元素就是 hens[1]，以此类推
        // 2.通过for循环就可以循环的访问 数组的元素/值
        // 3.使用一个变量 totalWeight 将各个元素累加
        double totalWeight = 0;
        for(int i = 0;i < 6;i++){
            // System.out.println("第" + (i+1)+ "个元素的值 = " + hens[i]);
            totalWeight += hens[i];
        }
        double avgWeight = totalWeight / 6;
        System.out.println("总体重 = " + totalWeight + " 平均体重 = " + avgWeight);
    }
}
