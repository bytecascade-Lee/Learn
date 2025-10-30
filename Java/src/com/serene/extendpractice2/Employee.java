package com.serene.extendpractice2;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/10/30
 */
public class Employee {
    private String id;
    private String name;
    private String salary;

    public Employee() {
    }

    public Employee(String id, String name, String salary) {
        this.id = id;
        this.name = name;
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

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public void work(){
        System.out.println("work");
    }
}
