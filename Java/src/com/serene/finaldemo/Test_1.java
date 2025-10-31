package com.serene.finaldemo;

import com.serene.student.Student;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/10/31
 */
public class Test_1 {
    public static void main(String[] args) {
        /*

        final修饰方法：
        表明该方法是最终方法，不能被重写    很少使用
        final修饰类：
        表明该类是最终类，不能被继承       很少使用
        final修饰变量：
        叫做常量，只能被赋值一次          constant
        final修饰的变量是基本数据类型：那么变量存储的 数据值 不能发生改变。
        final修饰的变量是引用数据类型：那么变量存储的 地址值 不能发生改变，对象内部的可以改变。

         */

        final double PI = 3.14;
        System.out.println(PI);

        // PI = 3.1415926; 报错：无法将值赋给 final 变量 'PI'


        final Student S = new Student();
        S.setId(1);
        S.setName("张三");
        S.setAge(18);
        System.out.println(S.getId() + S.getName() + S.getAge());
        S.setId(2);
        S.setName("李四");
        S.setAge(20);
        System.out.println(S.getId() + S.getName() + S.getAge());

        // student = new Student(); 报错：无法将值赋给 final 变量 'student'

    }


}
