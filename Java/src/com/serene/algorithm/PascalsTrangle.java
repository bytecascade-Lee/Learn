package com.serene.algorithm;

import java.util.Scanner;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/10/21
 */
public class PascalsTrangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[][] arr = new int[num][num];
        for (int i = 0; i < arr.length; i++) {
            arr[i][0] = 1;
            arr[i][i] = 1;
        }

        for (int i = 2; i < arr.length; i++) {
            for (int j = 1; j < i; j++) {
                arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == i) {
                    System.out.print(arr[i][j]);
                    continue;
                }
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }
}