package com.serene.algorithmhomework;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/11/23
 */
public class Homework3 {
    public static void main(String[] args) {
        /*
        有一堆桃子，猴子每月都吃其中的一半，并且多吃了一个，第十月还没吃的时候，发现只剩下了一个桃子，
        请问，最初有多少桃子？
         */

        // 分析：
        // 每个月吃的数量是上个月剩下的一半再加一
        System.out.println(getThePeachCountOfTheGivenMonth(1));
    }

    public static int getThePeachCountOfTheGivenMonth(int month) {
        if (month <= 0) {
            return -1;
        }
        if (month == 10) {
            return 1;
        }

        return (getThePeachCountOfTheGivenMonth(month + 1) + 1) * 2;
    }

}
