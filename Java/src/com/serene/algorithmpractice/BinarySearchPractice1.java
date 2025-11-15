package com.serene.algorithmpractice;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/11/15
 */
public class BinarySearchPractice1 {
    public static void main(String[] args) {
        int[] arr = {7, 23, 79, 81, 103, 127, 131, 147};
        int number = 147;
        System.out.println(search(arr, number));
    }

    public static int search(int[] arr, int number) {
        int min = 0;
        int max = arr.length - 1;

        while (min <= max) {
            int middle = (min + max) / 2;
            if (number > arr[middle]) {
                min = middle + 1;
            } else if (number < arr[middle]) {
                max = middle - 1;
            } else {
                return middle;
            }
        }

        return -1;
    }

}
