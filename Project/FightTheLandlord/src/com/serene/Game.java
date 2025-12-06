package com.serene;

import java.util.*;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/6
 */
public class Game {

    // 创建静态变量牌盒，在静态代码块里面初始化一副牌
    static ArrayList<String> pokerList = new ArrayList<>();
    static HashMap<String, Integer> weightForColor = new HashMap<>();
    static HashMap<String, Integer> weightForNumber = new HashMap<>();
//    static HashMap<String, Integer> weightForJoker = new HashMap<>();

    // 静态代码块
    // 随类的加载而加载，且只加载一次
    static {
        // 准备牌
        // 牌色顺序为：黑桃、红桃、方片、梅花
        // "♠", "♥", "♦", "♣"
        // "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "k", "A", "2"
        // "Black", "Red"
        String[] color = {"♠", "♥", "♦", "♣"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "k", "A", "2"};
        String[] joker = {"Black", "Red"};
        for (String c : color) {
            for (String n : number) {
                pokerList.add(c + n);
            }
        }
        Collections.addAll(pokerList, joker);

        // 给花色分配权重
        for (int i = 0; i < color.length ; i++) {
            // "♠", "♥", "♦", "♣"
            //  3     2    1    0
            weightForColor.put(color[i], 3 - i);
        }

        // 给数字分配权重
        for (int i = 0; i < number.length ; i++) {
            // "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "k", "A", "2"
            //  0    1    2    3    4    5    6    7     8    9    10  11   12
            weightForNumber.put(number[i], i);
        }

        /*
         此处没有必要给大小王分配权重
         因为，大小王较为特殊，只有红、黑两种花色
         与其他52张牌的格式不一样，
         用权重参与后续排序，会带来很多的麻烦
                // 给大小王分配权重
                for (int i = 0; i < joker.length; i++) {
                    // "Black", "Red"
                    //   53      54
                    weightForJoker.put(joker[i], 53 + i);
                }
        */

    }

    public Game() {

        // 洗牌
        Collections.shuffle(pokerList);

        // 发牌
        ArrayList<String> pokerForLord = new ArrayList<>();
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        // 遍历牌盒得到每一张牌
        for (int i = 0; i < 3; i++) {
            pokerForLord.add(pokerList.get(i));
        }
        for (int i = 3; i < pokerList.size(); i++) {
            // 下标为3时，实际上是第4张牌，需要发给玩家1，
            // 所以余数为0时发给1，
            // 余数为1时发给2，
            // 余数为2时发给3
            switch (i % 3) {
                case 0: {
                    player1.add(pokerList.get(i));
                    break;
                }
                case 1: {
                    player2.add(pokerList.get(i));
                    break;
                }
                case 2: {
                    player3.add(pokerList.get(i));
                    break;
                }

            }
        }

        // 看牌
        lookPoker("a", player1);
        lookPoker("b", player2);
        lookPoker("c", player3);
        lookPoker("d", pokerForLord);

        // 洗牌
        sort(player1);
        sort(player2);
        sort(player3);
        sort(pokerForLord);
        lookPoker("a", player1);
        lookPoker("b", player2);
        lookPoker("c", player3);
        lookPoker("d", pokerForLord);

    }

    public static void lookPoker(String name, ArrayList<String> pokers) {
        System.out.print(name + ": ");
        for (String poker : pokers) {
            System.out.print(poker + " ");
        }
        System.out.println();

    }

    // 这里我使用的是ArrayList集合类，所以需要自己写排序算法
    // 如果使用TreeSet集合类，是可以自动排序的，（这种是使用序号排序，方法一）
    // 但也要更改前面的部分代码，因此此处没有使用（使用了计算权重的方法二）
    // 方法一在bilibili黑马程序员阿玮讲解的Java的第228集（下第28集）
    public static void sort(ArrayList<String> pokers) {
        // 这两个布尔类型变量是专门给大小王排序用的
        boolean blackFlag = pokers.remove("Black");
        boolean redFlag = pokers.remove("Red");

        pokers.sort((o1, o2) -> {
            // o1是待排序的
            // o2是已排序的

            // 如果两张牌的数字不相同
            return !weightForNumber.get(o1.substring(1)).equals
                    (weightForNumber.get(o2.substring(1))) ?
                    // 排大小，小的在大的前面
                    weightForNumber.get(o1.substring(1)) -
                            weightForNumber.get(o2.substring(1)) :
                    // 如果两张牌的数字相同
                    // 排花色，大的在小的前面
                    weightForColor.get(o2.substring(0, 1)) -
                            weightForColor.get(o1.substring(0, 1));

        });

        // 如果前面remove时返回值为true
        // 则在集合的末尾添加牌
        // 且添加牌的顺序还是按照权重来的
        // 如果前面remove时返回值为false
        // 则不添加
        if (blackFlag) {
            pokers.add("Black");
        }
        if (redFlag) {
            pokers.add("Red");
        }

    }

}
