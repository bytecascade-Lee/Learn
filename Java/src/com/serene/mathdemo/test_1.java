package com.serene.mathdemo;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/11/6
 */
public class test_1 {
    public static void main(String[] args) {
        System.out.println("Math.E = " + Math.E);
        System.out.println("Math.PI = " + Math.PI);

        System.out.println("Math.abs(-5) = " + Math.abs(-5));
        System.out.println("Math.abs(-6.7) = " + Math.abs(-6.7));
        System.out.println("Math.abs((float) -2.75) = " + Math.abs((float) -2.75));
        // System.out.println("Math.abs(Integer.MIN_VALUE) = " + Math.abs(Integer.MIN_VALUE));
        // System.out.println("Math.absExact(Integer.MIN_VALUE) = " + Math.absExact(Integer.MIN_VALUE));

        System.out.println("Math.ceil(2.3) = " + Math.ceil(2.3));
        System.out.println("Math.ceil(2.7) = " + Math.ceil(2.7));
        System.out.println("Math.ceil(-12.9) = " + Math.ceil(-12.9));
        System.out.println("Math.ceil(-12.2) = " + Math.ceil(-12.2));

        System.out.println("Math.floor(2.3) = " + Math.floor(2.3));
        System.out.println("Math.floor(2.7) = " + Math.floor(2.7));
        System.out.println("Math.floor(-12.9) = " + Math.floor(-12.9));
        System.out.println("Math.floor(-12.2) = " + Math.floor(-12.2));

        System.out.println("Math.round(7.3) = " + Math.round(7.3));
        System.out.println("Math.round(7.9) = " + Math.round(7.9));
        System.out.println("Math.round(-5.2) = " + Math.round(-5.2));
        System.out.println("Math.round(-5.6) = " + Math.round(-5.6));

        System.out.println("Math.max(3, 5) = " + Math.max(3, 5));
        System.out.println("Math.max(4.5, 12.7) = " + Math.max(4.5, 12.7));
        System.out.println("Math.max(-4, 5) = " + Math.max(-4, 5));
        System.out.println("Math.max(-8.2, 0.7) = " + Math.max(-8.2, 0.7));

        System.out.println("Math.min(3, 5) = " + Math.min(3, 5));
        System.out.println("Math.min(4.5, 12.7) = " + Math.min(4.5, 12.7));
        System.out.println("Math.min(-4, 5) = " + Math.min(-4, 5));
        System.out.println("Math.min(-8.2, 0.7) = " + Math.min(-8.2, 0.7));

        System.out.println("Math.pow(2, 2) = " + Math.pow(2, 2));
        System.out.println("Math.pow(2, 0.5) = " + Math.pow(2, 0.5));
        System.out.println("Math.pow(2, -3) = " + Math.pow(2, -3));
        System.out.println("Math.pow(2, 0) = " + Math.pow(2, 0));

        System.out.println("Math.sqrt(4) = " + Math.sqrt(4));
        System.out.println("Math.sqrt(64) = " + Math.sqrt(64));
        System.out.println("Math.sqrt(100) = " + Math.sqrt(100));

        System.out.println("Math.cbrt(8) = " + Math.cbrt(8));
        System.out.println("Math.cbrt(64) = " + Math.cbrt(64));
        System.out.println("Math.cbrt(1000) = " + Math.cbrt(1000));

        for (int i = 0; i < 10; i++) {
            System.out.println(i + ": Math.random() = " + Math.random());
        }

    }

}
