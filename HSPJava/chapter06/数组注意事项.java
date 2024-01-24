public class Main{
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,60};

        double[] arr2 = {1.1,2.2,3.3,60.6,100}; // int ---> double

        String[] arr3 = {"北京","jack","milan"};

        short[] arr4 = new short[3];
        for(int i = 0;i < arr4.length;i++){
            System.out.println(arr4[i]);
        }

        // 数组的下标 最小值为 0 最大值为 数组长度-1
        int[] arr = new int[5];
        System.out.println(arr[4]);
    }
}
