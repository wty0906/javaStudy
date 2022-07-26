package com.wty.jdk.fun;

/**
 * @author ty.wang
 * @since 2022/7/25 17:46
 */

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Supplier 函数式接口的使用
 */
public class SupplierTest {
    public static void main(String[] args) {
        fun1(() -> {
            int arr[]  = {22,99,25,16};
            //计算数组最大值
            Arrays.sort(arr);
            return  arr[arr.length-1];
        });
    }

    private static void fun1(Supplier<Integer> supplier) {
        Integer max = supplier.get();
        System.out.println("max:" + max);

    }
}
