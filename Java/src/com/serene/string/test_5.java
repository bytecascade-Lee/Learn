package com.serene.string;

import java.util.Scanner;

/**
 * Description:
 *
 * @author Serene Lee
 * date 2025/10/18
 */
public class test_5 {
    public static void main(String[] args) {
        /*
        定义一个方法，实现字符串反转。
        键盘录入一个字符串，调用该方法后，在控制台输出结果
        例如，键盘录入abc，输出结果cba
         */
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        str = reverseString(str);
        System.out.println(str);

    }

    public static String reverseString(String str) {
        int len = str.length();
        char[] arr = new char[len];
        for (int i = 0; i < len; i++) {
            arr[len - 1 - i] = str.charAt(i);
        }

        String result = "";
        for (char c : arr) {
            result += c;
        }

        return result;
    }

}
