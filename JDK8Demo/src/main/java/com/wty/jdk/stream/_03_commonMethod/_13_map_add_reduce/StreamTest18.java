package com.wty.jdk.stream._03_commonMethod._13_map_add_reduce;


import com.wty.jdk.stream.pojo.Person;

import java.util.stream.Stream;

/**
 * @author ty.wang
 * @since 2022/8/7 16:16
 * 如果我们需要将所有数据归纳得到一个数据，我们可以使用reduce方法
 * T reduce(T identity, BinaryOperator<T> accumulator);
 * map方法和reduce方法结合使用
 */

public class StreamTest18 {
    public static void main(String[] args) {
        //1.求出所有的年龄的总和
        Integer sumAge = Stream.of(
                        new Person("张三", 18),
                        new Person("李四", 22),
                        new Person("张三", 13),
                        new Person("王五", 15),
                        new Person("张三", 19)
                ).map(Person::getAge)//实现类型转换
                .reduce(0, Integer::sum);
        System.out.println(sumAge);
        //2.求出所有的年龄中的最大值
        Integer maxAge = Stream.of(
                        new Person("张三", 18),
                        new Person("李四", 22),
                        new Person("张三", 13),
                        new Person("王五", 15),
                        new Person("张三", 19)
                ).map(Person::getAge)//实现类型转换,符合reduce对数据的要求
                .reduce(0, Math::max);//reduce实现数据的处理
        System.out.println(maxAge);
        //3.统计字符a出现的次数
        Integer reduce = Stream.of("a", "b", "c", "d", "a", "c", "a")
                .map(s -> s.equals("a") ? 1 : 0).reduce(0, Integer::sum);
        System.out.println(reduce);
    }
}
