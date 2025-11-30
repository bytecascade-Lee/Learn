package com.serene.collection.lst;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/11/30
 */
public class demo1 {
    public static void main(String[] args) {
        /*
        方法名称                            说明
        void add(int index,E element)       在此集合中的指定位置插入指定的元素
        E remove(int index)                 删除指定索引处的元素，返回被删除的元素
        E set(int index,E element)          修改指定索引处的元素，返回被修改的元素
        E get(int index)                    返回指定索引处的元素

         */

        List<String> stringList = new ArrayList<>();

        // 1.
        stringList.add("aaa");
        stringList.add("bbb");
        stringList.add("ccc");
        stringList.add(0, "000");


        // 2.
        // 注意：remove有两种实现方法
        // remove(int index)；
        // remove(Object o);
        // 在调用方法时，如果出现了方法的重载，
        // 会默认调用形参与传入实参数据类型相同的方法
        stringList.remove(1);

        // 3.
        System.out.println(stringList.set(0, "111"));

        // 4.
        int i = 0;
        int j = 2;
        System.out.println((i + 1) + ": " + stringList.get(i));
        System.out.println((j + 1) + ": " + stringList.get(j));


    }
}
