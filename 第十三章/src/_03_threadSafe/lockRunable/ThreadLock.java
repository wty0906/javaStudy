package _03_threadSafe.lockRunable;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author ty.wang
 * @since 2022/7/615:01
 */
public class ThreadLock implements Runnable {
    int ticketNum = 10;
    Lock lock = new ReentrantLock();

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            //拿来一把锁
            lock.lock();
            try {
                if (ticketNum > 0) {
                    System.out.println("我在" + Thread.currentThread().getName() + "抢到了第" + ticketNum-- + "张票");
                }
            }catch (Exception e){

            }finally {
                lock.unlock();
            }
        }
    }
}
