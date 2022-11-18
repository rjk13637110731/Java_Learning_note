package chapter24;

//实现线程的第一种方式：编写一个类，直接继承java.lang.Thread，重写run()方法。

//怎么创建线程对象？new就行了
//怎么启动线程呢？调用线程对象的start()方法。

//注意：更古不变的道理：方法啊体中的代码永远都是自上而下的顺序依次逐行执行的。

public class ThreadTest02 {
    public static void main(String[] args) {
        //这里是main方法,这里的代码属于主线程，在主栈中运行

        //新建一个分支线程对象
        MyThread t = new MyThread();

        myThread.run();//如果线程对象直接调用run()方法，不会启动线程，不会分配新的分支栈。单线程。只是普通方法的调用。

        //启动线程
        //start()方法的作用是：启动一个分支线程，在JVM中开辟一个新的栈空间，这段代码任务完成之后，瞬间就结束了。
        //这段代码的任务只是为了开启一个新的栈空间，只要新的栈空间开辟出来，start()方法就结束了。线程就启动成功了。
        //启动成功的线程会自动调用run()方法，并且run()方法在分支栈的栈底部（压栈）。
        //run()方法在分支栈的栈底部，main()方法在主栈的栈底部，run和main是平级的。
        //t.start();

        //这里的代码还是运行在主线程中
        for (int i = 0;i < 1000;i++){
            System.out.println("主线程===>>" + i);
        }
    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        //编写程序，这段程序运行在分支线程中（分支栈）。
        for (int i = 0;i < 1000;i++){
            System.out.println("分支线程--->" + i);
        }
    }
}
