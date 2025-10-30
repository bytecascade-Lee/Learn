package com.serene.polymorphismdemo1;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/10/30
 */
public class Person {
    private String id;
    private String name;
    private int age;

    public Person() {
    }

    public Person(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void show(){
        System.out.println("成员信息是:\nid:" + this.getId() + "\n姓名:" +
                this.getName() + "\n年龄:" + this.getAge());
    }
}
