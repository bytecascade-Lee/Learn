package com.serene.algorithmpractice;

import java.util.ArrayList;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/11/15
 */
public class BasicSearchPractice2 {
    public static void main(String[] args) {
        int[] arr = {131, 127, 147, 81, 103, 23, 79, 79};
        int number = 79;
        System.out.println(search(arr, number));
    }

    public static ArrayList<Integer> search(int[] arr, int number) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                arrayList.add(i);
            }
        }
        return arrayList;
    }


}
