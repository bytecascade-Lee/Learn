package com.serene.extendpractice1;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/10/30
 */
public class Employee {
    private String id;
    private String name;
    private int age;
    private double salary;

    public Employee() {
    }

    public Employee(String id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void work(){
        System.out.println("员工在工作");
    }

    public void eat(){
        System.out.println("员工在吃米饭");
    }
}
