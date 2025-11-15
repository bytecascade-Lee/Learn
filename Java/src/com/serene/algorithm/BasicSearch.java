package com.serene.algorithm;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/11/15
 */
public class BasicSearch {
    public static void main(String[] args) {
        //基本查找/顺序查找
        //核心:
        //从0索引开始挨个往后查找
        //需求:定义一个方法利用基本查找，查询某个元素是否存在
        // 数据如下:{131，127，147，81，103，23，7，79}

        int[] arr = {131, 127, 147, 81, 103, 23, 7, 79};
        int number = 81;
        System.out.println(isNumberExists(arr, number));

    }

    public static boolean isNumberExists(int[] arr, int number) {
        for (int j : arr) {
            if (j == number) {
                return true;
            }
        }
        return false;
    }

}
