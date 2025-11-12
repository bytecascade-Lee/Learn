package com.serene.practice1;

import java.util.Scanner;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/11/12
 */
public class Practice2 {
    public static void main(String[] args) {
        /*
        自己实现parseInt方法的效果，将字符串形式的数据转成整数。要求:
        字符串中只能是数字，不能有其他字符最少一位，最多10位
        不能以 0 开头
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入待转化的整数：");
        String string = sc.nextLine();

        System.out.println("转化后的数字为：" + parseInt(string));

    }

    public static int parseInt(String s) {
        if (!s.matches("[0-9]\\d+")) {
            System.out.println("您输入的不是一个整数！");
            return Integer.MIN_VALUE;
        }

        int len = s.length();
        int number = 0;
        for (int i = 0; i < len; i++) {
            int temp = s.charAt(i) - 48;
            number = number * 10 + temp;
        }

        return number;

    }

}
