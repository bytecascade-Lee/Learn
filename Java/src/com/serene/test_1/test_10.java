package com.serene.test_1;

import java.util.Scanner;

public class test_10 {

    /*
    数字加密小练习
    1.键盘录入一个待加密的数字
    2.拆分
    3.先对每一位加上5
    4.再将每一位对10整除
    5.最后反转数字
    6.得出结果
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个正整数：");
        String input = sc.nextLine().trim();

        int[] arr = new int[input.length()];

        for (int i = 0; i < input.length(); i++) {
            arr[i] = input.charAt(i) - '0';
        }


        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] + 5) % 10;
        }

        // 数组中元素反转方法：
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }
        ;
        int result = 0;
        // 拼接数组，方法一：
        for (int i = 0; i < arr.length; i++) {
            result += arr[i] * (int) Math.pow(10, arr.length - i - 1);
            System.out.println(result);
        }
        // 拼接数组，方法二：
        result = 0;
        for (int j : arr) {
            // 此处使用java中的增强for循环（for-each），
            // 在无需使用索引的情况下取出数组里面的数。
            // 缺点是无法获得索引。
            result += result * 10 + j;
            System.out.println(result);
        }
        System.out.println(result);


    }
}
