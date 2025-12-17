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
public class Practice2 {
    public static void main(String[] args) {
        /*
        练习2:创建集合添加学生对象，学生对象属性:name，age
        只获取姓名并放到数组当中(使用方法引用完成)
         */

        ArrayList<Student> list = new ArrayList<>();
        Collections.addAll(list,
                new Student("张三,23"),
                new Student("李四,36"),
                new Student("赵六,51"));

        String[] array = list.stream()
                .map(Student::getName)
                .toArray(String[]::new);

        Stream.of(array).forEach(System.out::println);
    }

}
