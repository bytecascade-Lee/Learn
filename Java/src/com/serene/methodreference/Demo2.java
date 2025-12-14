package com.serene.methodreference;

import java.util.stream.Stream;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/14
 */
public class Demo2 {
    public static void main(String[] args) {
        /*
        练习:
        数组中有以下数字，要求把他们都变成int类型
        "1", "2", "3", "4", "5"
         */

        String[] s = {"1", "2", "3", "4", "5"};
        Stream.of(s)
                .map(Integer::parseInt)
                .forEach(System.out::println);
    }

}
