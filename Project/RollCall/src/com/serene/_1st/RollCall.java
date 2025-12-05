package com.serene._1st;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/4
 */
public class RollCall {
    public static void main(String[] args) {
        /*
        自动点名器1
        班级里有80个学生，实现随机点名器。
        为了方便，用学号表示，从10001到10080
         */

        ArrayList<Integer> namelist = new ArrayList<>();
        for (int i = 0; i < 80; i++) {
            namelist.add(10001 + i);
        }

        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("请输入要点名的次数（非正数表示退出）：");
            int times = sc.nextInt();
            if (times < 1) {
                System.exit(times);
            }
            for (int i = 0; i < times; i++) {
                int index = r.nextInt(80);
                System.out.println(namelist.get(index));
            }

        }

    }

}
