package chapter24.ThreadSafe2;

//银行账户类
//使用线程同步机制，解决线程安全问题。

public class Account {
    //账号
    private String actno;
    //余额
    private double balance;

    public Account() {
    }

    public Account(String actno, double balance) {
        this.actno = actno;
        this.balance = balance;
    }

    public String getActno() {
        return actno;
    }

    public void setActno(String actno) {
        this.actno = actno;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //取款方法
    public void withdraw(double money){
        //以下这几行代码必须是线程排队的，不能并发。一个线程把这里的代码全部执行结束之后，另一个线程才能进来。

        //线程同步机制
        /*
        synchronized后面小括号中传的这个“数据”是相当关键的，这个数据必须是多线程共享的数据，才能达到多线程排队。

        ()中写什么？
            那要看你想让哪些线程同步。
            假设t1、t2、t3、t4、t5，有5个线程。
            你只希望t1、t2、t3排队，t4、t5不需要排队，怎么办？
            你一定要在()中写一个t1、t2、t3共享的对象，而这个对象对于来说不是共享的。

            这里的共享对象是：账户对象
            账户对象是共享的，那么this就是账户对象吧，所以小括号()中写this。
            不一定是this，这里只要是多线程共享的那个对象就行。
         */
        synchronized (this){
            //取款之前的余额
            double before = this.getBalance();
            //取款之后的余额
            double after = before - money;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.setBalance(after);
        }
    }
}
