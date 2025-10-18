package com.serene.test_1;

import java.util.Random;

public class test_13 {
    public static void main(String[] args) {
        /*

        信息：一个大V直播抽奖，奖品是现金红包，分别有{2,588,888,1000,10000}
            五个奖金。请使用代码模拟抽奖。
        要求：打印出每个奖项，奖项的出现顺序要随机且补充粗。

         */

        // 定义数组用于表示奖池，静态初始化
        int[] arr = {2, 588, 888, 1000, 10000};

        // 初始化Random对象
        Random r = new Random();

        // 方法一
        // 定义循环次数，初始化
        int count = 0;

        // 进入循环，直到次数等于5
        while (count < arr.length) {
            // 随机生成数组下标
            int i = r.nextInt(arr.length);
            // 获得对应下标的值
            int result = arr[i];
            if (result != 0) {
                System.out.println(result + "元的奖金被抽到");
                count++;
                arr[i] = 0;
            }

        }


        // 方法二
        arr = new int[]{2, 588, 888, 1000, 10000};

        for (int i = 0; i < arr.length; i++) {
            // 获得随机索引
            int randomIndex = r.nextInt(arr.length);
            int temp = arr[i];

            // 拿着i与随机索引对应的值进行交换
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }

        for (int i : arr) {
            System.out.println(i + "元的奖金被抽到");
        }


    }


}
