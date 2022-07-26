package com.wty.jdk.fun;

import java.util.function.Consumer;

/**
 * @author ty.wang
 * @since 2022/7/25 17:52
 */
public class ConsumerTest {
    public static void main(String[] args) {
        test(s -> {
            System.out.println(s+" -> 转换成小写 "+s.toLowerCase());
        });
    }
    static void test(Consumer<String> consumer){
        consumer.accept("Hello World");
    }

}
