package com.serene.mathdemo;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/11/6
 */
public class IsPrime {
    public static void main(String[] args) {
        System.out.println("isPrime(100) = " + isPrime(100));
        System.out.println("isPrime(131) = " + isPrime(131));
        System.out.println("isPrime(997) = " + isPrime(997));
    }

    public static boolean isPrime(int number){
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
