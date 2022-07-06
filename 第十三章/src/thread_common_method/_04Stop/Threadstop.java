package thread_common_method._04Stop;

/**
 * @author ty.wang
 * @since 2022/7/515:03
 */
public class Threadstop {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            if (i==6){
                Thread.currentThread().stop();
            }
            System.out.println(i);
        }
    }
}
