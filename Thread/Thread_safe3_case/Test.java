package chapter24.ThreadSafe3;

public class Test {
    public static void main(String[] args) {
        //创建账户对象，只创建一个
        Account act = new Account("act-001",10000);

        //创建两个线程
        Thread t1 = new AccountThread(act);
        Thread t2 = new AccountThread(act);

        //设置那么
        t1.setName("t1");
        t2.setName("t2");

        //启动线程
        t1.start();
        t2.start();
    }
}