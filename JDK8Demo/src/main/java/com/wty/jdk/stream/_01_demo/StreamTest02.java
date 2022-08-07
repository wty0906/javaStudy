package com.wty.jdk.stream._01_demo;

import java.util.Arrays;
import java.util.List;

/**
 * @author ty.wang
 * @since 2022/8/7 15:26
 */
public class StreamTest02 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("张三","成龙","周星驰","张三丰");
        list.stream().filter(s -> s.startsWith("张")).filter(s -> s.length()==3).forEach(s -> System.out.println(s));
        System.out.println("---->");
        list.stream().filter(s -> s.startsWith("张")).filter(s -> s.length()==3).forEach(System.out::println);
    }
}
