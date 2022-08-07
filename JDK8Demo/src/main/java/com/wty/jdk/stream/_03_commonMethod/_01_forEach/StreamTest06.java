package com.wty.jdk.stream._03_commonMethod._01_forEach;

import java.util.stream.Stream;

/**
 * @author ty.wang
 * @since 2022/8/7 16:16
 */
public class StreamTest06 {
    public static void main(String[] args) {
        String[] s = {"a","b","c","d"};
        Stream<String> s1 = Stream.of(s);
        s1.forEach(System.out::println);
    }
}
