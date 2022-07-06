package createThread._02implementsRunable;

/**
 * @author ty.wang
 * @since 2022/7/510:21
 */
public class CreateThread02 implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName()+"---"+i);
        }
    }
}
