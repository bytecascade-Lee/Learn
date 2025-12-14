package com.serene.string;

import java.util.Scanner;

/**
 * Description:
 *
 * @author Serene Lee
 * date 2025/10/20
 */
public class test_16 {
    public static void main(String[] args) {
        /*
        键盘录入一个字符串，
        要求1：长度为小于等于9
        要求2：只能是数字
        将内容变成罗马数字
        下面是阿拉伯数字跟罗马数字的对比关系：
        Ⅰ-1、Ⅱ-2、Ⅲ-3、Ⅳ一4、Ⅴ-5、Ⅵ-6、Ⅶ-7、Ⅷ-8、Ⅸ-9
        注意点：
        罗马数字里面是没有e的
        如果键盘录入的数字包含e，可以变成""（长度为0的字符串）
        */

        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        String str = null;
        while (flag) {
            System.out.print("请输入数字，小于999999999：");
            str = sc.next();
            flag = checkStr(str);
            if (flag) {
                System.out.println("不满足规则！请重新输入！");
            }
        }

        String[] arr = {"", "Ⅰ", "Ⅱ", "Ⅲ", "Ⅳ", "Ⅴ",
                "Ⅵ", "Ⅶ", "Ⅷ", "Ⅸ"};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            int index = str.charAt(i) - '0';
            sb.append(arr[index]);
        }

        System.out.println(sb);
    }

    public static boolean checkStr(String s) {
        if (s.length() > 9) {
            return true;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch < '0' || ch > '9') {
                return true;
            }
        }

        return false;
    }


}
