package com.serene.integer;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/11/11
 */
public class test_3 {
    public static void main(String[] args) {
        /*
        public static string toBinarystring(int i)  得到二进制
        public static string to0ctalstring(int i)   得到八进制
        public static string toHexstring(int i)     得到十六进制
        public static int parseInt(string s)        将字符串类型的整数转成int类型的整数
        */

        // 转换成二进制
        String s1 = Integer.toBinaryString(4);
        System.out.println(s1);

        // 转换成八进制
        String s2 = Integer.toOctalString(128);
        System.out.println(s2);

        // 转换成十六进制
        String s3 = Integer.toHexString(24);
        System.out.println(s3);

        int i1 = Integer.parseInt(s1, 2);
        int i2 = Integer.parseInt(s2, 8);
        int i3 = Integer.parseInt(s3, 16);
        System.out.println(i1 + i2 + i3);

        String s4 = "12";
        String s5 = "2.5";
        String s6 = "true";

        System.out.println(Integer.parseInt(s4));
        System.out.println(Double.parseDouble(s5));
        System.out.println(Boolean.parseBoolean(s6));

    }

}
