package _04_threadCommunication._01threadSynchronizedCodeCommunication;

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
            synchronized (p){
                if (i % 2 == 0) {
                    //生产弗列罗巧克力
                    p.setBrand("弗列罗");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    p.setName("巧克力");
                }else {
                    //生产啤酒
                    p.setBrand("哈尔滨");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    p.setName("啤酒");
                }
                System.out.println("生产者生产了："+p.getBrand()+"---"+p.getName());
            }
        }
    }
}
