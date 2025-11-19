package com.serene.arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/11/19
 */
public class Demo2 {
    public static void main(String[] args) {
        Random r = new Random();
        Integer[] integers = new Integer[10];
        for (int i = 0; i < integers.length; i++) {
            integers[i] = r.nextInt(100);
        }
        System.out.println(Arrays.toString(integers));

        // Arrays.sort()方法
        // 底层原理：
        // 利用插入排序 + 二分查找的方式进行排序。
        // 默认把0索引的数据当做是有序的，1索引及以后的认为是无序的。
        // 遍历无序的序列，得到里面的没一个元素。
        // 假设当前遍历到的元素是A：
        // 把A王有序序列里面插入，在插入的时候，是利用二分查找确定A的位置的
        // 拿着A元素，跟插入点的元素进行比较，比较的规则就是通过匿名内部类重写的compare方法
        // 如果方法的返回值是正数，拿着A继续跟后面的数据进行比较；
        // 如果方法的返回值是负数，拿着A继续跟前面的数据进行比较；
        // 如果方法的返回值是 0  ，拿着A继续跟后面的数据进行比较。
        // 直到能够确定A元素的位置。

        // 所以，如果想要自定义排序依据，就使用匿名内部类重写compare方法的方法体。

        // compare方法的形式参数：
        // 第一个参数 o1：遍历无序序列得到的元素（待排序数字）
        // 第二个参数 o2：有序序列中的元素（已排序数字）

        // compare方法的返回值：
        // 整型，但只用考虑三种情况
        // 1. 正数  表示当前要插入的元素比这个位点的元素的值大，要往后找
        // 2. 负数  表示当前要插入的元素比这个位点的元素的值小，要往前找
        // 3.  0    表示当前要插入的元素和这个位点的元素的值相等，也跟着往后找

        // 所以说：
        // 如果想要让序列从小到大排序，compare方法体的return语句写 o1 - o2
        // 如果想要让序列从大到小排序，compare方法体的return语句写 o2 - o1

        // 简单记忆：
        // 待排序的大于已排序的，说明待排序的大，按照设计目的，将大的往前/后放
        // 小于和等于同理

        Arrays.sort(integers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        System.out.println(Arrays.toString(integers));

        // lambda表达式：简化匿名内部类的书写
        Arrays.sort(integers, (Integer o1, Integer o2) -> {
            return o2 - o1;
        });

        // Arrays.sort(integers, new Comparator<Integer>() {
        //     @Override
        //     public int compare(Integer o1, Integer o2) {
        //         return o2 - o1;
        //     }
        // });

        System.out.println(Arrays.toString(integers));
    }

}
