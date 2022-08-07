package com.wty.jdk.stream._03_commonMethod._03_filter;

import java.util.stream.Stream;

/**
 * @author ty.wang
 * @since 2022/8/7 16:16
 */
public class StreamTest08 {
    public static void main(String[] args) {
        String[] s = {"a1","bb","a2","cc","a3","vv","a4"};
        Stream<String> s1 = Stream.of(s);
        s1.filter(s2 -> s2.contains("a")).forEach(System.out::println);
    }
}
