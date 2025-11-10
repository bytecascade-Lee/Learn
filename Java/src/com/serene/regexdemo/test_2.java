package com.serene.regexdemo;

import java.util.Scanner;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/11/10
 */
public class test_2 {
    public static void main(String[] args) {
        /*
        需求:
            请编写正则表达式验证用户名是否满足要求。
        要求:
            大小写字母，数字，下划线一共4-16位。

        需求:
            请编写正则表达式验证身份证号码是否满足要求。
        要求:
            18位，前17位任意数字，最后一位可以是数字可以是大写或小写的x。
         */

        String regUserName = "\\w{4,16}";
        Scanner sc = new Scanner(System.in);
        System.out.println("输入用户名：");
        System.out.println(sc.next().matches(regUserName));

        String regIDNumber1 = "[1-9]\\d{16}(\\d|(?i)x)";
        System.out.println("输入身份证号：");
        System.out.println(sc.next().matches(regIDNumber1));


    }

}
