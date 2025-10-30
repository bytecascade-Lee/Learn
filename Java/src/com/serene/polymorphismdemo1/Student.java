package com.serene.polymorphismdemo1;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/10/30
 */
public class Student extends Person {
    public Student() {
    }

    public Student(String id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public void show() {
        System.out.println("学生信息是:\nid:" + this.getId() + "\n姓名:" +
                this.getName() + "\n年龄:" + this.getAge());
    }
}
