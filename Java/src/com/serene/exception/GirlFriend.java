package com.serene.exception;

import java.util.Objects;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/18
 */
public class GirlFriend {
    private String name;
    private int age;


    public GirlFriend() {
    }

    public GirlFriend(String name, int age) {
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
        if (name.length() < 3 || name.length() > 10) {
            throw new NameFormateException("姓名 " + name + " 长度不对：应该为3~10");
        }
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
        if (age < 18 || age > 40) {
            throw new AgeOutOfBoundsException("年龄 " + age + " 范围不对：应该为18~40");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "GirlFriend{name = " + name + ", age = " + age + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GirlFriend that = (GirlFriend) o;
        return age == that.age && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
