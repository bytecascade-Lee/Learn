package com.serene.algorithm.search;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/11/15
 */
public class BlockSearch {
    public static void main(String[] args) {
        /*
        分块查找
        核心思想:
            块内无序，块间有序
        实现步骤:
            1.创建数组blockArr存放每一个块对象的信息
            2.先查找b1ockArr确定要查找的数据属于哪一块
            3.再单独遍历这一块数据即可

         */
        int[] arr = {16, 5, 9, 12, 21, 18,
                32, 23, 37, 26, 45, 34,
                50, 48, 61, 52, 73, 66};
        int number = 45;

        Block b1 = new Block(21, 0, 5);
        Block b2 = new Block(45, 6, 11);
        Block b3 = new Block(73, 12, 17);

        Block[] blocks = {b1, b2, b3};

        System.out.println(isNumberExists(blocks, arr, number));
    }

    public static boolean isNumberExists(Block[] blocks, int[] arr, int number) {
        int index = findIndexOfBlock(blocks, number);
        if (index != -1) {
            for (int i = blocks[index].startIndex; i <= blocks[index].endIndex; i++) {
                if (arr[i] == number) {
                    return true;
                }
            }
        }
        return false;
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
