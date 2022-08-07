package com.wty.jdk.stream._02_getStream.collection;

import java.util.*;

/**
 * @author ty.wang
 * @since 2022/8/7 15:47
 */
public class StreamTest03 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.stream();
        Set<String> set = new HashSet<>();
        set.stream();
        Vector<String> vector = new Vector<>();
        vector.stream();
    }
}
