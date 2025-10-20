package com.serene.str;

import java.util.Scanner;

/**
 * Description: 手机号隐藏
 *
 * @author Serene Lee
 * date 2025/10/19
 */
public class test_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (s.length() == 11) {
            String start = s.substring(0, 3);
            String end = s.substring(7);
            String result = start + "****" + end;
            System.out.println(result);

        } else {
            System.out.println("手机号长度不正确！");
        }
    }
}
