package com.serene.map.map;

import java.util.HashMap;
import java.util.Map;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/2
 */
public class demo4 {
    public static void main(String[] args) {
        Map<String, Double> fruits = new HashMap<>();
        fruits.put("Apple", 3.5);
        fruits.put("Banana", 1.98);
        fruits.put("Peach", 3.0);
        fruits.put("Watermelon", 0.88);

        // Map的第三种遍历方式：直接使用Lambda表达式
        fruits.forEach((fruit,  price) ->
                System.out.println(fruit + " = " + price));

    }

}
