package com.wty.jdk.lambda;

/**
 * @author ty.wang
 * @since 2022/7/25 13:13
 */
public class Demo01Lambda {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("新线程：" + Thread.currentThread().getName());
            }
        }).start();
        System.out.println("主线程：" + Thread.currentThread().getName());
        System.out.println("-----------------------");
        new Thread(() -> {
            System.out.println("新线程lambda表达式...:" + Thread.currentThread().getName());
        }).start();
    }
}
