package com.serene.ZhangHao;

import java.util.Scanner;

/**
 * Description:
 *
 * @author Serene Lee
 * date 2025/10/19
 */
public class Homework_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        for (int i = 0; i < 2; i++) {
            System.out.print("请输入第" + (i + 1) + "个整数：");
            result += sc.nextInt();
        }

        System.out.println("和是：" + result);

    }

}
