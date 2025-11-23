package com.serene.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/11/23
 */
public class demo2 {
    public static void main(String[] args) {
        Student student1 = new Student("小明", 1, 18);
        Student student2 = new Student("小明", 1, 18);
        Student student3 = new Student("小美", 0, 16);
        Student student4 = new Student("小亮", 1, 19);
        Collection<Student> studentCollection = new ArrayList<>();
        studentCollection.add(student1);
        studentCollection.add(student2);
        studentCollection.add(student3);

        System.out.println(studentCollection.contains(student1));
        System.out.println(studentCollection.contains(student4));

    }

}

class Student {
    private String name;
    private int sex;
    private int age;

    public Student() {
    }

    public Student(String name, int sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return sex
     */
    public int getSex() {
        return sex;
    }

    /**
     * 设置
     * @param sex
     */
    public void setSex(int sex) {
        this.sex = sex;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{name = " + name + ", sex = " + sex + ", age = " + age + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return sex == student.sex && age == student.age && Objects.equals(name, student.name);
    }

}
