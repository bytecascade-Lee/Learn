package com.serene.algorithmpractice.sort;

import java.util.Random;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/11/17
 */
public class BubbleSortPractice1 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
        }
        printArr(arr);
        sort(arr, false);
        printArr(arr);
        sort(arr, true);
        printArr(arr);

    }

    public static void sort(int[] arr, boolean reverse) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                boolean condition = reverse ? arr[j] < arr[j + 1] : arr[j] > arr[j + 1];
                if (condition) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + "  ");
        }
        System.out.println();
    }
}
