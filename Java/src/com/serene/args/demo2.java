package com.serene.args;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/4
 */
public class demo2 {
    public static void main(String[] args) {
        System.out.println(getSum(-5, 1, 2, 3, 4, 5, 6, 7, 8, 9));
    }

    public static int getSum(int a, int... args) {
        System.out.println(a);
        return demo1.getSum(args);
    }

}
