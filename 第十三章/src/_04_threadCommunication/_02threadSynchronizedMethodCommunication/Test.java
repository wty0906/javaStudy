package _04_threadCommunication._02threadSynchronizedMethodCommunication;

/**
 * @author ty.wang
 * @since 2022/7/617:19
 */
public class Test {
    public static void main(String[] args) {
        Product product = new Product();
        ProducerThread producerThread = new ProducerThread(product);
        CustomerThread customerThread = new CustomerThread(product);
        producerThread.start();
        customerThread.start();
    }
}
