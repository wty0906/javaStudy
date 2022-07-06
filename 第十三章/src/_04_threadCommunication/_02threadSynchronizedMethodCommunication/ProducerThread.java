package _04_threadCommunication._02threadSynchronizedMethodCommunication;

/**
 * @author ty.wang
 * @since 2022/7/617:10
 * 生产者线程
 */
public class ProducerThread extends Thread {
    //共享商品
    private Product p;

    public ProducerThread(Product p) {
        this.p = p;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                //生产弗列罗巧克力
                p.setProduct("费列罗","巧克力");
            } else {
                //生产啤酒
                p.setProduct("哈尔滨","啤酒");
            }
        }
    }
}
