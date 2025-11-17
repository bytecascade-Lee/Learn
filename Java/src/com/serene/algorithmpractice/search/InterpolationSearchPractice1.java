package com.serene.algorithmpractice.search;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/11/16
 */
public class InterpolationSearchPractice1 {
    public static void main(String[] args) {
        int[] arr = {7, 23, 79, 81, 103, 127, 131, 147};
        int number = 79;
        System.out.println(search(arr, number));
    }

    public static int search(int[] arr, int number) {
        int min = 0;
        int max = arr.length - 1;
        while (min <= max) {
            if (min == max) {
                if (arr[min] == number) {
                    return min;
                } else {
                    return -1;
                }
            }

            int middle = min + ((number - arr[min]) * (max - min)) / (arr[max] - arr[min]);
            if (middle > max) {
                middle = max;
            }

            if (number > arr[middle]) {
                min = middle + 1;
            } else if (number < arr[middle]) {
                max = middle - 1;
            } else {
                return middle;
            }
        }

        return -1;

    }
}
