package com.wty.jdk.stream._02_getStream.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

/**
 * @author ty.wang
 * @since 2022/8/7 15:50
 */
public class StreamTest04 {
    public static void main(String[] args) {
        //map获取stream
        HashMap<String, Object> map = new HashMap<>();
        Stream<String> stream = map.keySet().stream();//key
        Stream<Object> stream1 = map.values().stream();//value
        Stream<Map.Entry<String, Object>> stream2 = map.entrySet().stream();//entry

    }
}
