public class Main{
    public static void main(String[] args) {
        // 定义数组
        int[] arr = {11,22,33,44,55,66};

        // 老师思路
        // 规律
        // 1.把arr[0] 和 arr[5] 进行交换 {66,22,33,44,55,11}
        // 2.把arr[1] 和 arr[4] 进行交换 {66,55,33,44,22,11}
        // 3.把arr[2] 和 arr[3] 进行交换 {66,55,44,33,22,11}
        // 4.一共交换3次 = arr.length / 2
        // 5. 每次交换时，对应的下标 是 arr[i] 和 arr[arr.length-i-1]

        // 代码
        for(int i = 0;i < arr.length/2;i++){
            int temp = arr[arr.length-1-i];
            arr[arr.length-i-1] = arr[i];
            arr[i] = temp;
        }

        for(int i = 0;i < arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
