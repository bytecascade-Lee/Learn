package com.serene.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/14
 */
public class demo5 {
    public static void main(String[] args) {
        /*
        list(Collector collector)        收集流中的数据，放到集合中(List set Map)
         */
        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, "张无忌-男-15", "周芷若-女-14",
                "赵敏-女-13", "张强-男-20", "张三丰-男-100", "张翠山-男-40",
                "张良-男-35", "王二麻子-男-37", "谢广坤-男-41");

        List<String> list = arrayList.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toList());
        System.out.println(list);

        /*Map<String, Integer> map = arrayList.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toMap(new Function<String, String>() {
                    @Override
                    public String apply(String s) {
                        return s.split("-")[0];
                    }
                }, new Function<String, Integer>() {
                    @Override
                    public Integer apply(String s) {
                        return Integer.parseInt(s.split("-")[2]);
                    }
                }));*/

        // 注意：收集到Map集合里面的数据，键不能重复
        Map<String, Integer> map = arrayList
                .stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toMap(
                        s -> s.split("-")[0],
                        s -> Integer.parseInt(s.split("-")[2])
                ));
        System.out.println(map);

    }

}
