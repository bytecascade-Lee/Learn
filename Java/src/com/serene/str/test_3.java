package com.serene.str;

import java.util.Scanner;

/**
 * Description: 统计字符数量
 *
 * @author Serene Lee
 * date 2025/10/18
 */
public class test_3 {
    public static void main(String[] args) {
        // 键盘录入一个字符串，统计该字符串中大写字母，小写字母、数字和其他字符出现的次数
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;
        int otherCount = 0;
        for (int i = 0; i < len; i++) {
            char s = str.charAt(i);
            if ('A' <= s && s <= 'Z') {
                bigCount++;
            } else if ('a' <= s && s <= 'z') {
                smallCount++;
            } else if ('0' <= s && s <= '9') {
                numberCount++;
            } else {
                otherCount++;
            }
        }
        System.out.println("大写：" + bigCount);
        System.out.println("小写：" + smallCount);
        System.out.println("数字：" + numberCount);
        System.out.println("其他：" + otherCount);
    }

}
