package com.serene.string;

import java.util.Scanner;

/**
 * Description: 模拟用户登录
 *
 * @author Serene Lee
 * date 2025/10/18
 */
public class test_6 {
    public static void main(String[] args) {
        /*
        已知正确的用户名和密码，请用程序实现模拟用户登录。
        总共给三次机会，登录之后，给出相应的提示
         */
        String rightUserName = "admin";
        String rightPassword = "00000000";
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("用户名：");
            String inputUserName = sc.next();
            System.out.print("密码：");
            String inputPassword = sc.next();
            if (rightUserName.equals(inputUserName) && rightPassword.equals(inputPassword)) {
                System.out.println("Login successfully.");
                break;
            } else {
                if (i < 2) {
                    System.out.println("用户名或密码错误，请重试，还有" + (2 - i) + "次机会");
                } else {
                    System.out.println("失败次数过多，账户已被锁定！");
                }
            }
        }

    }
}