package com.serene.interfacedemo1;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/10/31
 */
public class Dog extends Animal implements Swim{
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("狗在啃骨头");
    }

    @Override
    public void swim() {
        System.out.println("狗刨");
    }
}
