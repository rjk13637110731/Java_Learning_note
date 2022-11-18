package chapter24;

public class ThreadTest05 {
    public static void main(String[] args) {
        //创建线程对象
        MyThread2 t = new MyThread2();

        //不设置线程名字
        String tName0 = t.getName();
        System.out.println(tName0);//默认的名字：Thread-0

        //设置线程的名字
        t.setName("tttt");

        //获取线程的名字
        String tName =  t.getName();
        System.out.println(tName);

        //启动线程
        t.start();

        MyThread2 t2 = new MyThread2();
        System.out.println(t2.getName());//Thread-1
    }
}

class MyThread2 extends Thread{
    @Override
    public void run() {
        for (int i = 0;i < 5;i++){
            System.out.println("分支线程--->" + i);
        }
    }
}
