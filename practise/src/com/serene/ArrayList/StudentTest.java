package com.serene.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/10/21
 */
public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> stuList = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            Student stu = new Student();
            System.out.print("姓名：");
            stu.setName(sc.next());
            System.out.print("年龄：");
            stu.setAge(sc.nextInt());
            stuList.add(stu);
        }

        for (int i = 0; i < stuList.size(); i++) {
            Student temp = stuList.get(i);
            System.out.println((i + 1) + ".  " +
                    "姓名: " + temp.getName() + "   " +
                    "年龄: " + temp.getAge());
        }

    }

}
