package com.serene.stream;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/14
 */
public class Practice2 {
    public static void main(String[] args) {
        /*
        数据操作
        练习:
        创建一个ArrayList集合，并添加以下字符串，字符串中前面是姓名，后面是年龄
        "Zhang San, 23"
        "Li Si, 24"
        "Wang Wu, 25"
        保留年龄大于等于24岁的人，并将结果收集到Map集合中，姓名为键，年龄为值
         */

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Zhang San, 23");
        arrayList.add("Li Si, 24");
        arrayList.add("Wang Wu, 25");

        Map<String, Integer> map = arrayList.stream()
                .filter(s -> Integer.parseInt(s.split(", ")[1]) >= 24)
                .collect(Collectors.toMap(
                        s -> s.split(", ")[0],
                        s -> Integer.parseInt(s.split(", ")[1])

                ));
        System.out.println(map);
    }

}
