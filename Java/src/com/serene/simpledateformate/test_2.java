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
public class test_2 {
    public static void main(String[] args) throws ParseException {
        /*
        假设，你初恋的出生年月日为：2007-12-18
        请用字符串表示这个数据，并将其转换为：2007年12月18日
         */

        String s1 = "2007-12-18";
        // 设定解析格式
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        // 解析时间字符串，返回Date类型时间
        Date d1 = sdf1.parse(s1);
        // 设定输出格式
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日");
        // 按照格式，格式化Date类型时间
        String s2 = sdf2.format(d1);
        System.out.println(s2);
    }

}
