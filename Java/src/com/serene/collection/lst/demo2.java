package com.serene.collection.lst;

import java.util.*;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/11/30
 */
public class demo2 {
    public static void main(String[] args) {
        List<Character> characterList = new ArrayList<>();
        characterList.add('H');
        characterList.add('e');
        characterList.add('l');
        characterList.add('l');
        characterList.add('o');
        characterList.add(',');
        characterList.add('w');
        characterList.add('o');
        characterList.add('r');
        characterList.add('l');
        characterList.add('d');
        characterList.add('!');


        // 普通for循环
        for (int i = 0; i < characterList.size(); i++) {
            System.out.print(characterList.get(i));
        }
        System.out.println();

        // 增强for循环
        for (Character c : characterList) {
            System.out.print(c);
        }
        System.out.println();

        // 迭代器
        Iterator<Character> characterIterator = characterList.iterator();
        while (characterIterator.hasNext()) {
            System.out.print(characterIterator.next());
        }
        System.out.println();

        // 列表迭代器
        ListIterator listIterator = characterList.listIterator();
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next());
        }
        System.out.println();

        // Lambda表达式
        characterList.forEach(c -> System.out.print(c));
        System.out.println();
    }

}
