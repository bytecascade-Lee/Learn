package com.serene._2nd;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/5
 */
public class RollCall4 {
    public static void main(String[] args) {
        ArrayList<Integer> sex = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            sex.add(1);
        }
        for (int i = 0; i < 3; i++) {
            sex.add(0);
        }

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int bound = r.nextInt(80);
        ArrayList<Student> boyList = new ArrayList<>();
        ArrayList<Student> girlList = new ArrayList<>();

        for (int i = 0; i < bound; i++) {
            boyList.add(new Student(10001 + i, 1));
        }


        for (int i = bound; i < 80; i++) {
            girlList.add(new Student(10001 + i, 0));
        }

        while (true) {
            System.out.print("请输入要点名的次数（非正数表示退出）：");
            int times = sc.nextInt();
            if (times < 1) {
                System.exit(times);
            }

            for (int i = 0; i < times; i++) {
                int temp = sex.get(r.nextInt(10));

                if (temp == 1) {
                    System.out.println(boyList.get(r.nextInt(boyList.size())));
                } else {
                    System.out.println(girlList.get(r.nextInt(girlList.size())));
                }

            }
        }

    }

}
