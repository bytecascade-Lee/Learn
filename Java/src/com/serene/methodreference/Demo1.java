package com.serene.methodreference;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/14
 */
public class Demo1 {
    public static void main(String[] args) {

         /*
         对数组arr进行倒序排序
         */

        int len = 10;
        Integer[] arr = new Integer[len];
        Random r = new Random();

        System.out.println("--------------------");
        // 匿名内部类
        for (int i = 0; i < len; i++) {
            arr[i] = r.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(Arrays.toString(arr));


        // lambda表达式
        System.out.println("--------------------");
        for (int i = 0; i < len; i++) {
            arr[i] = r.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, ((Integer o1, Integer o2) -> {
            return o2 - o1;
        }));
        System.out.println(Arrays.toString(arr));


        // lambda表达式简化格式
        System.out.println("--------------------");
        for (int i = 0; i < len; i++) {
            arr[i] = r.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, ((Integer o1, Integer o2) -> o2 - o1));
        System.out.println(Arrays.toString(arr));


        // 方法引用
        // :: 为方法引用符
        // 1.引用处需要是函数式接口
        // 2.被引用的方法需要已经存在
        // 3.被引用方法的形参和返回值需要跟抽象方法的形参和返回值保持一致//4.被引用方法的功能需要满足当前的要求
        System.out.println("--------------------");
        for (int i = 0; i < len; i++) {
            arr[i] = r.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, Demo1::func);
        System.out.println(Arrays.toString(arr));

    }

    public static int func(int o1, int o2) {
        return o2 - o1;
    }

}
