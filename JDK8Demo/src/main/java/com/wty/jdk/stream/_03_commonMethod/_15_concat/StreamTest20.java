package com.wty.jdk.stream._03_commonMethod._15_concat;


import com.wty.jdk.stream.pojo.Person;

import java.util.stream.Stream;

/**
 * @author ty.wang
 * @since 2022/8/7 16:16
 * 如果有两个流希望合并成为一个流，那么就可以使用stream中的静态方法concat
 * public static <T> Stream<T> concat(Stream<? extends T> a, Stream<? extends T> b) {
 *         Objects.requireNonNull(a);
 *         Objects.requireNonNull(b);
 *
 *         @SuppressWarnings("unchecked")
 *         Spliterator<T> split = new Streams.ConcatSpliterator.OfRef<>(
 *                 (Spliterator<T>) a.spliterator(), (Spliterator<T>) b.spliterator());
 *         Stream<T> stream = StreamSupport.stream(split, a.isParallel() || b.isParallel());
 *         return stream.onClose(Streams.composedClose(a, b));
 *     }
 */

public class StreamTest20 {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("a", "b", "c");
        Stream<String> stream2 = Stream.of("x", "y", "z");
        //通过concat方法将两个流合并为一个新的流，并输出
        Stream.concat(stream1,stream2).forEach(System.out::println);

    }
}
