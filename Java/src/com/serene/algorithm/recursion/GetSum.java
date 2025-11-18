package com.serene.algorithm.recursion;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/11/18
 */
public class GetSum {
    public static void main(String[] args) {
        // 运用递归算法求前n项和
        System.out.println(getSum(1));
        System.out.println(getSum(5));
        System.out.println(getSum(10));
        System.out.println(getSum(100));
        System.out.println(getSum(1000));
        System.out.println(getSum(10000));
    }

    public static int getSum(int number) {
        if (number == 1) {
            return 1;
        }

        return number + getSum(number - 1);
    }

}
