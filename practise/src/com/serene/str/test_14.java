package com.serene.str;

import java.util.Scanner;

/**
 * Description:
 *
 * @author Serene Lee
 * date 2025/10/19
 */
public class test_14 {
    public static void main(String[] args) {
        // 对称字符串
        // 需求：键盘接受一个字符串，程序判断出该字符串是否是对称字符串，并在控制台打印是或不是
        // 对称字符串：123321、111
        // 非对称字符串：123123
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String result = new StringBuilder(s).reverse().toString();
        if (s.equals(result)) {
            System.out.println("是对称字符串");
        } else {
            System.out.println("不是对称字符串");
        }


    }


}
