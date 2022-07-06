package _02_thread_common_method._01join;

/**
 * @author ty.wang
 * @since 2022/7/511:38
 */
public class ThreadCommonMethodJoinTest extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <=10; i++) {
            System.out.println(Thread.currentThread().getPriority()+"---"+i);
        }
    }
}
class ThreadTest02 extends Thread{
    @Override
    public void run() {
        for (int i = 20; i <=30; i++) {
            System.out.println(Thread.currentThread().getPriority()+"-"+i);
        }
    }
}
class Test {
    public static void main(String[] args) {
        ThreadCommonMethodJoinTest threadTest = new ThreadCommonMethodJoinTest();
        //设置线程优先级
        //threadTest.setPriority(10);
        threadTest.start();
        ThreadTest02 threadTest02 = new ThreadTest02();
        //threadTest02.setPriority(1);
        threadTest02.start();
    }
}
