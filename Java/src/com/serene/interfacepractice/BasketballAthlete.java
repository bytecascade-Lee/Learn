package com.serene.interfacepractice;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/10/31
 */
public class BasketballAthlete extends Athlete{
    public BasketballAthlete() {
    }

    public BasketballAthlete(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("篮球运动员在学习打篮球");
    }
}
