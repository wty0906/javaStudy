package lianxi;

/**
 * @author ty.wang
 * @since 2022/7/619:38
 */
public class Test {
    public static void main(String[] args) {
        Product product = new Product();
        ProducterThread producterThread = new ProducterThread(product);
        CustomerThread customerThread = new CustomerThread(product);
        producterThread.start();
        customerThread.start();
    }
}
