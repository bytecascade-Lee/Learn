package com.serene.interfacedemo;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/10/31
 */
public class Test {
    public static void main(String[] args) {
        /*
         *
         * 接口的定义和使用
         * 接口用关键字interface来定义public interface 接口名 {}
         * 接口不能实例化
         * 接口和类之间是实现关系，通过implements关键字表示public class 类名 implements 接口名 {接口的子类(实现类
         * 要么重写接口中的所有抽象方法
         * 要么是抽象类
         * 注意1:接口和类的实现关系，可以单实现，也可以多实现，
         * public class 类名 implements 接口名1，接口名2 {注意2:实现类还可以在继承一个类的同时实现多个接口。
         * public class 类名 extends 父类implements 接囗名1，接口名2 {}
         */

        Dog dog = new Dog("泰迪", 2);
        dog.eat();
        dog.drink();
        dog.swim();

        Frog frog = new Frog("小绿", 1);
        frog.eat();
        frog.drink();
        frog.swim();

        Goat goat = new Goat("咩", 4);
        goat.eat();
        goat.drink();
    }

}
