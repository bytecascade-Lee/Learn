package com.serene.basicknowledge;


public class test_09 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6};
        int[] result = copyOFrange(arr, 2, 7);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }
    }
    /**
     * 复制数组指定范围的元素（左闭右开：[begin, end)）
     * @param given 原数组
     * @param begin 开始索引（包含）
     * @param end 结束索引（不包含）
     * @return 复制后的新数组
     */
    public static int[] copyOFrange(int[] given, int begin, int end) {
        int len = given.length;
        if (end > len || begin > end){
            System.out.println("索引访问失败");
            System.exit(-1);
        }
        int [] result = new int[end - begin];
        for (int i = begin; i < end; i++) {
            result[i - begin] = given[i];
        }
        return result;
    }
}
