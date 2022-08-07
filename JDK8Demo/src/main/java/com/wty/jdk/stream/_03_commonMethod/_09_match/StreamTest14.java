package com.wty.jdk.stream._03_commonMethod._09_match;


import com.wty.jdk.stream.pojo.Person;

import java.util.stream.Stream;

/**
 * @author ty.wang
 * @since 2022/8/7 16:16
 * boolean anyMatch(Predicate<? super T> predicate);//元素是否有任意一个满足条件
 * boolean allMatch(Predicate<? super T> predicate);//元素是否满足条件
 * boolean noneMatch(Predicate<? super T> predicate);//元素是否都不满足条件
 */
public class StreamTest14 {
    public static void main(String[] args) {
        boolean b = Stream.of("1", "3", "2", "6", "4", "7", "5", "1", "0")
                .map(Integer::parseInt)
                //.allMatch(s -> s > 0);元素是否满足条件
                //.anyMatch(integer -> integer > 4);//元素是否有任意一个满足条件
                .noneMatch(integer -> integer > 4);//元素是否都不满足条件
        System.out.println(b);
    }
}
