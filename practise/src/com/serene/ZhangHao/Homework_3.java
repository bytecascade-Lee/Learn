package com.serene.ZhangHao;

import java.util.Scanner;

/**
 * Description:
 *
 * @author Serene Lee
 * date 2025/10/19
 */
public class Homework_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("对于一元二次方程 ax²+bx+c=0 ，请按照提示输入。");
        System.out.print("请输入二次项系数a的整数值： ");
        int a = sc.nextInt();
        if (a == 0) {
            System.out.println("a值不能为0！");
            return;
        }
        System.out.print("请输入一次项系数b的整数值： ");
        int b = sc.nextInt();
        System.out.print("请输入常数项c的整数值： ");
        int c = sc.nextInt();

        double delta = Math.pow(b, 2) - 4 * a * c;
        double v;
        boolean flag;
        if (delta >= 0) {
            v = Math.sqrt(delta);
            flag = false;
        } else {
            v = Math.sqrt(-delta);
            flag = true;
        }
        double result1 = -b * 0.5 / a;
        double result2 = v * 0.5 / a;
        if (delta == 0.0) {
            System.out.println("该二次方程存在两个相等的实数根： " + (result1 + result2));
            return;
        }

        if (flag) {
            result2 = result2 > 0 ? result2 : -result2;
            System.out.println("该二次方程存在两个不等的虚数根。");
            System.out.println("第一个根： " + result1 + " + " + result2 + "i");
            System.out.println("第二个根： " + result1 + " - " + result2 + "i");


        } else {
            System.out.println("该二次方程存在两个不等的实数根。");
            System.out.println("第一个根： " + (result1 + result2));
            System.out.println("第二个根： " + (result1 - result2));
        }
    }

}
