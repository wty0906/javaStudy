package com.wty.jdk.stream._03_commonMethod._08_distinct;




import com.wty.jdk.stream.pojo.Person;

import java.util.stream.Stream;

/**
 * @author ty.wang
 * @since 2022/8/7 16:16
 * Stream流中的distinct方法对基本数据类型是可以直接去重的，但是对于自定义类型，我们是需要重写hashCode方法和equals方法来移除重复元素
 */
public class StreamTest13 {
    public static void main(String[] args) {
        String[] s = {"1", "3", "2", "6", "4", "7", "5", "1"};
        Stream<String> s1 = Stream.of(s);
        //指定排序规则
        s1.map(s2 -> Integer.parseInt(s2))
                .sorted((o1, o2) -> o2 - o1)
                .distinct()//去重
                .forEach(System.out::println);
        System.out.println("_______________________");
        Stream.of(
                new Person("张三", 18),
                new Person("李四", 22),
                new Person("张三", 18)
        ).distinct().forEach(System.out::println);
    }
}
