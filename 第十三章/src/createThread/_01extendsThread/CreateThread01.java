package createThread._01extendsThread;

/**
 * @author ty.wang
 * @since 2022/7/415:49
 * 创建线程的三种方法
 * 第一种集成Tread类
 */
public class CreateThread01  extends Thread{
    /*
    * 通过重写run方法，进行争抢资源
    * */

    public CreateThread01(String name) {
        super(name);
    }

    @Override
    public void run() {
        //输出1-10
        for (int i = 1; i <=10; i++) {
            System.out.println(this.getName()+i);
        }
    }
}
