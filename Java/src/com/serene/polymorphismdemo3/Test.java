package com.serene.polymorphismdemo3;

import java.util.ArrayList;
import java.util.Random;

/**
 * Description:多态的优势和劣势
 *
 * @author Serene Lee
 * @date 2025/10/30
 */
public class Test {
    public static void main(String[] args) {

        //  1.多态的优势
        //  方法中，使用父类型作为参数，可以接收所有子类对象
        //  2.多态的弊端是什么？
        //  不能使用子类的特有功能
        ArrayList<Animal> animalArrayList = new ArrayList<>();
        Animal animalDog = new Dog();
        Animal animalCat = new Cat();
        animalArrayList.add(animalDog);
        animalArrayList.add(animalCat);
        for (int i = 0; i < 5; i++) {
            Random r = new Random();
            int index = r.nextInt(2);
            Animal animal = animalArrayList.get(index);
            animal.eat();

            //  3.引用数据类型的类型转换，有几种方式？
            //  自动类型转换、强制类型转换。例如：
            //  Person p = new Student (); 自动类型转换
            //  Student s=(Student)p;  强制类型转换

            //  4.强制类型转换能解决什么问题？
            //  可以转换成真正的子类类型，从而调用子类独有功能。
            //  转换类型与真实对象类型不一致会报错
            //  转换的时候用instanceof关键字进行判断
            if (animal instanceof Dog dog) {
                dog.lookHome();
            } else if (animal instanceof Cat cat) {
                cat.catchMosue();
            }
            System.out.println();
        }

    }

}

class Animal {
    private String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("动物在吃东西。");
    }
}

class Dog extends Animal {
    public Dog() {
    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("狗在啃骨头。");
    }

    public void lookHome() {
        System.out.println("狗在看家。");
    }
}

class Cat extends Animal {
    public Cat() {
    }

    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("猫在吃小鱼干。");
    }

    public void catchMosue() {
        System.out.println("猫在抓老鼠。");
    }
}
