public class Main{
    public static void main(String[] args){
        int n1 = 10;
        // float f1 = n1 + 1.1;// 报错  n1 + 1.1 => 结果类型是 double
        // 解决方案：
        double d1 = n1 + 1.1;// 正确
        float f1 = n1 + 1.1F;// 正确

        // int n2 = 1.1;// 报错 double => int

        // 当把数据赋值给byte时，先判断该数是否在byte范围内，如果是就可以赋值
        byte b1 = 10; // -128~127
        int n3 = 1;
        // 如果是变量赋值，判断类型
        // byte b2 = n3; // 报错

        // char c1 = b1;//报错，原因byte不能自动转换成char

        byte b3 = 1;
        short s1 = 1;
        // short s2 = b3 + s1; // 报错 b3 + s1 => int
        int n4 = b3 + s1; // 正确 b3 + s1 => int

        // byte b4 = b1 + b3; // 报错 b1 + b3 => int

        boolean pass = true;
        // int num100 = pass;// 报错，boolean不参与类型的自动转换

        byte b5 = 1;
        short s3 = 100;
        int num200 = 1;
        double num300 = 1.1;
        double num500 = b5 + s3 + num200 + num300;//转换为最大数据类型
    }
}
