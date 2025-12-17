package com.serene.methodreference;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/17
 */
public class Demo6 {
    public static void main(String[] args) {
        /*
        格式:数据类型门::new
        范例:int[]::new
        练习:集合中存储一些整数，收集到数组当中
         */

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }

        /*Integer[] array = list.stream()
                .toArray(new IntFunction<Integer[]>() {
                    @Override
                    public Integer[] apply(int value) {
                        return new Integer[value];
                    }
                });*/
        Integer[] array = list.stream()
                .toArray(Integer[]::new);

        Stream.of(array).forEach(System.out::println);
    }

}
