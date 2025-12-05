package main.com.serene;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/5
 */
public class RollCall {
    public static void main(String[] args) {
        /*
        班级里有80个学生
        要求:
        被程序点到的学生不会再次被选到。
        但是如果班级中所有的学生都点完了，需要重新开启第二轮点名。
         */

        ArrayList<Integer> allStudents = new ArrayList<>();

        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 80; i++) {
            allStudents.add(10001 + i);
        }

        ArrayList<Integer> availableList = new ArrayList<>(allStudents);

        while (true) {

            System.out.print("请输入要点的人数，人数大于剩余长度时，多余的自动开启第二轮继续点：");

            int times = sc.nextInt();

            if (times < 1) {
                System.exit(times);
            }

            while (times > availableList.size()) {
                int temp = availableList.size();
                for (Integer name : availableList) {
                    System.out.println(name);
                }

                availableList = allStudents;

                times -= temp;
            }

            for (int i = 0; i < times; i++) {
                int index = r.nextInt(availableList.size());
                System.out.println(availableList.get(index));
                availableList.remove(index);
            }
        }



    }

}
