package threadSafe.synchronizedMethodRunnable;

/**
 * @author ty.wang
 * @since 2022/7/614:36
 */
public class ThreadSynchronizedMethodRunableTest {
    public static void main(String[] args) {
        ThreadSynchronizedMethodRunable threadSynchronizedMethodRunable = new ThreadSynchronizedMethodRunable();
        Thread thread = new Thread(threadSynchronizedMethodRunable, "窗口1");
        Thread thread1 = new Thread(threadSynchronizedMethodRunable, "窗口2");
        Thread thread2 = new Thread(threadSynchronizedMethodRunable, "窗口3");
        thread.start();
        thread1.start();
        thread2.start();
    }
}
