package com.serene.arraylist;

import java.util.ArrayList;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/10/21
 */
public class test_4 {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(0);
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);

        printArrayList(intList);

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
