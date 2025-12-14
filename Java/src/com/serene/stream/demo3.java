package com.serene.stream;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/13
 */
public class demo3 {
    public static void main(String[] args) {
        /*
        Stream流的中间方法
        名称                                                    说明
        Stream<T> filter(Predicate<? super T> predicate)        过滤
        Stream<T> limit(long maxSize)                           获取前几个元素
        Stream<T> skip(long n)                                  跳过前几个元素
        Stream<T> distinct()                                    元素去重，依赖(hashcode和equals方法)
        static<T> Stream<T> concat(Stream a, Stream b)          合并a和b两个流为一个流
        Stream<R> map(Function<T, R> mapper)                    转换流中的数据类型

        注意1:中间方法，返回新的Stream流，原来的Stream流只能使用一次，建议使用链式编程
        注意2:修改Stream流中的数据，不会影响原来集合或者数组中的数据
         */

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("张无忌");
        list1.add("周芷若");
        list1.add("赵敏");
        list1.add("张强");
        list1.add("张三丰");
        list1.add("张翠山");
        list1.add("张良");
        list1.add("王二麻子");
        list1.add("谢广坤");
        list1.add("谢广坤");
        list1.add("谢广坤");
        list1.add("谢广坤");
        list1.add("谢广坤");
        list1.add("谢广坤");

        // filter
        System.out.println("\n\n==========filter==========");
        list1.stream()
                .filter(s -> s.startsWith("张"))
                .filter(s -> s.length() == 3)
                .forEach(System.out::println);

        // limit
        System.out.println("\n\n==========limit==========");
        list1.stream()
                .limit(3)
                .forEach(System.out::println);

        // skip
        System.out.println("\n\n==========skip==========");
        list1.stream()
                .skip(4)
                .forEach(System.out::println);

        // limit与skip综合练习：获取"张强"、"张三丰"、"张翠山"
        System.out.println("\n\n==========limit与skip综合练习==========");
        list1.stream()
                .limit(6)
                .skip(3)
                .forEach(System.out::println);
        /*
        或者：
        list1.stream()
                .skip(3)
                .limit(3)
                .forEach(System.out::println);
         */

        // distinct
        System.out.println("\n\n==========distinct==========");
        list1.stream()
                .distinct()
                .forEach(System.out::println);

        // concat
        System.out.println("\n\n==========concat==========");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("aaa");
        list2.add("bbb");
        list2.add("ccc");
        Stream.concat(list1.stream(), list2.stream())
                .forEach(System.out::println);

        // map
        System.out.println("\n\n==========map==========");
        ArrayList<String> list3 = new ArrayList<>();
        list3.add("张无忌-15");
        list3.add("周芷若-14");
        list3.add("赵敏-22");
        list3.add("张强-100");
        list3.add("张三丰-65");
        list3.add("张翠山-44");
        list3.add("张良-54");
        list3.add("王二麻子-96");
        list3.add("谢广坤-30");
        list3.stream()
                .map(s -> Integer.parseInt(s.split("-")[1]))
                .forEach(System.out::println);
        /*
        匿名内部类方法
        list3.stream()
                .map(new Function<String, Integer>() {
                    @Override
                    public Integer apply(String s) {
                        String[] arr = s.split("-");
                        String a = arr[1];
                        int age = Integer.parseInt(a);
                        return age;
                    }
                }).forEach(System.out::println);
        */
    }

}
