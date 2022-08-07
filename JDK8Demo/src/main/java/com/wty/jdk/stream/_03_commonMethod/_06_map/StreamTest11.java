package com.wty.jdk.stream._03_commonMethod._06_map;

import java.util.stream.Stream;

/**
 * @author ty.wang
 * @since 2022/8/7 16:16
 */
public class StreamTest11 {
    public static void main(String[] args) {
        String[] s = {"1","2","3","4","5","6","7"};
        Stream<String> s1 = Stream.of(s);
        s1.map(s2 -> Integer.parseInt(s2)).forEach(System.out::println);
        System.out.println("---->简便写法");
        Stream<String> s2 = Stream.of(s);
        s2.map(Integer::parseInt).forEach(System.out::println);
    }
}
