package lianxi;

/**
 * @author ty.wang
 * @since 2022/7/619:41
 */
public class ProducterThread extends Thread {
    private Product p;

    public ProducterThread(Product p) {
        this.p = p;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                p.SetProduct("巧克力", "费列罗");
            } else {
                p.SetProduct("啤酒", "哈尔滨");
            }

        }
    }
}
