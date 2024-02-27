public class Main{
    public static void main(String[] args) {
        int[][] arr = new int[3][];// 创建了二维数组，但是只是确定了一维数组的个数，一个有3个一维数组，但是每个一维数组还没有开辟数据空间

        for(int i = 0;i < arr.length;i++){//遍历arr每个一维数组
            // 给每个一维数组开空间 new
            // 如果没有给一维数组 new，那么 arr[i] 就是 null
            arr[i] = new int[i+1];

            // 遍历一维数组，并给一维数组的每个元素赋值
            for(int j = 0;j < arr[i].length;j++){
                arr[i][j] = i+1; // 赋值
            }
        }

        // 遍历arr输出
        for(int i = 0;i < arr.length;i++){
            // 输出 arr 的每个一维数组
            for(int j = 0;j < arr[i].length;j++){
                System.out.print(arr[i][j] + " "); // 输出
            }
            System.out.println(); // 换行
        }
    }
}
