package com.serene.methodreference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/16
 */
public class Demo4 {
    public static void main(String[] args) {
        //1.创建集合对象
        ArrayList<String> list = new ArrayList<>();
        //2.添加数据
        Collections.addAll(list, "张无忌,15", "周芷若,14",
                "赵敏,13", "张强,26", "张三丰,100",
                "张翠山,40", "张良,35", "王二麻子,37");

        /*List<Student> students = list.stream()
                .map(new Function<String, Student>() {
                    @Override
                    public Student apply(String s) {
                        return new Student(
                                s.split(",")[0],
                                Integer.parseInt(s.split(",")[1]));
                    }
                }).toList();
        System.out.println(students);*/

        List<Student> students = list.stream()
                .map(Student::new)
                .toList();
        System.out.println(students);

    }

}

class Student {
    private String name;
    private int age;


    public Student() {
    }

    public Student(String s) {
        String[] arr = s.split(",");
        this.name = arr[0];
        this.age = Integer.parseInt(arr[1]);
    }

    public Student(String name, int age) {
        this.name = name;
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
        return "Student{name = " + name + ", age = " + age + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}