package _03_threadSafe.synchronizedMethodThread;

/**
 * @author ty.wang
 * @since 2022/7/614:39
 */
public class ThreadSynchronizedMethodThread extends Thread {
    static int ticketNum = 10;

    public ThreadSynchronizedMethodThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            buyTicket();
        }
    }

    public static synchronized void buyTicket() {
        if (ticketNum > 0) {
            System.out.println("我在" + Thread.currentThread().getName() + "抢到了第" + ticketNum-- + "张票");
        }
    }
}
