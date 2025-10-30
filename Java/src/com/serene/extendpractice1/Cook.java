package com.serene.extendpractice1;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/10/30
 */
public class Cook extends Employee{
    public Cook() {
    }

    public Cook(String id, String name, int age, double salary) {
        super(id, name, age, salary);
    }

    @Override
    public void work() {
        System.out.println("厨师在炒菜");
    }
}
