package _04_threadCommunication._03threadLockCommunication;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

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

    //定义lock锁
    Lock lock = new ReentrantLock();
    //声明一个生产者的等待队列
    Condition producterCondition = lock.newCondition();
    //声明一个消费者的等待队列
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

    public void setProduct(String brand, String name) {
        lock.lock();
        try {
            if (flag == true) {
                try {
                    producterCondition.await();
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
            customerCondition.signal();
        } finally {
            lock.unlock();
        }
    }

    public void getProduct() {
        lock.lock();
        try {
            if (!flag) {
                try {
                    customerCondition.await();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("消费者消费了：" + this.getBrand() + "---" + this.getName());
            flag = false;
            //通知生产者生产：
            producterCondition.signal();
        } finally {
            lock.unlock();
        }

    }
}
