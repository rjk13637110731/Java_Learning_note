public class Main{
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55,66};
        int[] arr1 = new int[arr.length];

        for (int i = 0;i < arr.length;i++){
            arr1[i] = arr[arr.length-i-1];
        }

        for (int i = 0;i < arr1.length;i++){
            System.out.println(arr1[i]);
        }
    }
}
