package com.serene.algorithmpractice.search;

import java.util.ArrayList;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/11/16
 */
public class InterpolationSearchPractice2 {
    public static void main(String[] args) {
        int[] arr = {7, 23, 79, 79, 79, 127, 131, 147000};
        int number = 79;
        System.out.println(search(arr, number));
    }

    public static ArrayList<Integer> search(int[] arr, int number) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        int min = 0;
        int max = arr.length - 1;
        int middle = 0;
        while (min <= max) {
            if (min == max) {
                if (arr[min] == number) {
                    integerArrayList.add(min);
                } else {
                    return integerArrayList;
                }
            }

            middle = min + ((number - arr[min]) * (max - min)) / (arr[max] - arr[min]);
            middle = Math.min(middle, max);

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
            if (arr[i] == number) {
                integerArrayList.addFirst(i);
            } else {
                break;
            }
        }

        for (int i = middle + 1; i < arr.length; i++) {
            if (arr[i] == number) {
                integerArrayList.add(i);
            } else {
                break;
            }
        }

        return integerArrayList;
    }

}
