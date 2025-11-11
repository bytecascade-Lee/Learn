package com.serene.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/11/11
 */
public class test_1 {
    public static void main(String[] args) {
        /*
        方法名                                         说明
        public static Calendar getInstance()           获取当前时间的日历对象
        public final Date getTime()                    获取日期对象
        public final setTime(Date date)                给日历设置日期对象
        public long getTimeInMillis()                  拿到时间毫秒值
        public void setTimeInMillis(long millis)       给日历设置时间毫秒值
        public int get(int field)                      职日历中的某个字段信息
        public void set(int field,int value)           修改日历的某个字段信息
        public void add(int field,int amount)          为某个字段增加/减少指定的值


         (i+5)%7+1
         */


        //1.获取日历对象
        //细:1:Calendar是一个抽象类，不能直接new，而是通过一个静态方法获取到子类对象//底罄原理:
        //会根据系统的不同时区来获取不同的日历对象,默认表示当前时间。//把会把时间中的纪元，年，月，日，时，分，秒，星期，等等的都放到一个数组当中//0 :纪元
        //1:年
        //2:月 / 12:
        //3:一年中的第几周:
        //4:一个月中的第几周
        //5:一个月中的第几天(日期)
        //....
        //细节2:
        //月份:范围8~11 如果获取出来的是8.那么实际上是1月。
        //星期:在老外的眼里，星期日是一周中的第一天
        //1(星期日)    2(星期一)  3(星期二)  4(星期三)  5(星期四)  6(星期五)  7(星期六)

        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        System.out.println(sdf.format(date));

        calendar.set(Calendar.YEAR, 2007);
        calendar.set(Calendar.MONTH, 11);
        calendar.set(Calendar.DAY_OF_MONTH, 18);

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        String week = getWeek(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(year + ", " + month + ", " + day + ", " + week);



    }

    public static String getWeek(int index) {
        String[] arr = {"星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
        return arr[index - 1];
    }

}
