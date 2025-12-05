package com.serene.collections;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/4
 */
public class demo1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        Collections.addAll(arrayList, "abc", "bcd", "cde", "def", "123", "234", "345");

        for (int i = 0; i < 5; i++) {
            System.out.println(arrayList);
            Collections.shuffle(arrayList);
        }

    }

}
