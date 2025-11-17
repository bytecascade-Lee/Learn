package com.serene.algorithmpractice.search;

import java.util.ArrayList;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/11/16
 */
public class BinarySearchPractice2 {
    public static void main(String[] args) {
        // 二分查找 返回所有相等的元素的下标
        int[] arr = {7, 23, 81, 81, 103, 127, 131, 147};
        int number = 81;
        System.out.println(search(arr, number));
    }

    public static ArrayList<Integer> search(int[] arr, int number) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        int min = 0;
        int max = arr.length - 1;
        int middle = 0;
        while (min <= max) {
            middle = (min + max) / 2;
            if (arr[middle] > number) {
                max = middle - 1;
            } else if (arr[middle] < number) {
                min = middle + 1;
            } else {
                integerArrayList.add(middle);
                break;
            }
        }
        for (int i = middle - 1; i >= 0; i--) {
            if (arr[i] != number) {
                break;
            }
            integerArrayList.addFirst(i);
        }
        for (int i = middle + 1; i < arr.length; i++) {
            if (arr[i] != number) {
                break;
            }
            integerArrayList.add(i);
        }


        return integerArrayList;
    }

}
