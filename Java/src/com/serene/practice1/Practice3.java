package com.serene.practice1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringJoiner;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/11/12
 */
public class Practice3 {
    public static void main(String[] args) {
        /*
        定义一个方法自己实现toBinaryString方法的效果
        将一个十进制正整数转成字符串表示的二进制
         */
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(toBinaryString(number));

    }

    public static String toBinaryString(int number) {
        StringBuilder stringBuilder = new StringBuilder();
        while (number != 0) {
            int temp = number % 2;
            stringBuilder.insert(0, temp);
            number /= 2;
        }
        return stringBuilder.toString();
    }

}
