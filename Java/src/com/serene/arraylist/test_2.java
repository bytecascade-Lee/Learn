package com.serene.arraylist;

import java.util.ArrayList;

/**
 * Description:
 *
 * @author Serene Lee
 * date 2025/10/20
 */
public class test_2 {
    public static void main(String[] args) {
        /*
       ArrayList的增、删、查、改和获取长度
         */

        // 初始化ArrayList
        ArrayList<String> list = new ArrayList<>();

        // 1.增加元素
        // 返回值永远是true，故不需要管
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        System.out.println("1: " + list);
        // 根据索引添加元素
        list.add(1, "aa");
        System.out.println("2: " + list);

        // 2.删除元素
        // 删除成功则返回值为true，失败则相反
        boolean result1 = list.remove("aa");
        System.out.println("3: " + list);
        System.out.println("1: " + result1);
        boolean result2 = list.remove("x");
        System.out.println("2: " + result2);
        // 通过索引删除元素
        list.remove(2);
        System.out.println("4: " + list);

        // 3.查找元素
        String find = list.get(0);
        System.out.println("1: " + find);

        // 4.修改元素
        list.set(1, "w");
        System.out.println("5: " + list);

        // 5.获取长度
        // 与get()结合可以遍历ArrayList
        int len = list.size();
        for (int i = 0; i < len; i++) {
            System.out.print(list.get(i) + "  ");
        }


    }

}
