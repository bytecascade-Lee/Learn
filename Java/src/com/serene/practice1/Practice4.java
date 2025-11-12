package com.serene.practice1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/11/12
 */
public class Practice4 {
    public static void main(String[] args) throws ParseException {
        /*
        请使用代码实现计算你活了多少天，用JDK7和JDK8两种方式完成
        */
        // JDK7：
        String s = "2007-12-18";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthday1 = sdf.parse(s);
        Date today1 = new Date();
        long ms1 = today1.getTime() - birthday1.getTime();
        int day1 = (int) (ms1 / 1000 / 60 / 60 / 24);
        System.out.println(day1);

        Calendar birthday2 = Calendar.getInstance();
        Calendar today2 = Calendar.getInstance();
        birthday2.set(Calendar.YEAR, 2007);
        birthday2.set(Calendar.MONTH, 11);
        birthday2.set(Calendar.DAY_OF_MONTH, 18);

        long ms2 = today2.getTimeInMillis() - birthday2.getTimeInMillis();
        int day2 = (int) (ms1 / 1000 / 60 / 60 / 24);
        System.out.println(day2);

        // JDK8：
        LocalDate birthday3 = LocalDate.of(2007, 12, 18);
        LocalDate today3 = LocalDate.now();
        long day3 = ChronoUnit.DAYS.between(birthday3, today3);
        System.out.println(day3);




    }


}
