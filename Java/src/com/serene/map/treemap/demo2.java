package com.serene.map.treemap;

import java.util.Comparator;
import java.util.Objects;
import java.util.TreeMap;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/4
 */
public class demo2 {
    public static void main(String[] args) {
        // 需求2:
        // 键:学生对象
        // 值:籍贯
        // 要求:按照学生年龄的升序排列，年龄一样按照姓名的字母排列，同姓名年龄视为同一个人。

        TreeMap<Student, String> students = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                // o1：当前要添加的元素
                // o2：已经存在于红黑树中的元素
                return o1.getAge() != o2.getAge() ?
                        o1.getAge() - o2.getAge() :
                        o1.getName().compareTo(o2.getName());
            }

        }
        ) {
            @Override
            public String toString() {
                return super.toString() + "\n";
            }
        };

        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("lisi", 24);
        Student s3 = new Student("wangwu", 24);

        students.put(s1, "Henan");
        students.put(s2, "Shandong");
        students.put(s3, "hubei");
        System.out.println(students);
    }


}

class Student {
    String name;
    int age;

    public Student() {
    }

    public Student(String name, int age) {
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
        return "\n姓名：" + name + "\t\t年龄：" + age + "}";
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
