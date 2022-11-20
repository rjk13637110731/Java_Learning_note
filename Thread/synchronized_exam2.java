package chapter24.exame1;

//面试题：doOther()方法执行的时候需不需要等待doSome()方法的结束？
//需要，因为doOther()方法有synchronized，锁住了this

public class Exam02 {
    public static void main(String[] args) {
        MyClass mc = new MyClass();

        Thread t1 = new MyThread(mc);
        Thread t2 = new MyThread(mc);

        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        try {
            Thread.sleep(1000);//这个睡眠的作用是：为了保证t1线程先执行。
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
    }
}

class MyThread extends Thread{
    private MyClass mc;
    public MyThread(MyClass mc){
        this.mc = mc;
    }

    @Override
    public void run() {
        if (Thread.currentThread().getName().equals("t1")){
            mc.doSome();
        }

        if (Thread.currentThread().getName().equals("t2")){
            mc.doOther();
        }
    }
}

class MyClass{
    public synchronized void doSome(){
        System.out.println("doSome begin");
        try {
            Thread.sleep(1000*10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("doSome over");
    }

    public synchronized void doOther(){
        System.out.println("doOther begin");
        System.out.println("doOther over");
    }
}
