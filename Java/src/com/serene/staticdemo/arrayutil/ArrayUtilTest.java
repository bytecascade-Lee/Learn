package com.serene.staticdemo.arrayutil;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/10/26
 */
public class ArrayUtilTest {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println(ArrayUtil.printArray(arr1));

        double[] arr2 = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9};
        System.out.println(ArrayUtil.getAverage(arr2));
    }


}
