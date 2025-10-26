package com.serene.staticdemo.student;

import java.util.ArrayList;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/10/26
 */
public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> studentArrayList = new ArrayList<>();

        Student stu1 = new Student("小明", 15, "男");
        Student stu2 = new Student("小亮", 17, "男");
        Student stu3 = new Student("小美", 14, "女");

        studentArrayList.add(stu1);
        studentArrayList.add(stu2);
        studentArrayList.add(stu3);

        System.out.println(StudentUtil.getStudentWithMaxAge(studentArrayList).getName());

    }




}
