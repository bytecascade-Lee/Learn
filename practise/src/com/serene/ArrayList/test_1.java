package com.serene.ArrayList;

import java.util.ArrayList;

/**
 * Description:
 *
 * @author Serene Lee
 * date 2025/10/20
 */
public class test_1 {
    public static void main(String[] args) {

        // 创建ArrayList集合对象，
        // 泛型：用于约束容器内的元素的类型
        // 在ArrayList初始化时，在<>内标注元素的类型。
        // 类型必须是引用数据类型，基本数据类型需要进行包装。
        ArrayList<String> list = new ArrayList<>();

        // 打印ArrayList数组时，Java会自动打印里面的数据，而不是地址值。
        System.out.println(list);
    }

}
