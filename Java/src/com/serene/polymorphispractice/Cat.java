package com.serene.polymorphispractice;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/10/30
 */
public class Cat extends Animal {
    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String something) {
        System.out.println(getAge() + "岁的" + getColor() + "的狗用两只前腿死死地抱住" + something + "猛吃");
    }

    public void catchMouse() {
        System.out.println("猫在抓老鼠");
    }
}
