package com.serene.simpledateformate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/11/11
 */
public class test_1 {
    public static void main(String[] args) throws ParseException {
        /*
        public SimpleDateFormat()
            默认格式
        public SimpleDateFormat(String pattern)
            指定格式
        public final String format(Date date)
            格式化（日期对象->字符串）
        public Date parse(String source)
            解析（字符串->日期对象）
         */

        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss E");
        String string = simpleDateFormat.format(date);
        System.out.println(string);

        String string1 = "2025-6-7 08:00:00";
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date1 = simpleDateFormat1.parse(string1);
        System.out.println(date1);
    }

}
