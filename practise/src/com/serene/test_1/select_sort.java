package com.serene.test_1;

import java.util.Random;

public class select_sort {
    public static void main(String[] args) {
        Random r = new Random();
        int[][] arrs = new int[10][15];
        for (int i = 0; i < arrs.length; i++) {
            for (int j = 0; j < arrs[i].length; j++) {
                arrs[i][j] = r.nextInt(100);
            }
        }
        select_sort sorter = new select_sort();

        for (int i = 0; i < arrs.length; i++) {
            System.out.println("第" + (i + 1) + "组:");
            for (int j : arrs[i]) {
                System.out.print(j + " ");
            }
            System.out.println();
            sorter.sort(arrs[i]);
            System.out.println();
        }
    }

    public void sort(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < len; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
