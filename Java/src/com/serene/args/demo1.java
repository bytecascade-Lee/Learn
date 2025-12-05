package com.serene.args;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/4
 */
public class demo1 {
    public static void main(String[] args) {
        System.out.println(getSum(1, 2, 3, 4, 5, 6, 7, 8, 9));
    }

    public static int getSum(int... args) {
        int sum = 0;
        for (int arg : args) {
            sum += arg;
        }
        return sum;
    }

}
