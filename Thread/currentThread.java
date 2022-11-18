package chapter24;

public class ThreadTest05 {
    public static void main(String[] args) {
        //currentThread()就是当前线程对象
        //这个代码出现在main()方法中，所以当前线程就是主线程。
        Thread tt = Thread.currentThread();
        System.out.println(tt.getName());//主线程的名字：main

        //创建线程对象
        MyThread2 t = new MyThread2();

        //不设置线程名字
        String tName0 = t.getName();
        System.out.println(tName0);//默认的名字：Thread-0

        //设置线程的名字
        t.setName("t1");

        //获取线程的名字
        String tName =  t.getName();
        System.out.println(tName);

        //启动线程
        t.start();

        MyThread2 t2 = new MyThread2();
        t2.setName("t2");
        t2.start();
        System.out.println(t2.getName());//Thread-1
    }
}

class MyThread2 extends Thread{
    @Override
    public void run() {
        for (int i = 0;i < 3;i++){
            //currentThread就是当前线程对象
            //当t1线程执行run()方法，那么这个当前线程就是t1;
            //当t2线程执行run()方法，那么这个当前线程就是t2;
            Thread currentThread = Thread.currentThread();
            System.out.println(currentThread.getName()+ "--->" + i);
        }
    }
}
