package com.serene.stream;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/14
 */
public class demo4 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("张无忌");
        list1.add("周芷若");
        list1.add("赵敏");
        list1.add("张强");
        list1.add("张三丰");
        list1.add("张翠山");
        list1.add("张良");
        list1.add("王二麻子");

        /*list1.stream()
                .toArray(len -> new String[len]);*/

        /*list1.stream()
                .toArray(String[]::new)*/;

        String[] array = list1.toArray(String[]::new);
        System.out.println(Arrays.toString(array));
    }

}
