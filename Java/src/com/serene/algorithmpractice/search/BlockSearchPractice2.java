package com.serene.algorithmpractice.search;

import java.util.ArrayList;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/11/16
 */
public class BlockSearchPractice2 {
    public static void main(String[] args) {
        int[] arr = {16, 5, 9, 9, 21, 18,
                32, 45, 37, 45, 45, 34,
                61, 61, 61, 61, 73, 61};
        int number = 61;

        Block b1 = new Block(21, 0, 5);
        Block b2 = new Block(45, 6, 11);
        Block b3 = new Block(73, 12, 17);

        Block[] blocks = {b1, b2, b3};

        System.out.println(search(blocks, arr, number));
    }

    public static ArrayList<Integer> search(Block[] blocks, int[] arr, int number) {
        int index = findIndexOfBlock(blocks, number);
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        if (index != -1) {
            for (int i = blocks[index].startIndex; i <= blocks[index].endIndex; i++) {
                if (arr[i] == number) {
                    integerArrayList.add(i);
                }
            }
        }
        return integerArrayList;
    }

    public static int findIndexOfBlock(Block[] blocks, int number) {
        for (int i = 0; i < blocks.length; i++) {
            if (number <= blocks[i].max) {
                return i;
            }
        }

        return -1;
    }

}
