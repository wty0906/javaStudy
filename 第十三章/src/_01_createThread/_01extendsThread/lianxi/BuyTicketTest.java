package _01_createThread._01extendsThread.lianxi;

/**
 * @author ty.wang
 * @since 2022/7/416:57
 */
public class BuyTicketTest {
    public static void main(String[] args) {
        BuyTicketThread thread1 = new BuyTicketThread();
        thread1.setName("窗口1");
        BuyTicketThread thread2 = new BuyTicketThread();
        thread2.setName("窗口2");
        BuyTicketThread thread3 = new BuyTicketThread();
        thread3.setName("窗口3");

        thread1.start();
        thread2.start();
        thread3.start();

    }
}
