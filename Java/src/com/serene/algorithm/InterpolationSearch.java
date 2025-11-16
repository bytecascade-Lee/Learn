package com.serene.algorithm;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/11/15
 */
public class InterpolationSearch {
    public static void main(String[] args) {
        /*
        插值查找
        二分查找中查找点计算如下：
        mid=(low+high)/2, 即mid=low+1/2*(high-low);
        我们可以将查找的点改进为如下：
        mid=low+(key-a[low])/(a[high]-a[low])*(high-low)，
        这样，让mid值的变化更靠近关键字key，这样也就间接地减少了比较次数。
        基本思想：基于二分查找算法，将查找点的选择改进为自适应选择，可以提高查找效率。
        当然，差值查找也属于有序查找。
         */
        int[] arr = {7, 23, 79, 81, 103, 127, 131, 147};
        int number = 7;
        System.out.println(isNumberExists(arr, number));
    }

    public static boolean isNumberExists(int[] arr, int number) {
           int min = 0;
           int max = arr.length - 1;

       while (min <= max) {
           if (min == max) {
               return arr[min] == number;
           }

           int middle = min + ((number - arr[min]) * (max - min)) / (arr[max] - arr[min]);

           if (number > arr[middle]) {
                min = middle + 1;
            } else if (number < arr[middle]) {
                max = middle - 1;
            } else {
                return true;
            }
        }

        return false;
    }

}
