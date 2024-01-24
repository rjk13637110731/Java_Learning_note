public class Main{
    public static void main(String[] args) {
        // 基本数据类型赋值，赋值方式为值拷贝
        // n2的变化，不会影响到n1的值
        int n1 = 10;
        int n2 = n1;

        n2 = 80;
        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);

        // 数组数据类型赋值，赋值方式为 地址/引用 拷贝，引用传递/赋值
        // 是一个地址，arr2变化会影响到arr1
        int[] arr1 = {1,2,3};
        int[] arr2 = arr1;

        arr2[0] = 10;

        // arr1的元素
        for(int i = 0;i < arr1.length;i++){
            System.out.println("arr1[" + i + "] = " + arr1[i]);
        }
    }
}
