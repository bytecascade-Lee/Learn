package com.serene.basicknowledge;

import java.util.Scanner;


public class test_11 {
    public static void main(String[] args) {


    /*
    把整数上每一位都添加到数组里面
     */

        //键盘录入一个整数
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int temp = number;

        // 计算一个整数有几位
        int count = 0;
        while (temp != 0) {
            // 每次循环去掉最右边的一位，然后count加1
            temp /= 10;
            count++;

        }

        // 定义数组,动态初始化
        int[] arr = new int[count];

        int index = 0;
        // 把整数上的每一位都添加到数组里面
        while (number != 0) {
            int a = number % 10;
            number /= 10;
            // 倒序添加
            arr[count - index - 1] = a;
            index++;

        }

        // 输出结果
        // 此处仍然使用增强for循环
        for (int j : arr) {
            System.out.println(j + " ");
        }


    }
}
