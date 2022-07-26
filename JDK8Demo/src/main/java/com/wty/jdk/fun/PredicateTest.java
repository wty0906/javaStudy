package com.wty.jdk.fun;

import java.util.function.Predicate;

/**
 * @author ty.wang
 * @since 2022/7/26 12:02
 */
public class PredicateTest {
    public static void main(String[] args) {
        test(s -> {
            return s.length() > 3;
        }, "Hello World");
    }

    public static void test(Predicate<String> predicate, String msg) {
        boolean test = predicate.test(msg);
        System.out.println(" test ：" + test);

    }
}
