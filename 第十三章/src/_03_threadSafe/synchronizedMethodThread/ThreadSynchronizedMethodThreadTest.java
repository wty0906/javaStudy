package _03_threadSafe.synchronizedMethodThread;

/**
 * @author ty.wang
 * @since 2022/7/614:41
 */
public class ThreadSynchronizedMethodThreadTest {
    public static void main(String[] args) {
        ThreadSynchronizedMethodThread threadSynchronizedMethodThread1 = new ThreadSynchronizedMethodThread("窗口1");
        ThreadSynchronizedMethodThread threadSynchronizedMethodThread2 = new ThreadSynchronizedMethodThread("窗口2");
        ThreadSynchronizedMethodThread threadSynchronizedMethodThread3 = new ThreadSynchronizedMethodThread("窗口3");
        threadSynchronizedMethodThread1.start();
        threadSynchronizedMethodThread2.start();
        threadSynchronizedMethodThread3.start();
    }
}
