package com.serene.string;

import java.util.Scanner;

/**
 * Description:
 *
 * @author Serene Lee
 * date 2025/10/20
 */
public class test_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                if (count != 0) {
                    break;
                }
                continue;
            }
            count++;
        }
        System.out.println(count);
    }

}
