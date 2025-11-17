package com.serene.algorithmpractice.search;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/11/16
 */
public class BlockSearchPractice1 {
    public static void main(String[] args) {
        int[] arr = {16, 5, 9, 9, 21, 18,
                32, 23, 37, 26, 45, 34,
                50, 48, 61, 52, 73, 66};
        int number = 45;

        Block b1 = new Block(21, 0, 5);
        Block b2 = new Block(45, 6, 11);
        Block b3 = new Block(73, 12, 17);

        Block[] blocks = {b1, b2, b3};

        System.out.println(search(blocks, arr, number));
    }

    public static int search(Block[] blocks, int[] arr, int number) {
        int index = findIndexOfBlock(blocks, number);
        if (index != -1) {
            for (int i = blocks[index].startIndex; i <= blocks[index].endIndex; i++) {
                if (arr[i] == number) {
                    return i;
                }
            }
        }

        return -1;
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

class Block {
    int max;
    int startIndex;
    int endIndex;

    public Block() {
    }

    public Block(int max, int startIndex, int endIndex) {
        this.max = max;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

}