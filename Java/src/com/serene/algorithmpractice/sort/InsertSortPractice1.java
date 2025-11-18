package com.serene.algorithmpractice.sort;

import java.util.Random;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/11/18
 */
public class InsertSortPractice1 {
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

    private static void sort(int[] arr, boolean reverse) {
        int length = arr.length;
        int[] result = new int[length];
        int bound = 0;

        for (int i = 0; i < length - 1; i++) {
            result[i] = arr[i];
            boolean flag1 = reverse ? arr[i] < arr[i + 1] : arr[i] > arr[i + 1];
            if (flag1) {
                bound = i + 1;
                break;
            }
        }

        for (int i = bound; i < length; i++) {
            int j = i;
            boolean flag2 = reverse ? arr[j] > arr[j - 1] : arr[j] < arr[j - 1];
            while (j > 0 && flag2) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
                if (j == 0) {
                    continue;
                }
                flag2 = reverse ? arr[j] > arr[j - 1] : arr[j] < arr[j - 1];
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
