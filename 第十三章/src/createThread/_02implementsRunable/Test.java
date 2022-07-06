package createThread._02implementsRunable;

/**
 * @author ty.wang
 * @since 2022/7/510:23
 */
public class Test {
    public static void main(String[] args) {
        CreateThread02 thread02 = new CreateThread02();
        Thread thread = new Thread(thread02, "子线程");
        thread.start();

        for (int i = 1; i <=10 ; i++) {
            System.out.println("主线程---"+i);
        }
    }
}
