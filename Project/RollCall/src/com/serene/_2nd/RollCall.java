package com.serene._2nd;

import java.util.*;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/4
 */
public class RollCall {
    public static void main(String[] args) {
        /*
        自动点名器2
        班级里有80个学生
        要求:70%的概率随机到男生
        30%的概率随机到女生
         */

        // 只创建一个名单集合，前面存储女生，后面存储男生
        ArrayList<Student> students = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        // 性别存储在字典的值中
        // 1表示男生 0表示女生
        for (int i = 0; i < 80; i++) {
            students.add(new Student(10001 + i, r.nextInt(2)));
        }

        students.sort((o1, o2) ->
                // o1是待排序的
                // o2是已排序的
                o1.getSex() != o2.getSex() ?
                        // 性别排序使得女生在前
                        o1.getSex() - o2.getSex() :
                        // 名字排序使得小的在前
                        o1.getName() - o2.getName());


        // 获取男女生分界点下标，该下标表示集合中第一个男生
        int bound = 0;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getSex() == 1) {
                bound = i;
                break;
            }
        }

        while (true) {
            System.out.print("请输入要点名的次数（非正数表示退出）：");
            int times = sc.nextInt();
            if (times < 1) {
                System.exit(times);
            }

            int boy = (int) Math.round(times * 0.7);
            int girl = times - boy;

            System.out.println("男（0.7）：");
            for (int i = bound; i < boy + bound; i++) {
                int index = r.nextInt((students.size() - bound)) + bound;
                System.out.println(students.get(index));
            }

            System.out.println("\n\n");

            System.out.println("女（0.3）：");
            for (int i = 0; i < girl; i++) {
                int index = r.nextInt(bound);
                System.out.println(students.get(index));
            }
        }
    }

}
