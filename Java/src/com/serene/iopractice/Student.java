package com.serene.iopractice;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/25
 */
public class Student implements Serializable {
    @Serial
    private static final long serialVersionUID = -1127250794386237202L;
    private String name;
    private boolean gender;
    private int age;
    private double weight;

    public Student() {
    }

    public Student(String[] arr) {
        this.name = arr[0];
        this.gender = "男".equals(arr[1]);
        this.age = Integer.parseInt(arr[2]);
        this.weight = 1.0;
    }

    public Student(String name, boolean gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.weight = 1.0;
    }

    public Student(String name, boolean gender, int age, double weight) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return gender
     */
    public boolean isGender() {
        return gender;
    }

    /**
     * 设置
     *
     * @param gender
     */
    public void setGender(boolean gender) {
        this.gender = gender;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     *
     * @return weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * 设置
     *
     * @param weight
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gender, age, weight);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return gender == student.gender && age == student.age && Double.compare(weight, student.weight) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public String toString() {
        return "姓名 = " + name + ", 性别 = " + gender + ", 年龄 = " + age + ", 权重" + weight;
    }
}
