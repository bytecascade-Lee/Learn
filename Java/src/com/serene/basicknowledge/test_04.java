package com.serene.basicknowledge;

import java.util.Scanner;

public class test_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.兰州拉面");
        System.out.println("2.武汉热干面");
        System.out.println("3.北京炸酱面");
        System.out.println("4.陕西油泼面");

        System.out.print("请输入要吃的面（1~4）");

        int noodle = sc.nextInt();
        /*
        如果没有break语句，则会造成case穿透

        switch 语句的核心是 “标签匹配 + 顺序执行”，而非 “分支独立判断”。它的执行流程可以类比为：

            匹配标签：根据 switch(表达式) 的结果，找到第一个与之相等的
                case 常量（或进入 default），程序跳转到这个 case 对应的代码行。
            顺序往下执行：从匹配的标签处开始，逐行执行代码，
                直到遇到 break/return 等 “终止符”，或执行到 switch 语句的末尾 —— 这就是 “穿透” 的根源。

        简单说：case 只是 “跳转的标记”，不是 “独立的代码块边界”。
            一旦跳转到某个 case，程序就会像在普通代码里一样 “顺流而下”，不会主动检查下一个 case 的条件。
         */
        switch (noodle) {
            case 1:
                System.out.println("兰州拉面");
                break;
            case 2:
                System.out.println("武汉热干面");
                break;
            case 3:
                System.out.println("北京炸酱面");
                break;
            case 4:
                System.out.println("陕西油泼面");
                break;
            default:
                System.out.println("方便面");
                break;
        }
    }
}
