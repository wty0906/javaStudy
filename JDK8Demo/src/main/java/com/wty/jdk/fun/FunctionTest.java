package com.wty.jdk.fun;

import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author ty.wang
 * @since 2022/7/26 11:46
 */
public class FunctionTest {
    public static void main(String[] args) {
        test(s -> {
            return Integer.parseInt(s);
        });
    }
    public static void test(Function<String,Integer> function) {
        Integer apply = function.apply("666");
        System.out.println("apply= "+apply);
    }
}
