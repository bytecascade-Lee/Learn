package com.serene.integer;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/11/11
 */
public class test_1 {
    public static void main(String[] args) {
        /*
        public Integer(int value)                           根据传递的整数创建一个Integer对象
        public Integer(string s)                            根据传递的字符串创建一个Integer对象
        public static Integer valueOf(int i)                根据传递的整数创建一个Integer对象
        public static Integer valueOf(string s)             根据传递的字符串创建一个Integer对象
        public static Integer valueOf(String s, int radix)  根据传递的字符串和进制创建一个Integer对象
         */

        // 3.这两种方式获取对象的区别(掌握)
        // 因为在实际开发中，-128~127之间的数据，用的比较多。
        // 如果每次使用都是new对象，那么太浪费内存了
        // 所以，提前把这个范围之内的每一个数据都创建好对象
        // 如果要用到了不会创建新的，而是返回已经创建好的对象。
        Integer i1 = Integer.valueOf(127);
        Integer i2 = Integer.valueOf(127);
        // true
        System.out.println(i1 == i2);

        Integer i3 = Integer.valueOf(128);
        Integer i4 = Integer.valueOf(128);
        // false
        System.out.println(i3 == i4);

        Integer i5 = new Integer(127);
        Integer i6 = new Integer(127);
        // false
        System.out.println(i5 == i6);

        Integer i7 = new Integer(128);
        Integer i8 = new Integer(128);
        // false
        System.out.println(i7 == i8);

    }

}
