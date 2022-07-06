package _01_createThread._02implementsRunable.lianxi;

/**
 * @author ty.wang
 * @since 2022/7/510:30
 */
public class Test {
    public static void main(String[] args) {
        BuyTicketThread ticketThread = new BuyTicketThread();
        Thread thread1 = new Thread(ticketThread, "窗口1");
        Thread thread2 = new Thread(ticketThread, "窗口2");
        Thread thread3 = new Thread(ticketThread, "窗口3");
        thread1.start();
        thread2.start();
        thread3.start();
        for (int i = 1; i <=10; i++) {
            System.out.println(Thread.currentThread().getName()+"---"+i);
        }
    }
}
