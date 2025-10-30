package com.serene.extendpractice1;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/10/30
 */
public class Test {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.setId("001");
        manager.setName("张三");
        manager.setSalary(15000);
        manager.setBonus(5000);
        System.out.println(manager.getId() + ", " + manager.getName() + ", " +
                manager.getSalary() + ", " + manager.getBonus());
        manager.work();
        manager.eat();

        Cook cook = new Cook();
        cook.setId("002");
        cook.setName("李四");
        cook.setSalary(8000);
        System.out.println(cook.getId() + ", " + cook.getName() + ", " + cook.getSalary());
        cook.work();
        cook.eat();
    }

}
