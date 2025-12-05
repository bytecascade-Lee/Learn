package com.serene.map.treemap;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/4
 */
public class demo3 {
    public static void main(String[] args) {
        /*
        统计个数
        需求:字符串“aababcabcdabcde”
        请统计字符串中每一个字符出现的次数，并按照以下格式输出
        输出结果:a(5)b(4)c(3)d(2)e(1)
         */

        TreeMap<Character, Integer> map = new TreeMap<>(new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return o1 - o2;
            }
        });

        String s = "aababcabcdabcde";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        map.forEach((ch, times) ->
                System.out.print(ch + "(" + times + ")"));
    }

}
