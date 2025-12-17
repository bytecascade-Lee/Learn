package com.serene.exception;

import java.util.Random;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/17
 */
public class Practice1 {
    public static void main(String[] args) {
        /*
        throws:写在方法定义处，表示声明一个异常。告诉调用者，使用本方法可能会有哪些异常。
        throw :写在方法内，结束方法。手动抛出异常对象，交给调用者。方法中下面的代码不再执行了。

        需求:
        定义一个方法求数组的最大值
         */

        Random r = new Random();
        // n = 1 / 2 / 3
        int n = r.nextInt(3);
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = r.nextInt(100);
        }

        int choice = r.nextInt(4);

        arr = choice != 3 ? arr : null;

        int max;
        try {
            max = getMax(arr);
            System.out.println(max);
        } catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("看看有问题吗？");
        }

    }

    public static int getMax(int[] arr) throws NullPointerException, ArrayIndexOutOfBoundsException {
        if (arr == null) {
            throw new NullPointerException();
        }
        if (arr.length == 0) {
            throw new ArrayIndexOutOfBoundsException();
        }

        int res = arr[0];
        for (int i : arr) {
            if (i > res) {
                res = i;
            }
        }

        return res;
    }

}
