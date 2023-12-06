public class Main{
    public static void main(String[] args){
        char c1 = 97;
        char c2 = 'a'; // 输出'a'对应的 数字
        char c3 = '韩';
        char c4 = 38889;
        // 要输出对应的数字，可以 (int)字符
        System.out.println(c1); // a
        System.out.println((int)c2); // 97
        System.out.println((int)c3); // 38889
        System.out.println(c4); // 韩

        System.out.println('a' + 10); // 107

        // 测试
        char c5 = 'b' + 1; // 98 + 1 = 99
        System.out.println((int)c5); // 99
        System.out.println(c5); // 99对应的字符->c
    }
}
