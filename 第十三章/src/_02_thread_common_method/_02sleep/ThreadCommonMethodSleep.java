package _02_thread_common_method._02sleep;

/**
 * @author ty.wang
 * @since 2022/7/511:59
 */
public class ThreadCommonMethodSleep extends Thread {

    public static void main(String[] args) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("00");
    }
}

