package chapter24.ThreadSafe3;

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
    /*在实例方法上可以使用synchronized吗？可以的
        synchronized出现在实例方法上，一定锁的是this，没得挑，只能是this，不能是其他的对象了。
        所以这种方法不灵活。

        另外还有一点：synchronized出现在实例方法上，表示整个方法体都需要同步，可能会无故扩大同步的范围，
        导致程序的执行效率降低，所以这种方式不常用。

        synchronized使用在实例方法上有什么好处？
            代码写得少，节俭了。
        如果共享的对象就是this，并且需要同步的代码块就是整个方法体，建议使用这个方式。
     */
    public synchronized void withdraw(double money){
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
