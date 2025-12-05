package com.serene.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/4
 */
public class demo2 {
    public static void main(String[] args) {
        /*
                          方法                                          作用
        public static void sort(List<T> list)                       排序
        public static void sort(List<T> list,Comparator<T> c)       根据指定的规则进行排序
        public static int binarySearch (List<T> list, T key)        以二分查找法查找元素
        public static void copy(List<T> dest,List<T> src)           拷贝集合中的元素
        public static void fill (List<T> list， T obj)              使用指定的元素填充集合
        public static <T> max/min(Collection<T> coll)               根据默认的自然排序获取最大/小值
        public static void swap(List<?> list, int i,int j)          交换集合中指定位置的元素
         */

        // 0.初始化arrayList
        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, "abc", "bcd", "cde", "def", "123", "234", "345");

        // 1.排序
        Collections.sort(arrayList);
        System.out.println("1. " + arrayList);

        // 2.根据指定的规则进行排序
        Collections.sort(arrayList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println("2. " + arrayList);

        // 3.以二分查找法查找元素
        int index = Collections.binarySearch(arrayList, "123");
        System.out.println("3. " + index);

        // 4.拷贝集合中的元素
        System.out.println("4. " + arrayList);
        ArrayList<String> strings = new ArrayList<>();
        Collections.addAll(strings, "", "", "", "", "", "", "");
        Collections.copy(strings, arrayList);
        System.out.println("4. "+strings);

        // 5.使用指定的元素填充集合
        ArrayList<String> strings2 = new ArrayList<>();
        Collections.addAll(strings2, "", "", "", "", "", "", "");
        Collections.fill(strings2, "000");
        System.out.println("5. " + strings2);

        // 6.根据默认的自然排序获取最大/小值
        String max = Collections.max(arrayList);
        String min = Collections.min(arrayList);
        System.out.println("6. " + max + "  " + min);

        // 7.交换集合中指定位置的元素
        System.out.println("7. " + arrayList);
        Collections.swap(arrayList, 2, 4);
        System.out.println("7. " + arrayList);
    }

}
