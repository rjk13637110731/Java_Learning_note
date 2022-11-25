package chapter25;

public class ReflectTest04 {
    public static void main(String[] args) {
        try {
            //Class.forName()这个方法的执行会导致类加载，类加载必然导致静态代码块执行。
            Class.forName("chapter25.MyClass");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class MyClass{
    //静态代码块在类加载的时候执行，并且只执行一次。
    static {
        System.out.println("MyClass类的静态代码块执行了！");
    }
}
