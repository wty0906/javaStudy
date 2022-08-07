package com.wty.jdk.stream._02_getStream.ofFun;

import java.util.stream.Stream;

/**
 * @author ty.wang
 * @since 2022/8/7 15:52
 */
public class StreamTest05 {
    public static void main(String[] args) {
        //数组中的数据获取steam
        Stream<String> stream = Stream.of("a1", "a2", "a3", "a4", "a5");
        String[] arr1 = {"aa","bb","cc"};
        Stream<String> arr11 = Stream.of(arr1);
        Integer[] i = {1,2,3,4};
        Stream.of(i).forEach(System.out::println);
        System.out.println("--->");
        //注意：基本数据类型的数组是不行的，他会当一个元素进行处理
        int[] a ={1,2,3,4};
        Stream.of(a).forEach(System.out::println);

    }
}
