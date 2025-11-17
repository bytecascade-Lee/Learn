package com.serene.algorithm.sort;

import java.util.Random;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/11/17
 */
public class StraightSelectionSort {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
        }
        printArr(arr);
        sort(arr);
        printArr(arr);

    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
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
