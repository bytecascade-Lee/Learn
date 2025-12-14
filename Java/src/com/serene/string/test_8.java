package com.serene.string;

import java.util.Scanner;

/**
 * Description: 金额转换，整数
 *
 * @author Serene Lee
 * date 2025/10/18
 */
public class test_8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number >= 0 && number < 2147483647) {
            String result = getCapitalNumber(number);
            System.out.println(result);
        } else {
            System.out.println("数字不合法");
        }

    }

    public static String getCapitalNumber(int cs) {

        String[] big = {"零", "壹", "贰", "参", "肆", "伍", "陆", "柒", "捌", "玖"};
        String[] multiply = {"元", "拾", "佰", "仟", "万", "拾", "佰", "仟", "亿", "拾", "佰", "仟"};

        int[] arr = intToArr(cs);
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            int index = arr[i];
            result = big[index] + multiply[i] + result;
        }

        return (result + "整");

    }

    public static int[] intToArr(int number) {
        int origin = number;
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }

        int[] arr = new int[count];
        number = origin;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = number % 10;
            number /= 10;
        }

        return arr;

    }
}
