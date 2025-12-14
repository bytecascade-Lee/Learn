package com.serene.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.stream.Stream;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/12
 */
public class demo2 {
    public static void main(String[] args) {
        /*
        单列集合        default stream<E> stream()                        Collection中的默认方法无法直接使用stream流
        双列集合        无
        数组            public static<T> stream<T> stream(T[] array)      Arrays工具类中的静态方法
        一堆零散数据    public static<T> stream<T> of(T... values) stream 接口中的静态方法

         */

        // 单列集合
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "a", "b", "c", "d", "e", "f", "g");

        Stream<String> stream = list.stream();
        stream.forEach(System.out::println);

        // 双列集合
        HashMap<String, Integer> map = new HashMap<>();
        map.put("aaa", 111);
        map.put("bbb", 222);
        map.put("ccc", 333);
        map.put("ddd", 444);
        map.put("eee", 555);

        map.keySet().stream().forEach(s -> System.out.println(s + " = " + map.get(s)));
        map.entrySet().stream().forEach(System.out::println);

        // 数组
        int[] arr = {1, 2, 3, 4, 5, 6,};
        Arrays.stream(arr).forEach(System.out::println);

        String[] arr2 = {"a", "b", "c", "d"};
        Arrays.stream(arr2).forEach(System.out::println);

        // 一堆零散数据（同一类型）
        // 注意:
        // Stream接口中静态方法of的细节
        // 方法的形参是一个可变参数，可以传递一堆零散的数据，也可以传递数组
        // 但是数组必须是引用数据类型的，如果传递基本数据类型，是会把整个数组当做一个元素，放到stream当中。
        Stream.of(1, 2, 3, 4, 5).forEach(System.out::println);
        Stream.of('a', 'b', 'c', 'd', 'e').forEach(System.out::println);

    }

}
