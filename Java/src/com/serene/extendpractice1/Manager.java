package com.serene.extendpractice1;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/10/30
 */
public class Manager extends Employee{
    private double bonus;

    public Manager() {
    }

    public Manager(String id, String name, int age, double salary, double bonus) {
        super(id, name, age, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("经理在管理他人");
    }
}
