package com.serene.map.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/2
 */
public class demo3 {
    public static void main(String[] args) {
        System.out.println("礻扌犭亻灬：");
        Map<String, String> 礻扌犭亻灬 = new HashMap<>();
        礻扌犭亻灬.put("狄仁杰", "胖灵");
        礻扌犭亻灬.put("李元芳", "挂灵");
        礻扌犭亻灬.put("武则天", "剁灵");
        礻扌犭亻灬.put("曾  泰", "舔灵");
        礻扌犭亻灬.put("虺文忠", "闪灵");
        礻扌犭亻灬.put("苏显儿", "变灵");
        礻扌犭亻灬.put("肖清芳", "怨灵");
        礻扌犭亻灬.put("林永忠", "锤灵");
        礻扌犭亻灬.put("金木兰", "奶灵");
        礻扌犭亻灬.put("李青霞", "胸灵");

        // Map的第二种遍历方式：获取entry对象
        Set<Map.Entry<String, String>> entries = 礻扌犭亻灬.entrySet();

        // 练习一:通过键值对对象遍历map集合，要求:装着键值对的单列集合使用增强for的形式进行遍历
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        // 练习二:通过键值对对象遍历map集合，要求:装着键值对的单列集合使用迭代器的形式进行遍历
        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> next = iterator.next();
            System.out.println(next.getKey() + " = " + next.getValue());
        }

        // 练习三:通过键值对对象遍历map集合，要求:装着键值对的单列集合使用Lambda表达式的形式进行遍历
        entries.forEach(entry ->
                System.out.println(entry.getKey() + " = " + entry.getValue())
        );


    }

}
