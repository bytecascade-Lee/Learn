package com.serene.algorithm.search;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/11/15
 */
public class BinarySearch {
    public static void main(String[] args) {
        // 二分查找/折半查找
        // 核心:
        // 1.二分查找的优势?
        //      提高查找效率
        // 2.二分查找的前提条件?
        //      数据必须是有序的
        //      如果数据是乱的，先排序再用二分查找得到的索引没有实际意义，
        //      只能确定当前数字在数组中是否存在，因为排序之后数字的位置就可能发生变化了
        // 3.二分查找的过程
        //      min和max表示当前要查找的范围
        //      mid是在min和max中间的
        //      如果要查找的元素在mid的左边，缩小范围时，min不变，max等于mid减1
        //      如果要查找的元素在mid的右边，缩小范围时，max不变，min等于mid加1
        //
        // 需求:定义一个方法利用基本查找，查询某个元素是否存在
        // 数据如下:{7，23，79，81，103，127，131，147}

        int[] arr = {7, 23, 79, 81, 103, 127, 131, 147};
        int number = 7;
        System.out.println(isNumberExists(arr, number));
    }

    public static boolean isNumberExists(int[] arr, int number) {
        int min = 0;
        int max = arr.length - 1;

        while (min <= max) {
            int middle = (min + max) / 2;
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
