package com.serene.arrays;

import java.util.Arrays;
import java.util.Random;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/11/19
 */
public class Demo1 {
    public static void main(String[] args) {
        /*

        方法名                                                        说明
        public static String toString(数组)                           把数组拼接成一个字符串
        public static int binarySearch(数组，查找的元素)              分查找法查找元素
        public static int[] copyOf(原数组,新数组长度)                 拷贝数组
        public static int[]copyOfRange(原数组,起始索引,结束索引)      拷贝数组(指定范围)
        public static void fill(数组,元素)                            填充数组
        public static void sort(数组)                                 按照默认方式进行数组排序
        public static void sort(数组，排序规则)                       按照指定的规则排序

         */

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("\n----------toString----------");
        System.out.println(Arrays.toString(arr));

        // binarySearch:二分查找法查找元素
        // 细节1:二分查找的前提:数组中的元素必须是有序，数组中的元素必须是升序的
        // 细节2:如果要查找的元素是存在的，那么返回的是真实的索引
        // 但是，如果要查找的元素是不存在的，返回的是-插入点 -1
        // 疑问:为什么要减1呢?
        // 解释:如果此时，我现在要查找数字0，那么如果返回的值是-插入点，就会出现问题了。
        // 如果要查找数字0，此时0是不存在的，但是按照上面的规则插入的话，应该就是在数组的最前面，此时是-0
        // 为了避免这样的情况，Java在这个基础上又减1。
        System.out.println("\n----------binarySearch----------");
        System.out.println(Arrays.binarySearch(arr, 0));
        System.out.println(Arrays.binarySearch(arr, 5));
        System.out.println(Arrays.binarySearch(arr, 10));
        System.out.println(Arrays.binarySearch(arr, 20));

        //参数一:老数组
        //参数二:新数组的长度
        //方法的底层会根据第二个参数来创建新的数组
        //如果新数组的长度是小于老数组的长度，会部分拷贝
        //如果新数组的长度是等于老数组的长度，会完全拷贝
        //如果新数组的长度是大于老数组的长度，会补上默认初始值
        System.out.println("\n----------copyOf----------");
        int[] arr1 = Arrays.copyOf(arr, arr.length);
        System.out.println(Arrays.toString(arr1));
        int[] arr2 = Arrays.copyOf(arr, arr.length / 2);
        System.out.println(Arrays.toString(arr2));

        // 细节：左闭右开
        System.out.println("\n----------copyOfRange----------");
        int[] arr3 = Arrays.copyOfRange(arr, 0, 10);
        System.out.println(Arrays.toString(arr3));
        int[] arr4 = Arrays.copyOfRange(arr, 3, 8);
        System.out.println(Arrays.toString(arr4));

        System.out.println("\n----------fill----------");
        int[] arr5 = new int[10];
        Arrays.fill(arr5, 99);
        System.out.println(Arrays.toString(arr5));
        Arrays.fill(arr5, 66);
        System.out.println(Arrays.toString(arr5));

        // 默认情况下，给基本数据类型进行升序排序，使用快速排序
        System.out.println("\n----------sort----------");
        Random r = new Random();
        int[] arr6 = new int[20];
        for (int i = 0; i < arr6.length; i++) {
            arr6[i] = r.nextInt(100);
        }
        System.out.println(Arrays.toString(arr6));
        Arrays.sort(arr6);
        System.out.println(Arrays.toString(arr6));



    }

}
