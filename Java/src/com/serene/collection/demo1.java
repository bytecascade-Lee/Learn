package com.serene.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/11/23
 */
public class demo1 {
    public static void main(String[] args) {
        /*
        方法名称                                说明
        public boolean add(E e)                 把给定的对象添加到当前集命中
        public void clear()                     清空集合中所有的元素
        public boolean remove(E e)              把给定的对象在当前集合中删除
        public boolean contains(object obj)     判断当前集合中是否包含给定的对象
        public boolean isEmpty()                判断当前集合是否为空返回集合中元素的个数/集合的长度
        public int size()                       返回集合中元素的个数/集合的长度

         */

        // Collection是一个接口，不能直接创建它的对象
        // 练习时需要用到它的一个实现类：ArrayList
        // 使用多态的方式创建对象。

        Collection<String> collection = new ArrayList<>();

        System.out.println("----------add----------");
        collection.add("aaa");
        collection.add("bbb");
        collection.add("ccc");

        System.out.println("----------clear----------");
        collection.clear();
        System.out.println(collection);

        System.out.println("----------remove----------");
        collection.add("aaa");
        collection.add("bbb");
        collection.add("ccc");
        collection.remove("aaa");
        System.out.println(collection);
        System.out.println(collection.remove("ddd"));
        System.out.println(collection);

        // 细节:底层是依赖equals方法进行判断是否存在的。
        // 所以，如果集合中存储的是自定义对象，也想通过contains方法来判断是否包含，
        // 那么在javabean类中，一定要重写equals方法。
        System.out.println("----------contains----------");
        System.out.println(collection.contains("ccc"));

        System.out.println("----------isEmpty----------");
        System.out.println(collection.isEmpty());
        collection.clear();
        System.out.println(collection.isEmpty());

        System.out.println("----------size----------");
        collection.add("aaa");
        collection.add("bbb");
        collection.add("ccc");
        System.out.println(collection.size());

    }

}
