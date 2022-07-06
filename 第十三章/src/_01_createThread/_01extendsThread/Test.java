package _01_createThread._01extendsThread;

/**
 * @author ty.wang
 * @since 2022/7/415:55
 */
public class Test {
    public static void main(String[] args) {
        Thread.currentThread().setName("主线程");
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName()+"1--" + i);
        }
        //制造其他线程，要主线程争抢资源
        //具体的线程对象
        CreateThread01 createThread01 = new CreateThread01("子线程");
        createThread01.start();
        //主线程中也要输出1-10
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName()+"2---" + i);
        }
    }
}
