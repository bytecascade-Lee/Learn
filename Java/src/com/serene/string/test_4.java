package com.serene.string;

/**
 * Description:
 *
 * @author Serene Lee
 * date 2025/10/18
 */
public class test_4 {
    public static void main(String[] args) {
       /* 
       定义一个方法，把int数组中的数据按照指定的格式拼接成一个字符串返回，
       调用该方法，并在控制台输出结果。
       例如:
       数组为 int[] arr =[1,2,3};
       执行方法后的输出结果为：[1，2，3]
    */


        int[] arr = {7};
        System.out.println(arrToString(arr));
        
    }
    public static String arrToString(int[] arr){
        if (arr == null){
            return "";
        }

        if (arr.length == 0){
            return "[]";
        }

        String result = "[" + arr[0];
        for (int i = 1; i < arr.length; i++) {
            result += ", " + arr[i];
        }

        result += "]";
        return result;
      
    }
}
