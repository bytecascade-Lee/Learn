package com.serene.interfacedemo;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/10/31
 */
public class Frog extends Animal implements Swim{
    public Frog() {
    }

    public Frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("青蛙在吃虫子");
    }

    @Override
    public void swim() {
        System.out.println("蛙泳");
    }
}
