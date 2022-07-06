package _02_thread_common_method._01join;

/**
 * @author ty.wang
 * @since 2022/7/511:59
 */
public class ThreadCommonMethodJoin extends Thread {

    public ThreadCommonMethodJoin(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + "---" + i);
        }
    }
}

class ThreadTest {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= 100; i++) {
            if (i == 6) {
                ThreadCommonMethodJoin threadCommonMethodJoin = new ThreadCommonMethodJoin("子线程");
                threadCommonMethodJoin.start();
                threadCommonMethodJoin.join();
            }
            System.out.println(Thread.currentThread().getName() + "---" + i);
        }
    }
}
