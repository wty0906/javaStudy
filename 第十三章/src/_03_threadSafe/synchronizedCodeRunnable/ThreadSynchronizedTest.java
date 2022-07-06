package _03_threadSafe.synchronizedCodeRunnable;

/**
 * @author ty.wang
 * @since 2022/7/611:59
 */
public class ThreadSynchronizedTest {

    public static void main(String[] args) {
        ThreadSynchronized threadSynchronized = new ThreadSynchronized();
        Thread thread1 = new Thread(threadSynchronized, "窗口1");
        Thread thread2 = new Thread(threadSynchronized, "窗口2");
        Thread thread3 = new Thread(threadSynchronized, "窗口3");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
