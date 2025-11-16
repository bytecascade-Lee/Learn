package com.serene.algorithmpractice.search;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/11/15
 */
public class BasicSearchPractice1 {
    public static void main(String[] args) {
        int[] arr = {131, 127, 147, 81, 103, 23, 7, 79};
        int number = 81;
        System.out.println(search(arr, number));
    }

    public static int search(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return i;
            }
        }
        return -1;
    }

}
