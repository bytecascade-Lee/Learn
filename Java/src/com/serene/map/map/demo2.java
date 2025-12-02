package com.serene.map.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/1
 */
public class demo2 {
    public static void main(String[] args) {
        Map<String, String> husbandAndWifeMap = new HashMap<>();
        husbandAndWifeMap.put("郭靖", "黄蓉");
        husbandAndWifeMap.put("韦小宝", "沐剑屏");
        husbandAndWifeMap.put("尹志平", "小龙女");
        Set<String> husband = husbandAndWifeMap.keySet();

        // 练习一:利用键找值的方式遍历map集合，要求:装着键的单列集合使用增强for的形式进行遍历
        for (String s : husband) {
            System.out.println(s + " = " + husbandAndWifeMap.get(s));
        }

        // 练习二:利用键找值的方式遍历map集合，要求:装着键的单列集合使用迭代器的形式进行遍历
        Iterator<String> iterator = husband.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println(s + " = " + husbandAndWifeMap.get(s));
        }

        // 练习三:利用键找值的方式遍历map集合，要求:装着键的单列集合使用Lambda表达式的形式进行遍历
        husband.forEach(s ->
                System.out.println(s + " = " + husbandAndWifeMap.get(s)));
    }

}
