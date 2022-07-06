package _02_thread_common_method._03SetDaemon;

/**
 * @author ty.wang
 * @since 2022/7/514:52
 */
public class ThreadSetDaemon extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.println("子线程----" + i);
        }
    }
}
class ThreadSetDaemonTest {
    public static void main(String[] args) {
        ThreadSetDaemon threadSetDaemon = new ThreadSetDaemon();
        //设置伴随线程   注意：先设置在启动
        threadSetDaemon.setDaemon(true);
        threadSetDaemon.start();



        for (int i = 1; i <=10; i++) {
            System.out.println("main---"+i);

        }
    }
}
