package com.serene.string;

import java.util.Random;

/**
 * Description:
 *
 * @author Serene Lee
 * date 2025/10/20
 */
public class test_21 {
    public static void main(String[] args) {
        /*
        生成验证码
        内容：可以是小写字母，也可以是大写字母，还可以是数字
        规则：
        长度为5
        内容中是四位字母，1位数字。
        其中数字只有1位，但是可以出现在任意的位置。
        */
        //1.可以把所有的大写字母，小写字母都放到一个数组当中
        char[] chars = new char[52];
        int[] nums = new int[10];
        //a-z A-Z
        for (int i = 0; i < 26; i++) {
            chars[i] = (char) ('A' + i);
        }

        for (int i = 26; i < 52; i++) {
            chars[i] = (char) ('a' + i - 26);

        }

        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        //2.从数组中随机获取4次
        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(52);
            sb.append(chars[index]);
        }

        //3.生成一个0~9之间的随机数拼接到最后
        int index = r.nextInt(5);
        int num = r.nextInt(10);
        sb.insert(index, num);

        //4.打印
        System.out.println(sb);

    }

}
