package com.serene.basicknowledge;

import java.util.Scanner;

public class test_08 {
    public static void main(String[] args) {
        /*
        判断回文数
         */
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int compare = number;
        int result = 0;
        while (number != 0){
            int temp = number % 10;
            number = number / 10;
            result = result * 10 + temp;
        }
        if (result == compare){
            System.out.println("数字是回文数.");
        }else {
            System.out.println("数字不是回文数.");
        }
    }
}
