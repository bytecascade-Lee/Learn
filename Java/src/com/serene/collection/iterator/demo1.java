package com.serene.collection.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/11/29
 */
public class demo1 {
    public static void main(String[] args) {
        Collection<String> stringCollection = new ArrayList<>();
        stringCollection.add("a");
        stringCollection.add("b");
        stringCollection.add("c");
        stringCollection.add("d");

        Iterator<String> iterator = stringCollection.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "  ");
        }

        System.out.println();

        for (String s : stringCollection) {
            System.out.print(s + "  ");
        }

        System.out.println();

        Iterator<String> iterator1 = stringCollection.iterator();
        while (iterator1.hasNext()) {
            String string = iterator1.next();
//            错误行为：抛出ConcurrentModificationException
//            if ("b".equals(string)) {
//                stringCollection.remove(string);
//            }
            System.out.print(string + "  ");
        }
    }

}
