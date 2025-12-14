package com.serene.string;

import java.util.Scanner;

/**
 * Description:
 *
 * @author Serene Lee
 * date 2025/10/20
 */
public class test_18 {
    public static void main(String[] args) {

        /*
        给定两个字符串，A和B。
        A的旋转操作就是将A最左边的字符移动到最右边。
        例如，若A="abcde"，在移动一次之后结果就是"bcdea",
        如果在若干次调整操作之后，A能变成B，那么返回True。
        如果不能匹配成功，则返回false
        */
        // 方法二：利用subString()

        Scanner sc = new Scanner(System.in);
        System.out.print("A: ");
        String A = sc.next();
        System.out.print("B: ");
        String B = sc.next();

        for (int i = 0; i < A.length(); i++) {
            if (B.equals(A)) {
                System.out.println(i + "次");
                return;
            }
            A = opt(A);

        }
        System.out.println("无法操作得到目标结果！");
    }

    public static String opt(String s){

        char first = s.charAt(0);
        String str = s.substring(1);
        return  str + first;

    }

}
