package _03_threadSafe.synchronizedCodeRunnable;

/**
 * @author ty.wang
 * @since 2022/7/611:53
 */
public class ThreadSynchronized implements Runnable {
    int ticketNum = 10;


    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            synchronized (this) {
                if (ticketNum > 0) {
                    System.out.println("我在" + Thread.currentThread().getName() + "抢到了第" + ticketNum-- + "张票");
                }
            }
        }
    }
}
