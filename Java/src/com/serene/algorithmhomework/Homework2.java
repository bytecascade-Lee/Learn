package com.serene.algorithmhomework;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/11/23
 */
public class Homework2 {
    public static void main(String[] args) {
        /*
    有一个很有名的数学逻辑题，叫做不死神兔，题目是：
    有一对兔子，从出生后第三个月起每一个月都省一堆兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子不死
    那么第十二个月的兔子对数是多少？
     */

        // 分析：
        // 1月：1对
        // 2月：1对
        // 3月：1 + 1 = 2，第一对开始生
        // 4月：2 + 1 = 3，第一对再次生
        // 5月：3 + 1 + 1 = 5

        System.out.println("第十二月的兔子对数是：" + getTheRabbitCountOfTheGivenMonth(12));

    }

    public static int getTheRabbitCountOfTheGivenMonth(int month){
        if (month < 1) {
            return -1;
        }
        if (month == 1 || month == 2) {
            return 1;
        }

        return getTheRabbitCountOfTheGivenMonth(month - 1) + getTheRabbitCountOfTheGivenMonth(month - 2);
    }


}
