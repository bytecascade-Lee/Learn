package com.serene.stream;

import java.util.ArrayList;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/12
 */
public class demo1 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("张无忌");
        list1.add("周芷若");
        list1.add("赵敏");
        list1.add("张强");
        list1.add("张三丰");

        // 使用stream流一行搞定
        list1.stream().filter(s -> s.startsWith("张")).
                filter(s -> s.length() == 3).
                forEach(name -> System.out.println(name));

        for (String s : list1) {
            if (s.startsWith("张") && s.length() == 3) {
                System.out.println(s);
            }
        }

    }

}
