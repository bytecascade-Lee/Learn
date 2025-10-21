package com.serene.ArrayList;

import java.util.ArrayList;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/10/21
 */
public class test_5 {
    public static void main(String[] args) {
        ArrayList<Character> charList = new ArrayList<>();
        charList.add('a');
        charList.add('b');
        charList.add('c');
        charList.add('d');
        charList.add('e');
        charList.add('x');
        charList.add('y');
        charList.add('z');

        printArayList(charList);

    }

    public static void printArayList(ArrayList list) {
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
