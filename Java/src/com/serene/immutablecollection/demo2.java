package com.serene.immutablecollection;

import java.util.Set;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/6
 */
public class demo2 {
    public static void main(String[] args) {
        /*
        创建不可变Set集合
        */
        Set<String> set = Set.of("张三", "李四", "王五");

        // 不能有重复值
        // Set<String> set = Set.of("张三", "张三", "李四", "王五");
        System.out.println(set);

    }

}
