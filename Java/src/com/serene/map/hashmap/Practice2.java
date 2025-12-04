package com.serene.map.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/4
 */
public class Practice2 {
    public static void main(String[] args) {
        /*
        Map集合案例-统计投票人数
        需求
        某个班级80名学生，现在需要组成秋游活动，班长提供了四个景点，
        依次是(A、B、C、D)，每个学生最多只能选择一个景点，
        请统计出最终哪个景点想去的人。

         */

        Map<Character, Integer> attraction = new HashMap<>();
        Random r = new Random();
        char[] chars = {'A', 'B', 'C', 'D'};
        for (int i = 0; i < 80; i++) {
            char k = chars[r.nextInt(4)];
            attraction.put(k, attraction.getOrDefault(k, 0) + 1);
//            if (attraction.containsKey(k)) {
//                attraction.put(k, attraction.get(k) + 1);
//            } else {
//                attraction.put(k, 1);
//            }
        }

        attraction.forEach((a, b) ->
                System.out.println(a + " = " + b));

        int max = 0;
        Set<Map.Entry<Character, Integer>> entries = attraction.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            max = entry.getValue() > max ? entry.getValue() : max;
        }

        for (Map.Entry<Character, Integer> entry : entries) {
            if (entry.getValue() == max) {
                System.out.println(entry.getKey());
            }
        }
    }

}
