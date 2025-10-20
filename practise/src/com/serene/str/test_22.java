package com.serene.str;

import java.util.Scanner;

/**
 * Description:
 *
 * @author Serene Lee
 * date 2025/10/20
 */
public class test_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("第一个数：");
        int num1 =stringToInt(sc.next());
        System.out.print("第二个数：");
        int num2 =stringToInt(sc.next());

        System.out.println(num1 * num2);

    }

    public static int stringToInt(String s){
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int n = s.charAt(i) - '0';
            result = result * 10 + n;
        }

        return result;

    }

}
