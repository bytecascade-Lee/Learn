package com.serene.staticdemo.arrayutil;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/10/26
 */
public class ArrayUtil {
    /*
    提供一个工具类方法printArr，用于返回整数数组的内容。
    返回的字符串格式如：[10, 20,50,34,100]（只考虑整数数组，且只考虑一维数组）
    提供这样一个工具方法getAverage，用于返回平均分。（只考虑浮点型数组，且只考虑一维数组）
    定义一个测试类，调用该工具类的工具方法，并返回结果。
     */
    private ArrayUtil() {
    }

    public static String printArray(int[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i != arr.length - 1){
                sb.append(", ");
            }
        }
        sb.append("]");

        return sb.toString();
    }

    public static double getAverage(double[] arr){
        double sum = 0;
        for (double v : arr) {
            sum += v;
        }

        return sum / arr.length;
    }


}
