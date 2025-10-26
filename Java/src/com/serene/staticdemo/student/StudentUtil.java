package com.serene.staticdemo.student;

import java.util.ArrayList;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/10/26
 */
public class StudentUtil {
    /*
    定义学生工具类
    需求：定义一个集合，用于存储3个学生对象。
    学生类的属性为：name、age、gender
    定义一个工具类，用于获取集合中最大年龄的学生。
    */
    private StudentUtil(){
    }

    public static Student getStudentWithMaxAge(ArrayList<Student> studentArrayList){
        int max = studentArrayList.get(0).getAge();
        int index = 0;
        for (int i = 1; i < studentArrayList.size(); i++) {
            if (studentArrayList.get(i).getAge() > max){
                max = studentArrayList.get(i).getAge();
                index = i;
            }
        }

        return studentArrayList.get(index);

    }

}
