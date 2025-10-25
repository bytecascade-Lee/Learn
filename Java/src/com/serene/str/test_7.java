package com.serene.str;

import java.util.Scanner;

/**
 * Description: 金额转换，整数
 *
 * @author Serene Lee
 * date 2025/10/18
 */
public class test_7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number >= 0 && number < 2147483647){
            String result = getCapitalNumber(number);
            System.out.println(result);
        } else {
            System.out.println("数字不合法");
        }



    }

    public static String getCapitalNumber(int cs) {

        // 此处可以简化，不必定义number数组，因为后续是想要通过number数组里面的元素
        // 获得下标然后得到大写，但是number里面的元素等于其下标。
        int[] number = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        String[] big = {"零", "壹", "贰", "参", "肆", "伍", "陆", "柒", "捌", "玖"};
        String[] multiply = {
                "元", "拾", "佰", "仟",
                "万", "拾", "佰", "仟",
                "亿", "拾", "佰", "仟"
        };

        int[] arr = intToArr(cs);
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            int index = getIndex(number, arr[i]);
            result += multiply[i] + big[index];
        }
        result = reverseString(result);
        return result;

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

    // 由于number数组不必要，则getIndex方法也不必要。
    public static int getIndex(int[] arr, int number){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number){
                return i;
            }
        }

        return -1;
    }

    public static String reverseString(String s){

        int len = s.length();
        char[] arr = new char[len];
        for (int i = 0; i < arr.length; i++) {
            arr[len - 1 - i] = s.charAt(i);
        }

        String result = "";
        for (char c : arr) {
            result += c;
        }
        return result;

    }

}
