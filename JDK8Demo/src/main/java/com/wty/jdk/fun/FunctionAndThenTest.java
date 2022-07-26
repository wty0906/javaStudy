package com.wty.jdk.fun;

import java.util.function.Function;

/**
 * @author ty.wang
 * @since 2022/7/26 11:46
 */
public class FunctionAndThenTest {
    public static void main(String[] args) {
        test(s -> {
            return Integer.parseInt(s);
        }, s2 -> {
            return s2 * 10;
        });
    }


    public static void test(Function<String, Integer> function, Function<Integer, Integer> function2) {
       /* Integer apply = function.apply("666");
        Integer apply1 = function2.apply(apply);*/
        //Integer apply = function.andThen(function2).apply("666");
        Integer apply = function2.compose(function).apply("666");
        System.out.println("apply1= " + apply);
    }
}
