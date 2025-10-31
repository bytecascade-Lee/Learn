package com.serene.interfacedemo;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/10/31
 */
public class Goat extends Animal{
    public Goat() {
    }

    public Goat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("山羊在吃艹");
    }
}
