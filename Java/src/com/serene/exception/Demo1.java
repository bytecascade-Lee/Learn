package com.serene.exception;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/17
 */
public class Demo1 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        try {
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("数组越界");
            System.out.println("数组越界");
            e.printStackTrace();
        } finally {
            if (System.out != null) {
                System.out.println("执行finally代码块");
            }
        }

        // 两种输出结果：
        // 原因涉及多线程知识

        // 1.
        /*
        数组越界（白）
        执行finally代码块
        数组越界（红）
        java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
            at com.serene.exception.Demo1.main(Demo1.java:14)
         */

        // 2.
        /*
        数组越界（红）
        java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
            at com.serene.exception.Demo1.main(Demo1.java:14)
        数组越界（白）
        执行finally代码块
         */

    }

}
