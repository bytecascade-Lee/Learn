package com.serene.datedemo;

import java.util.Date;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/11/10
 */
public class test_2 {
    public static void main(String[] args) {
        /*
        需求1:打印时间原点开始一年之后的时间
        需求2:定义任意两个Date对象，比较一下哪个时间在前，哪个时间在后
         */


        Date date1 = new Date();
        long time = date1.getTime();
        time += 1000L * 60 * 60 * 24 * 365;
        date1.setTime(time);
        System.out.println(date1);

        Date date2 = new Date();
        Date date3 = new Date();
        System.out.println(date2);
        System.out.println(date3);
        System.out.println(date2.getTime() < date3.getTime());
    }
}
