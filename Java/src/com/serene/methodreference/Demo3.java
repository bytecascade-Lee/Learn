package com.serene.methodreference;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/14
 */
public class Demo3 {
    public static void main(String[] args) {
        /*
        方法引用(引用成员方法)
        格式
        其他类:其他类对象::方法名
        本类:this::方法名
        父类:super::方法名
        需求:
        集合中有一些名字，按照要求过滤数据数据:"张无忌", "周芷若", "赵敏", "张强", "张三丰"
        要求:只要以"张"开头，而且名字是3个字的
         */

        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, "张无忌", "周芷若", "赵敏", "张强", "张三丰");

        arrayList.stream()
                .filter(Demo3::func1)
                .filter(Demo3::func2)
                .forEach(System.out::println);

        arrayList.stream()
                .filter(Demo3::func0)
                .forEach(System.out::println);

    }

    public static boolean func1(String s) {
        return s.startsWith("张");
    }

    public static boolean func2(String s) {
        return s.length() == 3;
    }

    public static boolean func0(String s) {
        return s.startsWith("张") && s.length() == 3;
    }

}
