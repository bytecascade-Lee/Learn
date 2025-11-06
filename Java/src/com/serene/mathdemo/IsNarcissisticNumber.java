package com.serene.mathdemo;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/11/6
 */
public class IsNarcissisticNumber {
    public static void main(String[] args) {
        System.out.println("isNarcissisticNumber(100) = " + isNarcissisticNumber(100));
        System.out.println("isNarcissisticNumber(153) = " + isNarcissisticNumber(153));

        for (int i = 0; i < 100000; i++) {
            if (isNarcissisticNumber(i + 1)) {
                System.out.println(i + 1);
            }
        }
    }

    public static boolean isNarcissisticNumber(int number) {
        int origin = number;
        int count = 0;
        do {
            number /= 10;
            count++;
        } while (number != 0);

        double sum = 0;
        number = origin;
        for (int i = 0; i < count; i++) {
            sum += Math.pow(number % 10, count);
            number /= 10;
        }

        return sum == origin;
    }
}
