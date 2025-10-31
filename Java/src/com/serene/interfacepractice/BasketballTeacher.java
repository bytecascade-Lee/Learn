package com.serene.interfacepractice;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/10/31
 */
public class BasketballTeacher extends Teacher{
    public BasketballTeacher() {
    }

    public BasketballTeacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("篮球教练在教运动员打篮球");
    }
}
