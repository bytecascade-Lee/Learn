package com.serene.map.map;

import java.util.HashMap;
import java.util.Map;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/1
 */
public class demo1 {
    public static void main(String[] args) {
        /*
        V put(K key,V value)                添加元素
        V remove(object key)                根据键删除键值对元素
        void clear()                        移除所有的键值对元素
        boolean containsKey(object key)     判断集合是否包含指定的键
        boolean containsValue(object value) 判断集合是否包含指定的值
        boolean isEmpty()                   判断集合是否为空
        int size()                          集合的长度，也就是集合中键值对的个数

         */

        Map<String, String> husbandAndWifeMap = new HashMap<>();

        // 1. put
        // put的返回值是：
        // 当键不存在时，返回null，然后添加键值对
        // 当键已存在时，返回对应值，然后值被替换
        husbandAndWifeMap.put("郭靖", "黄蓉");
        husbandAndWifeMap.put("韦小宝","沐剑屏");
        husbandAndWifeMap.put("尹志平", "小龙女");
        System.out.println(husbandAndWifeMap);

        // 2.remove
        // remove的返回值是：
        // 要删除的键值对的值
        husbandAndWifeMap.remove("郭靖");
        System.out.println(husbandAndWifeMap);

        // 3.contains
        // 判断是否包含
        System.out.println(husbandAndWifeMap.containsKey("尹志平"));
        System.out.println(husbandAndWifeMap.containsValue("沐剑屏"));

        // 4.isEmpty
        System.out.println(husbandAndWifeMap.isEmpty());

        // 5.size
        husbandAndWifeMap.put("郭靖", "黄蓉");
        System.out.println(husbandAndWifeMap.size());

    }
}
