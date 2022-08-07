package com.wty.jdk.stream._03_commonMethod._04_limit;

import java.util.stream.Stream;

/**
 * @author ty.wang
 * @since 2022/8/7 16:16
 */
public class StreamTest09 {
    public static void main(String[] args) {
        String[] s = {"a1","bb","a2","cc","a3","vv","a4"};
        Stream<String> s1 = Stream.of(s);
        s1.limit(5).forEach(System.out::println);
    }
}
