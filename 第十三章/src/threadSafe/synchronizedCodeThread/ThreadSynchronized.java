package threadSafe.synchronizedCodeThread;

/**
 * @author ty.wang
 * @since 2022/7/612:20
 */
public class ThreadSynchronized extends Thread {
    static int ticketNum = 10;

    public ThreadSynchronized(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            synchronized (ThreadSynchronized.class) {
                if (ticketNum > 0) {
                    System.out.println("我在" + Thread.currentThread().getName() + "抢到了第" + ticketNum-- + "张票");
                }
            }
        }
    }
}
