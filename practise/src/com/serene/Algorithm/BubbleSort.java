package com.serene.Algorithm;

import java.util.Random;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/10/22
 */
public class BubbleSort {
    public static void main(String[] args) {
        Random r = new Random();
        int[][] arrs = new int[10][15];
        for (int i = 0; i < arrs.length; i++) {
            for (int j = 0; j < arrs[i].length; j++) {
                arrs[i][j] = r.nextInt(100);
            }
        }
        BubbleSort sorter = new BubbleSort();


        for (int i = 0; i < arrs.length; i++) {
            System.out.println("第" + i + "组:");
            for (int j : arrs[i]) {
                System.out.print(j + " ");
            }
            System.out.println();
            sorter.sort(arrs[i]);
            System.out.println();
        }


    }

    public void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
