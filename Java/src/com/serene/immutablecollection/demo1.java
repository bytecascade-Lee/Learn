package com.serene.immutablecollection;

import java.util.Iterator;
import java.util.List;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/6
 */
public class demo1 {
    public static void main(String[] args) {
        /*
        创建不可变List集合

         */

        List<String> list = List.of("张三", "李四", "王五", "赵六");

        System.out.println("---------------");
        System.out.println(list);

        System.out.println("---------------");
        for (String string : list) {
            System.out.println(string);
        }

        System.out.println("---------------");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("---------------");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("---------------");
        list.forEach(o -> System.out.println(o));

        // 不可添加
        // UnsupportedOperationException
        // list.add("aaa");
        // 不得删除
        // UnsupportedOperationException
        // list.remove("张三");
        // 不可修改
        // UnsupportedOperationException
        // list.set(1, "aaa");
    }

}
