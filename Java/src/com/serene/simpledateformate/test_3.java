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
public class test_3 {
    public static void main(String[] args) throws ParseException {
        /*
        秒杀活动
        肯打鸡限时秒杀
        1元秒杀     葡式蛋挞(1只)兑换券
        秒杀开始时间:2023年11月11日00:00:00
        秒杀结束时间:2023年11月11日00:10:00
        需求：
            小贾下单并付款的时间为:2023年11月11日00:01:00
            小皮下单并付款的时间为:2023年11月11日00:11:00
        用代码说明这两位同学有没有参加上秒杀活动?
         */

        String endTime = "2023年11月11日00:10:00";
        String startTime = "2023年11月11日00:00:00";
        String xiaojia = "2023年11月11日00:01:00";
        String xiaopi = "2023年11月11日00:11:00";
        // 设置解析格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日HH:mm:ss");
        Date startTime1 = sdf.parse(startTime);
        Date endTime1 = sdf.parse(endTime);
        Date xiaojia1 = sdf.parse(xiaojia);
        Date xiaopi1 = sdf.parse(xiaopi);
        if (endTime1.getTime() >= xiaojia1.getTime() && startTime1.getTime() <= xiaojia1.getTime()) {
            System.out.println("小贾参加秒杀活动了。");
        } else {
            System.out.println("小贾未参加秒杀活动。");
        }

        if (endTime1.getTime() >= xiaopi1.getTime() && startTime1.getTime() <= xiaopi1.getTime()) {
            System.out.println("小皮参加秒杀活动了。");
        } else {
            System.out.println("小皮未参加秒杀活动。");
        }

    }

}
