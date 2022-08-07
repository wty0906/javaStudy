package com.wty.jdk.stream._03_commonMethod._12_reduce;


import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author ty.wang
 * @since 2022/8/7 16:16
 * 如果我们需要将所有数据归纳得到一个数据，我们可以使用reduce方法
 * T reduce(T identity, BinaryOperator<T> accumulator);
 */

public class StreamTest17 {
    public static void main(String[] args) {
        Integer reduce = Stream.of(1, 3, 2, 6)
                //identity默认值
                //第一次的时候会将默认值赋值给X
                //之后每次会将上一次的操作结果赋值给X Y就是每次从数据中获取的元素
                .reduce(0, (x, y) -> {
            System.out.println("x:"+x+","+"y:"+y);
            return x + y;
        });
        System.out.println(reduce);
        Integer max = Stream.of( 3, 3, 6)
                .reduce(0, (x, y) -> {
                    System.out.println("x:"+x+","+"y:"+y);
                    return x > y ? x : y;
                });
        System.out.println(max);
    }
}
