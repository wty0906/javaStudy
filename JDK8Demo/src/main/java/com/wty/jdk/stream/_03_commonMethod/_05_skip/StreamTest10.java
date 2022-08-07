package com.wty.jdk.stream._03_commonMethod._05_skip;

import java.util.stream.Stream;

/**
 * @author ty.wang
 * @since 2022/8/7 16:16
 */
public class StreamTest10 {
    public static void main(String[] args) {
        String[] s = {"a1","bb","a2","cc","a3","vv","a4"};
        Stream<String> s1 = Stream.of(s);
        s1.skip(5).forEach(System.out::println);
    }
}
