package com.serene.methodreference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/17
 */
public class Practice3 {
    public static void main(String[] args) {
        /*
        练习3:创建集合添加学生对象，学生对象属性:name，age
        把姓名和年龄拼接成:张三-23的字符串，并放到数组当中(使用方法引用完成)
         */

        ArrayList<Student> list = new ArrayList<>();
        Collections.addAll(list,
                new Student("张三,23"),
                new Student("李四,36"),
                new Student("赵六,51"));


        /*
        String[] array = list.stream()
                .map(Practice3::format)
                .toArray(String[]::new);
         */
        // 可以重写toString方法实现
        String[] array = list.stream()
                .map(Student::toString)
                .toArray(String[]::new);

        Stream.of(array).forEach(System.out::println);
    }

    public static String format(Student student) {
        return student.getName() + "-" + student.getAge();
    }

}
