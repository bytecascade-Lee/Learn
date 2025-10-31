package com.serene.interfacepractice;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/10/31
 */
public abstract class Athlete extends Person{
    public Athlete() {
    }

    public Athlete(String name, int age) {
        super(name, age);
    }

    public abstract void study();
}
