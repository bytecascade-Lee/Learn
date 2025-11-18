package com.serene.algorithm.sort;

import java.util.ArrayList;
import java.util.Random;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/11/17
 */
public class InsertSort {
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
        int length = arr.length;
        int[] result = new int[length];
        int bound = 0;
        for (int i = 0; i < length - 1; i++) {
            result[i] = arr[i];
            if (arr[i] > arr[i + 1]) {
                bound = i + 1;
                break;
            }
        }

        for (int i = bound; i < length; i++) {
            int number = arr[bound];
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }

        }
        arr = result;
    }

    private static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + "  ");
        }
        System.out.println();
    }

}
