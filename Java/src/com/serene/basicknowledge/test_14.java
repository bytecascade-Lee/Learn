package com.serene.basicknowledge;

import java.util.Random;
import java.util.Scanner;

public class test_14 {
    public static void main(String[] args) {
        /*

        双色球系统
        说明：投注号码由6个红色球和1个蓝色球组成。其中红色球上的号码从1~33，而蓝色球上的号码从1~16
        中奖情况：
            红色球个数  蓝色球个数  奖  级  奖  金
              0        1     六等奖    5元
              1        1     六等奖    5元
              2        1     六等奖    5元
              3        1     五等奖    10元
              4        0     五等奖    10元
              4        1     四等奖    200元
              5        0     四等奖    200元
              5        1     三等奖    3000元
              6        0     二等奖    最高500万
              6        1     一等奖    最高1000万

         */

        // 生成中奖号码
        // 用一个数组存储，长度为7，动态初始化
        int[] answers = {0, 0, 0, 0, 0, 0, 0};


        // 随机生成号码
        // 初始化Random对象
        Random r = new Random();

        // 红色球：6个，不能重复
        // 蓝色球：1个，可以和红色球的一样

        // 生成红色球号码并添加到数组里面
        int count = 0;
        while (count < 6) {
            int redNumber = r.nextInt(33) + 1;
            boolean check = false;
            for (int i : answers) {
                if (i == redNumber) {
                    break;
                } else {
                    check = true;
                }
            }
            if (check) {
                answers[count] = redNumber;
                count++;
            }
        }

        // 生成蓝色球号码并添加到数组里面
        int blueNumber = r.nextInt(16) + 1;
        answers[6] = blueNumber;

        for (int answer : answers) {
            System.out.println(answer);
        }

        // 键盘录入用户的号码
        // 初始化Scanner对象
        Scanner sc = new Scanner(System.in);
        int[] inputs = new int[7];
        for (int i = 0; i < 7; i++) {
            System.out.println("请输入第" + (i + 1) + "个号码");
            inputs[i] = sc.nextInt();
        }


        // 比较两个数组，计算奖级和奖金
        // 初始化红色球中奖个数和蓝色球中奖个数
        int redPrice = 0;
        int bluePrice = 0;

        // 判断红色球中奖个数
        for (int i = 0; i < 6; i++) {
            int answer = answers[i];
            for (int j = 0; j < 6; j++) {
                int input = inputs[j];
                if (answer == input) {
                    redPrice++;
                }
            }
        }

        // 判断蓝色球中奖个数
        if (answers[6] == inputs[6]) {
            bluePrice = 1;
        }

        // 计算中奖情况并输出结果
        System.out.println("红色球数量为：" + redPrice + "    蓝色球数量为：" + bluePrice);
        if (redPrice == 0 && bluePrice == 0) {
            System.out.println("很遗憾，您未中奖");
        } else if ((redPrice == 0 && bluePrice == 1) || (redPrice == 1 && bluePrice == 1) || (redPrice == 2 && bluePrice == 1)) {
            System.out.println("六等奖，5元");
        } else if ((redPrice == 3 && bluePrice == 1) || (redPrice == 4 && bluePrice == 0)) {
            System.out.println("五等奖，10元");
        } else if ((redPrice == 4 && bluePrice == 1) || (redPrice == 5 && bluePrice == 0)) {
            System.out.println("四等奖，200元");
        } else if (redPrice == 5 && bluePrice == 1) {
            System.out.println("三等奖，3000元");
        } else if (redPrice == 6 && bluePrice == 0) {
            System.out.println("二等奖，最高500万");
        } else if (redPrice == 6 && bluePrice == 1) {
            System.out.println("一等奖，最高1000万");
        }


    }
}
