package lianxi;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author ty.wang
 * @since 2022/7/619:39
 */
public class Product {
    //品牌
    private String brand;

    //名字
    private String name;

    //标记 false为生产者生产 true让消费者消费
    boolean flag = false;

    Lock lock = new ReentrantLock();
    Condition producterCondition = lock.newCondition();

    Condition customerCondition = lock.newCondition();


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

    public void SetProduct(String name, String brand) {
        lock.lock();
        try {
            if (flag == true) {
                try {
                    //wait();
                    producterCondition.await();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            this.setName(name);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            this.setBrand(brand);
            System.out.println("生产者生产了：" + this.getBrand() + "---" + this.getName());
            flag = true;
            customerCondition.signal();
            //notify();
        }finally {
            lock.unlock();
        }
    }

    public void GetProduct() {
        lock.lock();
        try {
            if (flag == false) {
                try {
                    customerCondition.await();
                    //wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("消费者消费了：" + this.getBrand() + "---" + this.getName());
            flag = false;
            //notify();
            producterCondition.signal();
        }finally {
            lock.unlock();
        }
    }
}
