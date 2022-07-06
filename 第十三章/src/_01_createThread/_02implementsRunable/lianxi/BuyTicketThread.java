package _01_createThread._02implementsRunable.lianxi;

/**
 * @author ty.wang
 * @since 2022/7/510:26
 */
public class BuyTicketThread implements Runnable {
    int ticketNum = 10;
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if (ticketNum>0){
                System.out.println("我在"+Thread.currentThread().getName()+"---抢到了第"+ticketNum--+"张票");
            }

        }
    }
}
