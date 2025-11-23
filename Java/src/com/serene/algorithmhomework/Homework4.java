package com.serene.algorithmhomework;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/11/23
 */
public class Homework4 {
    public static void main(String[] args) {
        /*
        可爱的小名特别喜欢爬楼梯，他有时候一次爬一个台阶，有时候爬两个
        如果这个楼梯有20阶，小明一共有多少种爬法？
         */

        // 在第19阶时，到20阶有1中方法
        // 在第18阶时，到20阶有2种方法
        // F(n) = F(n-1) + F(n-2)

        System.out.println(obtainTheTotalNumberOfMethodsForClimbingStairsBasedOnTheSpecifiedOrder(20));

    }

    public static int obtainTheTotalNumberOfMethodsForClimbingStairsBasedOnTheSpecifiedOrder(int stairs) {
        if (stairs <= 0) {
            return -1;
        }

        if (stairs == 1) {
            return 1;
        }

        if (stairs == 2) {
            return 2;
        }

        return obtainTheTotalNumberOfMethodsForClimbingStairsBasedOnTheSpecifiedOrder(stairs - 1) +
                obtainTheTotalNumberOfMethodsForClimbingStairsBasedOnTheSpecifiedOrder(stairs - 2);
    }
}
