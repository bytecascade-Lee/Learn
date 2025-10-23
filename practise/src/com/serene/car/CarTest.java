package com.serene.car;

import java.util.Scanner;

public class CarTest {
    /*

    定义数组存储3部汽车对象。
    汽车属性：品牌、价格、颜色。
    创建3个汽车对象，数据从键盘录入而来，并把数据存入到数组当中。

     */

    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        Car[] arr = {car1, car2, car3};


        // 键盘录入知识补充

        // 第一套体系：
        // nextInt();接收整数
        // nextDouble();接收小数
        // next();接收字符串
        // 特点：遇到空格、制表符和回车后，结束接收
        // 例如：输入‘123 123’（空格）后，第一组123正常赋值，
        // 而第二组123会赋值给下一个等待接收的变量（不分类型）

        // 第二套体系：
        // nextLine();接收字符串
        // 特点：可以接收空格和制表符，遇到回车后停止接收
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            Car car = arr[i];
            String brand = sc.nextLine();
            car.setBrand(brand);
            double price = sc.nextDouble();
            car.setPrice(price);
            String color = sc.nextLine();
            car.setColor(color);
        }

        for (int i = 0; i < arr.length; i++) {
            Car car = arr[i];
            System.out.print(car.getBrand() + ",");
            System.out.print(car.getPrice() + ",");
            System.out.print(car.getColor() + ",");
            System.out.println();

        }
    }

}
