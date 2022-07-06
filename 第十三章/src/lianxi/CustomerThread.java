package lianxi;

/**
 * @author ty.wang
 * @since 2022/7/619:50
 */
public class CustomerThread extends Thread{
    private Product p;

    public CustomerThread(Product p) {
        this.p = p;
    }

    @Override
    public void run() {
        for (int i = 1; i <=10; i++) {
            p.GetProduct();
        }
    }
}
