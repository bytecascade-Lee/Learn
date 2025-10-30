package com.serene.polymorphispractice;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/10/30
 */
public class Dog extends Animal{
    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String something) {
        System.out.println("狗正在啃" + something);
    }

    public void lookHome(){
        System.out.println("狗在看家");
    }
}
