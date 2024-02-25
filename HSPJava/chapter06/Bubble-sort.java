public class Main{
    public static void main(String[] args) {
        // 老韩 化繁为简，先死后活
        
        int[] arr = {24,69,80,57,13};
        int tmp = 0; // 用于辅助交换的变量

        // 将多轮排序使用外层循环包括起来即可
        for(int i = 0;i < arr.length-1;i++){
            for(int j = 0;j < arr.length-1-i ;j++){ //arr.length-1-i次比较
                // 如果前面的数大于后面的数，就交换
                if(arr[j] > arr[j+1]){
                    tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }

            System.out.println("\n==第" + (i+1) + "轮==");
            for(int k = 0;k < arr.length;k++){
                System.out.print(arr[k] + "\t");
            }
        }
    }
}
