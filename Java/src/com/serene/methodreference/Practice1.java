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
public class Practice1 {
    public static void main(String[] args) {
        /*
        练习1:集合中存储一些字符串的数据，比如:张三,23
        收集到Student类型的数组当中(使用方法引用完成)
         */
        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, "张三,23", "李四,36", "赵六,51");

        Student[] students = arrayList.stream()
                .map(Student::new)
                .toArray(Student[]::new);

        Stream.of(students).forEach(System.out::println);
    }

}
