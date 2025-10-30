package com.serene.polymorphismdemo2;

/**
 * Description:多态注意事项
 *
 * @author Serene Lee
 * @date 2025/10/30
 */
public class Test {
    public static void main(String[] args) {
        //创建对象（多态方式）
        //Fu f = new Zi();
        Animal animal = new Dog();
        System.out.println(animal.getName());
        animal.hello();
        //调用成员变量：编译看左边，运行也看左边
        //编译看左边：javac编译代码的时候，会看左边的父类中有没有这个变量，如果有，编译成功，如果没有编译失败。
        //运行也看左边：java运行代码的时候，实际获取的就是左边父类中成员变量的值
    }
}

class Animal {
    private String name = "动物";

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

    public void hello(){
        System.out.println("动物在打招呼。");
    }
}

class Dog extends Animal {
    private String name = "狗";

    public Dog() {
    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public void hello() {
        System.out.println("狗在打招呼");
    }
}
