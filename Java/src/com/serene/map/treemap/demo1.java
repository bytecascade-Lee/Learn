package com.serene.map.treemap;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/4
 */
public class demo1 {
    public static void main(String[] args) {
        /*
        TreeMap
        TreeMap跟TreeSet底层原理一样，都是红黑树结构的。
        由键决定特性:
            不重复、无索引、可排序
        可排序:
            对键进行排序
        注意:
            默认按照键的从小到大进行排序，也可以自己规定键的排序规则

        代码书写两种排序规则：
            实现Comparable接口，指定比较规则。
            创建集合时传递Comparator比较器对象，指定比较规则
        两种方式都写的话，以第二种为准
         */


        // 需求1:
        // 键:整数表示id
        // 值:字符串表示商品名称
        // 要求:按照id的升序排列、按照id的降序排列

        TreeMap<Integer, String> goodsUp = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // o1：当前要添加的元素
                // o2：已经存在于红黑树中的元素
                return o1 - o2;
            }
        });
        TreeMap<Integer, String> goodsDown = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // o1：当前要添加的元素
                // o2：已经存在于红黑树中的元素
                return o2 - o1;
            }
        });
        goodsUp.put(10001, "苹果");
        goodsUp.put(10002, "梨");
        goodsUp.put(10003, "香蕉");
        goodsUp.put(10004, "猕猴桃");
        System.out.println(goodsUp);

        goodsDown.put(10001, "苹果");
        goodsDown.put(10002, "梨");
        goodsDown.put(10003, "香蕉");
        goodsDown.put(10004, "猕猴桃");
        System.out.println(goodsDown);
    }

}
