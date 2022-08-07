package com.wty.jdk.stream._03_commonMethod._10_find;


import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author ty.wang
 * @since 2022/8/7 16:16
 * 如果我们需要找到某些元素或数据，那就可以使用find
 * Optional<T> findFirst();
 * Optional<T> findAny();
 */
public class StreamTest15 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("1", "3", "2", "6", "4", "7", "5", "1", "0");
        Optional<String> first = stream.findFirst();
        System.out.println(first.get());
        System.out.println("--------->");
        Stream<String> stream1 = Stream.of("1", "3", "2", "6", "4", "7", "5", "1", "0");
        Optional<String> any = stream1.findAny();
        System.out.println(any.get());
    }
}
