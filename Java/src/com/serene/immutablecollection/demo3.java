package com.serene.immutablecollection;

import java.util.Map;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/7
 */
public class demo3 {
    public static void main(String[] args) {
        /*
        创建不可变Map双列集合
         */

        /*
        "张三","南京","李四","北京","王五","上海",
        "赵六","广州","孙七","深圳","周八","杭州",
        "吴九","宁波","郑十","苏州","刘一","无锡",
        "陈二","嘉兴"
         */

        Map<String, String> map = Map.of("张三", "南京", "李四", "北京", "王五", "上海",
                "赵六", "广州", "孙七", "深圳", "周八", "杭州",
                "吴九", "宁波", "郑十", "苏州", "刘一", "无锡",
                "陈二", "嘉兴");
        map.forEach((key, value) ->
                System.out.println(key + " = " + value));

    }

}
