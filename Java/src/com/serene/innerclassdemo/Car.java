package com.serene.innerclassdemo;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/11/1
 */
public class Car {
    // 需求：写一个Javabean类描述汽车。
    // 属性：汽车的品牌，车龄，颜色，发动机的品牌，使用年限。
    // 内部类的访问特点：
    // 内部类可以直接访问外部类的成员，包括私有
    // 外部类要访问内部类的成员，必须创建对象

    private String brand;
    private int age;
    private String color;

    Engineer engineer = new Engineer();


    class Engineer {
        private String brand;
        private int age;

        public Engineer() {
        }

        public Engineer(String brand, int age) {
            this.brand = brand;
            this.age = age;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

}
