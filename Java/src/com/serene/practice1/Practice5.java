package com.serene.practice1;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/11/12
 */
public class Practice5 {
    public static void main(String[] args) {
        /*
        判断任意的一个年份是闰年还是平年要求:用JDK7和JDK8两种方式判断
        提示:
        二月有29天是闰年
        一年有366天是闰年
         */


        Scanner sc = new Scanner(System.in);
        String temp = sc.nextLine();
        int year = Integer.parseInt(temp);

        // JDK7  --1：
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + "是闰年。");
        } else {
            System.out.println(year + "是平年。");
        }

        // JDK7  --2：
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, 1);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        long time1 = calendar.getTimeInMillis();

        calendar.set(Calendar.MONTH, 2);
        long time2 = calendar.getTimeInMillis();

        long delta = time2 - time1;
        long result = delta / 1000 / 60 / 60 / 24;
        if (result == 29L) {
            System.out.println(year + "是闰年。");
        } else if (result == 28L) {
            System.out.println(year + "是平年。");
        }

        // JDK7  --3：
        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(year, Calendar.MARCH, 1);
        calendar1.add(Calendar.DAY_OF_MONTH, -1);
        if (calendar1.get(Calendar.DAY_OF_MONTH) == 29) {
            System.out.println(year + "是闰年。");
        } else if (calendar1.get(Calendar.DAY_OF_MONTH) == 28) {
            System.out.println(year + "是平年。");
        }

        // JDK8  --1：
        LocalDate localDate = LocalDate.of(year, 3, 1);
        if (localDate.minusDays(1).getDayOfMonth() == 29) {
            System.out.println(year + "是闰年。");
        } else if (localDate.minusDays(1).getDayOfMonth() == 28) {
            System.out.println(year + "是平年。");
        }

        // JDK8  --2：
        if (localDate.isLeapYear()) {
            System.out.println(year + "是闰年。");
        } else {
            System.out.println(year + "是平年。");
        }


    }

}
