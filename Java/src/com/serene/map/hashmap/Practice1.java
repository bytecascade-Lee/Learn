package com.serene.map.hashmap;

import java.util.HashMap;
import java.util.Objects;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/2
 */
public class Practice1 {
    public static void main(String[] args) {
        /*
        存储人物对象并遍历
        需求
        创建一个HashMap集合，键是人物对象(Student)，值是籍贯(String)
        存储三个键值对元素，并遍历
        要求:同姓名，同年龄认为是同一个人物
         */


        // 重点：
        // HashMap存储的对象如果是自定义对象，需要重写HashCode和equals方法

        HashMap<Person, String> persons = new HashMap<>();
        persons.put(new Person("狄仁杰", 40), "并州");
        persons.put(new Person("李元芳", 30), "凉州");
        persons.put(new Person("狄  春", 25), "并州");

        persons.forEach((person, str) ->
                System.out.println(person + " = " + str));

    }

}

class Person {
    String name;
    int age;


    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

}