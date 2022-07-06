package createThread._01extendsThread.lianxi;

/**
 * @author ty.wang
 * @since 2022/7/416:23
 */
public class BuyTicketThread extends Thread{
    static int ticketNum = 10;

    @Override
    public void run() {
        for (int i = 1; i <=100; i++) {
            if (ticketNum>0){
                System.out.println("我在"+this.getName()+"抢到了第"+ticketNum--+"章票");
            }
        }
    }
}
