package _02_thread_common_method._02sleep;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ty.wang
 * @since 2022/7/514:39
 */
public class ThreadCommonMethodSleepLianXi {
    public static void main(String[] args) {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        while (true){
            Date date = new Date();
            String format = dateFormat.format(date);
            System.out.println(format);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
