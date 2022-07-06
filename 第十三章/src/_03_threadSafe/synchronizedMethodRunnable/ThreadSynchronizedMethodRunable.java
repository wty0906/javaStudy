package _03_threadSafe.synchronizedMethodRunnable;

/**
 * @author ty.wang
 * @since 2022/7/614:30
 */
public class ThreadSynchronizedMethodRunable implements Runnable {
    int ticketNum = 10;
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            extracted();
        }
    }

    public synchronized void extracted() {
        if (ticketNum > 0) {
            System.out.println("我在" + Thread.currentThread().getName() + "抢到了第" + ticketNum-- + "张票");
        }
    }
}
