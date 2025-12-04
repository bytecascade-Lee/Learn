package com.serene.map.linkedhashmap;

import java.util.LinkedHashMap;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/4
 */
public class demo1 {
    public static void main(String[] args) {
        /*
        LinkedHashMap
        由键决定:
            有序、不重复、无索引。
        有序:
            保证存储和取出的顺序一致
        原理:
            底层数据结构是依然哈希表，只是每个键值对元素
            又额外的多了一个双链表的机制记录存储的顺序。
         */
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        map.put("AAA", 123);
        map.put("AAA", 111);
        map.put("BBB", 456);
        map.put("CCC", 789);
        map.put("DDD", 0);

        System.out.println(map);
    }

}
