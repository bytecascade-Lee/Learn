package main.com.serene.util;

import java.util.Random;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/11/3
 */
public class GameUtil {
    private GameUtil() {
    }

    public static int[][] generateArr(int x) {
        int bound = x * x;
        int[] arr = new int[bound];

        for (int i = 0; i < bound; i++) {
            arr[i] = bound - 1 - i;
        }

        Random r = new Random();
        for (int i = 0; i < bound - 1; i++) {
            int index = r.nextInt(bound - 1);
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }

        int[][] result = new int[x][x];
        for (int i = 0; i < bound; i++) {
            result[i / 4][i % 4] = arr[i];
        }
        return result;
    }
}
