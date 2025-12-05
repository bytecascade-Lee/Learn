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
public class RollCall2 {
    public static void main(String[] args) {
        /*
        自动点名器2
        班级里有80个学生
        要求:70%的概率随机到男生
        30%的概率随机到女生
         */

        // 创建两个名单集合，分别存储男女生

        final int TOTAL_NUMBER = 80;

        ArrayList<Student> boyList = new ArrayList<>();
        ArrayList<Student> girlList = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        // 为了保证平均，避免出现某一性别人数过少的情况，
        // 将女生人数限定在30~40之间

        int length = r.nextInt(11) + 30;

        // 为了方便起见，女生姓名用从10001开始的序号表示
        // 而男生的则用从11001开始的序号表示
        for (int i = 0; i < length; i++) {
            girlList.add(new Student(10001 + i, 0));
        }

        length = TOTAL_NUMBER - length;
        for (int i = 0; i < length; i++) {
            boyList.add(new Student(11001 + i, 1));
        }

        while (true) {

            System.out.print("请输入要点名的次数（非正数表示退出）：");

            int times = sc.nextInt();
            if (times < 1) {
                System.exit(times);
            }

            System.out.println("男生：");
            // 获取男生被抽到的人数
            int count = (int) Math.round(times * 0.7);
            for (int i = 0; i < count; i++) {
                System.out.println(boyList.get(r.nextInt(length)));
            }

            System.out.println("\n\n");

            System.out.println("女生：");
            count = times - count;
            length = TOTAL_NUMBER - length;
            for (int i = 0; i < count; i++) {
                System.out.println(girlList.get(r.nextInt(length)));
            }
        }

    }

}
