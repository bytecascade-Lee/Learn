package com.serene.practice1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/11/11
 */
public class Practice1 {
    public static void main(String[] args) {
        /*
        集合中键盘录入一些1~100之间的整数，并添加到
        直到集合中所有数据和超过200为止。
         */
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (sum <= 200) {
            String string = sc.nextLine();
            int i = Integer.parseInt(string);
            integerArrayList.add(i);
            sum += i;
        }
        for (Integer integer : integerArrayList) {
            System.out.print(integer + "  ");
        }


    }

}
