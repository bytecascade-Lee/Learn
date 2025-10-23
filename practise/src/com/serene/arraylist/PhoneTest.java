package com.serene.arraylist;

import java.util.ArrayList;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/10/23
 */
public class PhoneTest {
    public static void main(String[] args) {
        /*

        需求：
        定义Javabean类:Phone
        Phone属性：品牌，价格。
        main方法中定义一个集合，存入三个手机对象。
        分别为:小米，1000。苹果，8000。锤子2999。
        定义一个方法，将价格低于3000的手机信息返回。

         */

        ArrayList<Phone> phoneArrayList = new ArrayList<>();
        Phone p1 = new Phone("小米", 1000);
        Phone p2 = new Phone("苹果", 8000);
        Phone p3 = new Phone("锤子", 2999);

        phoneArrayList.add(p1);
        phoneArrayList.add(p2);
        phoneArrayList.add(p3);

        ArrayList<Phone> result = getPhonesWithPriceBelowX(phoneArrayList, 3000);
        for (Phone p : result) {
            System.out.println("品牌：" + p.getBrand() + "  价格：" + p.getPrice());
        }

    }

    public static ArrayList<Phone> getPhonesWithPriceBelowX(ArrayList<Phone> phoneArrayList, double price) {
        ArrayList<Phone> result = new ArrayList<>();
        for (int i = 0; i < phoneArrayList.size(); i++) {
            Phone p = phoneArrayList.get(i);
            if (p.getPrice() < price) {
                result.add(p);
            }
        }

        return result;
    }

}
