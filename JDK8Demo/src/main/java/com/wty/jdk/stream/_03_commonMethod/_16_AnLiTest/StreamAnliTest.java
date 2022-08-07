package com.wty.jdk.stream._03_commonMethod._16_AnLiTest;

import com.wty.jdk.stream.pojo.Person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author ty.wang
 * @since 2022/8/7 18:03
 * Stream综合案例
 * 定义两个集合，然后哎集合中存储多个用户名称，然后完成如下操作：
 * 1.第一个队伍只保留姓名长度为3的成员
 * 2.第一个队伍筛选之后只要前3个人
 * 3.第二个队伍只要姓张的成员
 * 4.第二个队伍筛选之后不要前两个人
 * 5.将两个队伍合并为一个队伍
 * 6.根据姓名创建Person对象
 * 7.打印整个队伍的Person信息
 */
public class StreamAnliTest {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("迪丽热巴", "宋远桥", "苏星河", "老子", "庄子", "孙子", "洪七公");
        List<String> list2 = Arrays.asList("古力娜扎", "张无忌", "张三丰", "赵丽颖", "张二狗", "张天爱", "张三");
        // 1.第一个队伍只保留姓名长度为3的成员
        //2.第一个队伍筛选之后只要前3个人
        Stream<String> stream1 = list1.stream().filter(s -> s.length() > 3).limit(3);
        //3.第二个队伍只要姓张的成员
        //4.第二个队伍筛选之后不要前两个人
        Stream<String> stream2 = list2.stream().filter(s -> s.startsWith("张")).skip(2);
        //5.将两个队伍合并为一个队伍
        //6.根据姓名创建Person对象
        Stream.concat(stream1, stream2).map(Person::new).forEach(System.out::println);



    }
}
