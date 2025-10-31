package com.serene.polymorphispractice;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/10/30
 */
public class Keeper {
    private String name;
    private int age;

    public Keeper() {
    }

    public Keeper(String name, int age) {
        this.name = name;
        this.age = age;
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

    public void keepPet(Animal animal){
        String obj = animal instanceof Dog ? "的狗" : animal instanceof Cat ? "的猫" : null;
        String something = animal instanceof Dog ? "骨头" : animal instanceof Cat ? "鱼" : null;
        System.out.println("年龄为" + age + "岁的" + name + "养了一只" + animal.getAge() + "岁的" + animal.getColor() + obj);
        animal.eat(something);
    }
}
