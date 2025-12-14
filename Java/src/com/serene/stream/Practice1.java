package com.serene.stream;

import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/14
 */
public class Practice1 {
    public static void main(String[] args) {
        /*
        数据过滤
        定义一个集合，并添加一些整数1，2，3，4，5，6，7，8，9，10
        1. 只留下偶数。
        2. 只留下2的非负数次幂。
        使用位运算计算，并将结果保存起来
         */

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(i + 1);
        }

        Set<Integer> collect1 = arrayList.stream()
                .filter(n -> (n & 1) == 0)
                .collect(Collectors.toSet());
        System.out.println(collect1);

        Set<Integer> collect2 = arrayList.stream()
                .filter(n -> (n & n - 1) == 0)
                .collect(Collectors.toSet());
        System.out.println(collect2);
    }

}
