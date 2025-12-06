package com.serene.map;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/5
 */
public class Practice {
    public static void main(String[] args) {
        /*
        Map集合案例-省和市
        需求
        定义一个Map集合，键用表示省份名称province，
        值表示市city，但是市会有多个

        添加完毕后，遍历结果格式如下:
        江苏省 = [南京市，扬州市，苏州市，无锡市，常州市]
        湖北省 = [武汉市，孝感市，十堰市，宜昌市，鄂州市]
        河北省 = [石家庄市，唐山市，邢台市，保定市，张家口市]
         */

        HashMap<String, ArrayList<String>> 省市 = new HashMap<>();

        ArrayList<String> strings1 = new ArrayList<>();

        strings1.add("南京市");
        strings1.add("扬州市");
        strings1.add("苏州市");
        strings1.add("无锡市");
        strings1.add("常州市");
        省市.put("江苏省", strings1);

        ArrayList<String> strings2 = new ArrayList<>();

        strings2.add("武汉市");
        strings2.add("孝感市");
        strings2.add("十堰市");
        strings2.add("宜昌市");
        strings2.add("鄂州市");
        省市.put("湖北省", strings2);

        ArrayList<String> strings3 = new ArrayList<>();

        strings3.add("石家庄市");
        strings3.add("唐山市");
        strings3.add("邢台市");
        strings3.add("保定市");
        strings3.add("张家口市");
        省市.put("河北省", strings3);

        省市.forEach((o1, o2) ->
                System.out.println(o1 + " = " + o2));
    }

}
