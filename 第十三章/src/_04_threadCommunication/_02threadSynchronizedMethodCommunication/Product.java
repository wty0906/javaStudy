package _04_threadCommunication._02threadSynchronizedMethodCommunication;

/**
 * @author ty.wang
 * @since 2022/7/617:09
 */
public class Product {
    //品牌
    private String brand;
    //名字
    private String name;

    //线程通信字段 false 让生产者生产，true让消费者消费
    boolean flag = false;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public synchronized void setProduct(String brand, String name) {
        if (flag == true) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        this.setBrand(brand);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        this.setName(name);
        System.out.println("生产者生产了：" + this.getBrand() + "---" + this.getName());
        flag = true;
        notify();
    }

    public synchronized void getProduct() {
        if (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        System.out.println("消费者消费了：" + this.getBrand() + "---" + this.getName());
        flag = false;
        notify();
    }
}
