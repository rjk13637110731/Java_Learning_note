public class Main{
    public static void main(String[] args) {
        /*
            0 0 0 0 0 0
            0 0 1 0 0 0
            0 2 0 3 0 0
            0 0 0 0 0 0
         */

        // 老韩解读：
        // 1. 从形式上看 int[][]
        // 2. 可以这样理解，原来的一维数组的每个元素是一维数组，就构成了二维数组
        int[][] arr = {{0,0,0,0,0,0},
                       {0,0,1,0,0,0},
                       {0,2,0,3,0,0},
                       {0,0,0,0,0,0}};

        // 输出二维图形
        for(int i = 0;i < arr.length;i++){ // 遍历二维数组的每个元素
            // 1. arr[i] 表示 二维数组的第 i+1 个元素
            // 2. arr[i].length 得到 对应的每个一维数组的长度
            for(int j = 0;j < arr[i].length;j++){ // 遍历二维数组的每个元素（数组）
                System.out.print(arr[i][j] + "\t"); // 输出了一个一维数组
            }
            System.out.println(); // 换行
        }
    }
}
