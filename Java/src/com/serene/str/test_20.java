package com.serene.str;

import java.util.Random;
import java.util.Scanner;

/**
 * Description:
 *
 * @author Serene Lee
 * date 2025/10/20
 */
public class test_20 {
    public static void main(String[] args) {
        //键盘输入任意字符串，打乱里面的内容
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] arr = s.toCharArray();
        Random r = new Random();
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            int j = r.nextInt(len);
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        String result = new String(arr);
        System.out.println(result);


    }

}
