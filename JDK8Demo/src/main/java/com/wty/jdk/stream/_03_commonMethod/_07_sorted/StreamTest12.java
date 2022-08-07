package com.wty.jdk.stream._03_commonMethod._07_sorted;

import java.util.stream.Stream;

/**
 * @author ty.wang
 * @since 2022/8/7 16:16
 */
public class StreamTest12 {
    public static void main(String[] args) {
        String[] s = {"1","3","2","6","4","7","5"};
        Stream<String> s1 = Stream.of(s);
        //指定排序规则
        s1.map(s2 -> Integer.parseInt(s2)).sorted((o1, o2) -> o2-o1).forEach(System.out::println);
        System.out.println("---->");
        //不指定规则
        Stream<String> s2 = Stream.of(s);
        s2.map(s3 -> Integer.parseInt(s3)).sorted().forEach(System.out::println);
    }
}
