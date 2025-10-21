package com.serene.ArrayList;

import java.util.ArrayList;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/10/21
 */
public class test_3 {
    public static void main(String[] args) {
        /*
        需求：定义一个集合，添加字符串，并进行遍历
        遍历格式参照：[元素1, 元素2, 元素3]。
         */

        ArrayList<String> strList = new ArrayList<>();
        strList.add("hello");
        strList.add("what");
        strList.add("abcde");
        strList.add("xyz");

        printArrayList(strList);

    }

    public static void printArrayList(ArrayList list){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
            if (i == list.size() - 1) {
                sb.append("]");
                continue;
            }
            sb.append(", ");
        }
        System.out.println(sb);

    }

}
