package com.serene.studentsystem;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/10/23
 */
public class StudentSystem {
    public static void main(String[] args) {
        System.out.println("----------欢迎来到黑马学生管理系统----------");
        ArrayList<Student> students = new ArrayList<>();
        loop:
        while (true) {
            System.out.println("1:添加学生");
            System.out.println("2:删除学生");
            System.out.println("3:修改学生");
            System.out.println("4:查询学生");
            System.out.println("5:退出系统");
            System.out.print("请输入您的选择:");

            Scanner sc = new Scanner(System.in);
            String operation = sc.next();
            switch (operation) {
                case "1" -> addStudent(students);
                case "2" -> deleteStudent(students);
                case "3" -> updateStudent(students);
                case "4" -> queryStudent(students);
                case "5" -> {
                    break loop;
                }
                default -> System.out.println("没有这个选项，请重新输入。\n\n");

            }
        }
    }

    public static void addStudent(ArrayList<Student> studentArrayList) {
        Scanner sc = new Scanner(System.in);
        Student stu = new Student();
        System.out.print("请输入学生的id: ");
        String id = sc.next();

        if (checkIdExists(studentArrayList, id) >= 0) {
            System.out.println("id已存在，添加失败");
            return;
        }


        System.out.print("请输入学生的姓名: ");
        String name = sc.next();

        System.out.print("请输入学生的姓名: ");
        int age = sc.nextInt();

        System.out.print("请输入学生的姓名: ");
        String address = sc.next();

        stu.setId(id);
        stu.setName(name);
        stu.setAge(age);
        stu.setAddress(address);

        System.out.println("添加成功！" + stu.getId() + stu.getName() + stu.getAge() + stu.getAddress());
    }

    public static void deleteStudent(ArrayList<Student> studentArrayList) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入学生的id: ");
        String id = sc.next();

        int index = checkIdExists(studentArrayList, id);
        if (index <= 0) {
            System.out.println("id不存在，删除失败。");
            return;
        }

        studentArrayList.remove(index);
        System.out.println("删除成功。");

    }

    public static void updateStudent(ArrayList<Student> studentArrayList) {

    }

    public static void queryStudent(ArrayList<Student> studentArrayList) {
        if (studentArrayList.isEmpty()) {
            System.out.println("当前无学生信息，请添加后再查询");
            return;
        }
        System.out.println("id\t\t姓名\t\t年龄\t家庭住址");
        for (Student student : studentArrayList) {
            System.out.print(student.getId() + "\t\t");
            System.out.print(student.getName() + "\t\t");
            System.out.print(student.getAge() + "\t");
            System.out.print(student.getAddress() + "\n");
        }
    }

    public static int checkIdExists(ArrayList<Student> studentArrayList, String id) {
        for (int i = 0; i < studentArrayList.size(); i++) {
            Student stu = studentArrayList.get(i);
            if (stu.getId().equals(id)) {
                return i;
            }
        }

        return -1;
    }

}
