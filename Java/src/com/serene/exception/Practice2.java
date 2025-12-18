package com.serene.exception;

import java.util.Scanner;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/18
 */
public class Practice2 {
    public static void main(String[] args) {
        /*
        需求：
        键盘录入自己心仪的女朋友姓名和年龄
        姓名的长度在3~10之间，
        年龄的范围为18-40岁
        超出这个范围是异常数据不能赋值，需要重新录入,一直录到正确为止。

        提示：
        需要考虑用户在键盘录入时的所有情况，
        比如:录入年龄时超出范围，录入年龄时录入了abc等情况
         */

        GirlFriend girl = new GirlFriend();
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("请输入女朋友的姓名：");
                String name = sc.nextLine();
                girl.setName(name);
                System.out.print("请输入女朋友的年龄：");
                String ageStr = sc.nextLine();
                int age = Integer.parseInt(ageStr);
                girl.setAge(age);

                break;
            } catch (NumberFormatException | NameFormateException | AgeOutOfBoundsException e) {
                e.printStackTrace();
            }
        }

        System.out.println(girl);
    }

}
