package chapter24;

//采用匿名内部类可以吗？可以！

public class ThreadTest04 {
    public static void main(String[] args) {
        //创建线程对象，采用匿名内部类方式。
        //这是通过一个没有名字的类，new出来的对象。
        Thread t = new Thread(new Runnable(){//匿名内部类，其实相当于：new [匿名] implements Runnable(){...}
            @Override
            public void run() {
                for (int i = 0;i < 100;i++){
                    System.out.println("分支线程==========>" + i);
                }
            }
        });

        //启动线程
        t.start();

        for (int i = 0;i < 100;i++){
            System.out.println("主线程--->" + i);
        }
    }
}
