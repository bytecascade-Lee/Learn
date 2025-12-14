package com.serene.string;

/**
 * Description:
 *
 * @author Serene Lee
 * date 2025/10/18
 */
public class test_2 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = new String("abc");
        String s3 = new String("Abc");

        // 基本数据类型比较的是内容
        // 引用数据类型比较的是地址值
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

    }
    

}
