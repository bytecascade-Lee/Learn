package com.serene.str;

/**
 * Description: 根据身份证号码提取信息
 *
 * @author Serene Lee
 * date 2025/10/19
 */
public class test_11 {
    public static void main(String[] args) {
        String id = "321283202510190050";
        String year = id.substring(6, 10);
        String month = id.substring(10, 12);
        String day = id.substring(12, 14);
        char sex = id.charAt(16);
        char x = ((sex - '0') % 2 == 1) ? '男': '女';
        System.out.println("出生时间：" + year + "年" + month + "月" + day + "日");
        System.out.println("性别：" + x);
    }

}
