package com.serene.str;

import java.util.Random;

/**
 * Description: 金额转换，小数
 *
 * @author Serene Lee
 * date 2025/10/18
 */
public class test_9 {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        double number = sc.nextDouble();
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            double number = r.nextDouble(100 * 100 * 100);
            System.out.println(number);
            String result = amountCaseConversion(number);
            System.out.println(result);
        }
//        String result = amountCaseConversion(number);
//        System.out.println(result);


    }

    public static String amountCaseConversion(double cs) {

        // 此处可以简化，不必定义number数组，因为后续是想要通过number数组里面的元素
        // 获得下标然后得到大写，但是number里面的元素等于其下标。
        int[] number = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String[] big = {"零", "壹", "贰", "参", "肆", "伍", "陆", "柒", "捌", "玖"};
        String[] multiplyInt = {
                "元", "拾", "佰", "仟",
                "万", "拾", "佰", "仟",
                "亿", "拾", "佰", "仟"
        };
        String[] multiplyDouble = {"分", "角"};

        int[] arrInt = splitDoubleToArr(cs)[0];
        int[] arrDouble = splitDoubleToArr(cs)[1];

        String resultInt = "";
        for (int i = 0; i < arrInt.length; i++) {
            int index = getIndex(number, arrInt[i]);
            resultInt += multiplyInt[i] + big[index];
        }
        resultInt = reverseString(resultInt);

        String resultDouble = "";
        for (int i = 0; i < arrDouble.length; i++) {
            int index = getIndex(number, arrDouble[i]);
            resultDouble += multiplyDouble[i] + big[index];
        }
        resultDouble = reverseString(resultDouble);

        return resultInt + resultDouble;

    }

    public static int[][] splitDoubleToArr(double d) {
        int a = (int) d;
        int b = (int) ((d - a) * 100);
        int[] ints = intToArr(a);
        int[] doubles = intToArr(b);
        return new int[][]{ints, doubles};

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
    public static int getIndex(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return i;
            }
        }

        return -1;
    }

    public static String reverseString(String s) {

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
