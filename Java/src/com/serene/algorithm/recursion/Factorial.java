package com.serene.algorithm.recursion;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/11/18
 */
public class Factorial {
    public static void main(String[] args) {
        for (int i = -1; i < 9; i++) {
            System.out.println(factorial(i));
        }
    }

    private static int factorial(int number) {
        if (number < 1) {
            return 0;
        }

        if (number == 1) {
            return 1;
        }

        return number * factorial(number - 1);
    }

}
