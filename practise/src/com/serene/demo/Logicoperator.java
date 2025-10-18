package com.serene.demo;

public class Logicoperator {
    public static void main(String[] args) {
        // 1.逻辑与运算
        System.out.println(true & true);// true
        System.out.println(true & false);// false
        System.out.println(false & true);// false
        System.out.println(false & false);// false

        // 2.逻辑或运算
        System.out.println(true | true);// true
        System.out.println(true | false);// true
        System.out.println(false | true);// true
        System.out.println(false | false);// false

        // 3.逻辑异或运算
        System.out.println(true ^ true);// false
        System.out.println(true ^ false);// true
        System.out.println(false ^ true);// true
        System.out.println(false ^ false);// false

        // 4.逻辑非运算
        System.out.println(!true);// false
        System.out.println(!false);// true

        // 5.短路逻辑与
        System.out.println(true && true);// true
        System.out.println(true && false);// false
        System.out.println(false && true);// false
        System.out.println(false && false);// false

        // 6.短路逻辑或
        System.out.println(true || true);// true
        System.out.println(true || false);// true
        System.out.println(false || true);// true
        System.out.println(false || false);// false

    }
}
