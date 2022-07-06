package _04_threadCommunication._01threadSynchronizedCodeCommunication;

/**
 * @author ty.wang
 * @since 2022/7/617:17
 */
public class CustomerThread extends Thread{
    //共享商品
    private Product p;

    public CustomerThread(Product p) {
        this.p = p;
    }

    @Override
    public void run() {
        for (int i = 1; i <=10; i++) {
            synchronized (p){
                System.out.println("消费者消费了："+p.getBrand()+"---"+p.getName());
            }
        }
    }
}
