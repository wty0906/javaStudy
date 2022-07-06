package _03_threadSafe.synchronizedCodeThread;

/**
 * @author ty.wang
 * @since 2022/7/612:26
 */
public class ThreadSynchronizedTest {
    public static void main(String[] args) {
        ThreadSynchronized threadSynchronized1 = new ThreadSynchronized("窗口一");
        ThreadSynchronized threadSynchronized2 = new ThreadSynchronized("窗口一");
        ThreadSynchronized threadSynchronized3 = new ThreadSynchronized("窗口一");
        threadSynchronized1.start();
        threadSynchronized2.start();
        threadSynchronized3.start();
    }
}
