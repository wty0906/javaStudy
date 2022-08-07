package com.wty.jdk.stream._03_commonMethod._11_max_min;


import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author ty.wang
 * @since 2022/8/7 16:16
 * 如果我们需要获取最大值和最小值，那就可以使用max或者min
 * Optional<T> max(Comparator<? super T> comparator);
 *    Optional<T> min(Comparator<? super T> comparator);
 */

public class StreamTest16 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("1", "3", "2", "6", "4", "7", "5", "1", "0");
        Optional<Integer> max = stream.map(Integer::parseInt).max((o1, o2) -> o1 - o2);
        System.out.println(max.get());
        Stream<String> stream1 = Stream.of("1", "3", "2", "6", "4", "7", "5", "1", "0");
        Optional<Integer> min = stream1.map(Integer::parseInt).min((o1, o2) -> o1 - o2);
        System.out.println(min.get());
    }
}
