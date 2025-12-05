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
public class RollCall3 {
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

        ArrayList<Student> studentsList = new ArrayList<>();
        for (int i = 0; i < 80; i++) {
            studentsList.add(new Student(10001 + i, r.nextInt(2)));
        }

        studentsList.sort((o1, o2) ->
                o1.getSex() == o2.getSex() ?
                        // 性别相同先排名字
                        o1.getName() - o2.getName() :
                        // 性别不同再排，女生在前
                        o1.getSex() - o2.getSex());

        while (true) {
            System.out.print("请输入要点名的次数（非正数表示退出）：");
            int times = sc.nextInt();
            if (times < 1) {
                System.exit(times);
            }

            int bound = 0;
            for (int i = 0; i < 80; i++) {
                if (studentsList.get(i).getSex() == 1) {
                    bound = i;
                }
            }

            for (int i = 0; i < times; i++) {
                int temp = sex.get(r.nextInt(10));

                if (temp == 1) {
                    System.out.println(studentsList.get(r.nextInt(80 - bound) + bound));
                } else {
                    System.out.println(studentsList.get(r.nextInt(bound)));
                }
            }
        }
    }

}
