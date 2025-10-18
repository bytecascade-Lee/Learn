package com.serene.test_2;

import java.util.Scanner;

public class test_01 {
    public static void main(String[] args) {
        // 键盘录入的两套体系不能混用
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num = sc.nextInt();
        System.out.println(num);
        System.out.println("请输入一个字符串：");
        String str = sc.nextLine();
        System.out.println(str);

        // 弊端：先用nextInt，再用nextLine，
        // 会导致第二个接收不到数据。

    }
}
