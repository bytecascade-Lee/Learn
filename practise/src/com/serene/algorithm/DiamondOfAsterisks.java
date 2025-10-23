package com.serene.algorithm;

import java.util.Scanner;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/10/21
 */
public class DiamondOfAsterisks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < (number - i - 1) * 2; j++) {
                // 打印空格
                System.out.print(" ");
            }
            for (int k = 0; k < (i * 2 + 1); k++) {
                // 打印星号
                if (k == i * 2) {
                    System.out.print("*");
                    continue;
                }
                System.out.print("* ");
            }
            System.out.println();
        }


        // 倒着再来一遍
        for (int i = 1; i < number; i++) {
            for (int j = 0; j < i * 2; j++) {
                // 打印空格
                System.out.print(" ");
            }
            for (int k = 0; k < ((number - i - 1) * 2 + 1); k++) {
                // 打印星号
                if (k == (number - i - 1) * 2) {
                    System.out.print("*");
                    continue;
                }
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}