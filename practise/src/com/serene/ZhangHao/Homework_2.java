package com.serene.ZhangHao;

import java.util.Scanner;

/**
 * Description:
 *
 * @author Serene Lee
 * date 2025/10/19
 */
public class Homework_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("请输入第" + (i + 1) + "个整数：");
            arr[i] = sc.nextInt();
        }
        int[] result = sort(arr);
        System.out.println("最小值：" + result[0]);
        System.out.println("最大值：" + result[2]);


    }

    public static int[] sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;

    }

}
