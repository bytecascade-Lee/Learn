package com.serene.regexdemo;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/11/10
 */
public class test_4 {
    public static void main(String[] args) {
        /*
        需求：
        将字符串：我要学学编编编编程程程程程程
        替换为：我要学编程

        说明：
        正则表达式外面再次使用分组时，前面使用美元符号$
         */

        String str = "我要学学编编编编程程程程程程";

        System.out.println(str.replaceAll("(.)\\1+", "$1"));
    }

}
