package _03_threadSafe.lockRunable;

/**
 * @author ty.wang
 * @since 2022/7/615:05
 */
public class ThreadLockTest {
    public static void main(String[] args) {
        ThreadLock threadLock = new ThreadLock();
        Thread thread1 = new Thread(threadLock, "窗口1");
        Thread thread2 = new Thread(threadLock, "窗口2");
        Thread thread3 = new Thread(threadLock, "窗口3");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
