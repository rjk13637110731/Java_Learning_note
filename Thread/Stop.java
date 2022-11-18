package chapter24;

public class ThreadTest09 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable3());
        t.setName("t");
        t.start();

        //模拟5s
        try {
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //5s之后强制终止t线程
        t.stop();//已过时，不建议使用。
    }
}

class MyRunnable3 implements Runnable{

    @Override
    public void run() {
        for (int i = 0;i < 10;i++){
            System.out.println(Thread.currentThread().getName() + " --->"+i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
