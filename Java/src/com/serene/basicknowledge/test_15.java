package com.serene.basicknowledge;

public class test_15 {
    public static void main(String[] args) {
       /*

       二维数组

        */

        // 初始化方式：两种
        // 静态初始化
        int[][] arr1 = new int[][]{{11, 22}, {33, 44}};
        // 简化格式
        int[][] arr2 = {{11, 22}, {33, 44}};

        // 动态初始化



        // 获取元素
        for (int[] ints : arr1) {
            for (int i : ints) {
                System.out.println(i);
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.println(arr2[i][j]);
            }
        }


    }
}
