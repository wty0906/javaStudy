package com.wty.jdk.fun;

import java.util.function.Consumer;

/**
 * @author ty.wang
 * @since 2022/7/25 17:52
 */
public class ConsumerAndThenTest {
    public static void main(String[] args) {
        test2(s -> {
            System.out.println(s+" -> 转换成小写 "+s.toLowerCase());
        },s1 -> {
            System.out.println(s1+" -> 转换成大写 "+s1.toUpperCase());
        });
    }
    static void test(Consumer<String> consumer){
        consumer.accept("Hello World");
    }
    static void test2(Consumer<String> consumer, Consumer<String> consumer2){
        String str = "Hello World";
        //consumer.accept(str);
        //consumer2.accept(str);
        //consumer.andThen(consumer2).accept(str);
        consumer2.andThen(consumer).accept(str);
    }
}
