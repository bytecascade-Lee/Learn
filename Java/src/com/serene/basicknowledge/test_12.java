package com.serene.basicknowledge;

import java.util.Scanner;

public class test_12 {
    public static void main(String[] args) {
        /*
        对test_10加密后的数字进行解密
         */

        // 键盘录入待解密的数字
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        // 计算待解密的整数有几位
        int count = 0;
        int temp = number;
        while (temp != 0) {
            temp /= 10;
            count++;
        }

        // 获得数字的每一位，并反向存储于数组中
        // 定义数组，动态格式化
        int[] arr = new int[count];
        int index = 0;
        while (number != 0) {
            int a = number % 10;
            number /= 10;
            arr[count - index - 1] = a;
            index++;
        }

        // 先对每一位加5，然后对每一位对10求余
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 5;
            arr[i] %= 10;
        }

        // 输出结果
        for (int j : arr) {
            System.out.println(j);
        }
    }
}
