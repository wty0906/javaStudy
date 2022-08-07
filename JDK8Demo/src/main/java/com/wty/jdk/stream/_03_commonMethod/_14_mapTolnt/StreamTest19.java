package com.wty.jdk.stream._03_commonMethod._14_mapTolnt;


import com.wty.jdk.stream.pojo.Person;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author ty.wang
 * @since 2022/8/7 16:16
 */

public class StreamTest19 {
    public static void main(String[] args) {
        //Integer占用内存比int多很多，在Stream流操作中会自动装箱和拆箱操作
        Integer[] i = {1, 2, 3, 5, 6, 8};
        Stream.of(i).filter(i1 -> i1 > 0).forEach(System.out::println);
        System.out.println("---->");
        //为了提高程序代码的效率，我们可以先将流中Integer数据转换为int数据，然后再操作
        Integer[] i1 = {1, 2, 3, 5, 6, 8};
        IntStream intStream = Stream.of(i1).mapToInt(Integer::intValue);
        intStream.filter(value -> value>3).forEach(System.out::println);
    }
}
