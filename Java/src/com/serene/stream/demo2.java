package com.serene.stream;

import java.util.ArrayList;
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
        stream.forEach(s -> System.out.println(s));

        // 双列集合
        HashMap<String, Integer> map = new HashMap<>();
        map.put("aaa", 111);
        map.put("bbb", 222);
        map.put("ccc", 333);
        map.put("ddd", 444);
        map.put("eee", 555);

        map.keySet().stream().forEach(s -> System.out.println(s + " = " + map.get(s)));

    }

}
