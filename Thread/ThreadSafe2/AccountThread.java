package chapter24.ThreadSafe2;

public class AccountThread extends Thread{
    //两个线程必须共享同一个账户对象。
    private Account act;

    //通过构造方法传递过来账户对象
    public AccountThread(Account act){
        this.act = act;
    }

    @Override
    public void run() {
        //run()方法的执行表示取款操作
        //假设取款5000
        double money = 5000;

        //取款
        //多线程并发执行这个方法
        act.withdraw(money);

        //取款成功
        System.out.println(Thread.currentThread().getName() + "对" + act.getActno() + "取款成功，余额为：" + act.getBalance());
    }
}
