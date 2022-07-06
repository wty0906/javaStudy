package createThread._03implementsCallable;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author ty.wang
 * @since 2022/7/511:03
 */
public class CreateThread03 implements Callable<Integer> {
    /*
    * 1.实现Callable接口，可以不带泛型，如果不带泛型，那么call方式的返回值就是Object类型
    * 2.如果带泛型，那么call的返回值就是泛型对应的类型
    * 3.从call方法看到，方法有返回值，可以抛出异常
    * */
    @Override
    public Integer call() throws Exception {
        return new Random().nextInt(10);
    }

}
class test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CreateThread03 createThread03 = new CreateThread03();
        //借助FutureTask类让createThread与Runable类建立联系，
        // 使得可以通过Thread类中的start方法调用FutureTask类中的run方法，在FutureTask类中的run方法调用了Callable的call方法
        FutureTask futureTask = new FutureTask(createThread03);
        Thread thread = new Thread(futureTask);
        thread.start();
        //获取到子线程返回值
        Object o = futureTask.get();
        System.out.println(o);

    }
}