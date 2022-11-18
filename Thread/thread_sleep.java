package chapter24;

public class ThreadTest06 {
    public static void main(String[] args) {
        //让当前线程进入休眠，睡眠5s
        //当前是主线程！！！
        try {
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //5s之后执行这里的代码
        //System.out.println("Hello World!");

        for (int i = 0;i < 5;i++){
            System.out.println(Thread.currentThread().getName() + "--->" + i);

            //睡眠1s
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
