package com.serene.algorithm.search;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/11/15
 */
public class GoldenSearch {
    public static void main(String[] args) {
        int[] arr = {7, 23, 79, 81, 103, 127, 131, 147};
        int number = 103;
        System.out.println(isNumberExists(arr, number));

    }

    public static boolean isNumberExists(int[] arr, int number) {
        int min = 0;
        int max = arr.length - 1;
        final double GOLDEN_RATIO = (Math.sqrt(5.0) - 1) / 2;
        while (min <= max) {
            if (min == max) {
                if (arr[min] == number) {
                    return true;
                } else {
                    return false;
                }
            }
            int middle = min + (int) Math.round((max - min) * GOLDEN_RATIO);
            if (middle > max) {
                middle = max;
            }

            if (number > arr[middle]) {
                min = middle + 1;
            } else if (number < arr[middle]) {
                max = middle - 1;
            } else {
                return true;
            }

        }

        return false;
    }

}
