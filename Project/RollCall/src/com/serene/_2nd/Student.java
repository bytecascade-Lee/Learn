package com.serene._2nd;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/4
 */
public class Student {
    int name;
    int sex;


    public Student() {
    }

    public Student(int name, int sex) {
        this.name = name;
        this.sex = sex;
    }

    /**
     * 获取
     * @return name
     */
    public int getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(int name) {
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

    @Override
    public String toString() {
        return "Student{name = " + name + ", sex = " + sex + "}";
    }
}
