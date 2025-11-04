package main.com.serene.action;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/11/3
 */
public class MovePicture {
    private static int[] getZeroLocation(int[][] foundArray) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < foundArray.length; i++) {
            for (int j = 0; j < foundArray[i].length; j++) {
                if (foundArray[i][j] == 0) {
                    x = i;
                    y = j;
                    break;
                }
            }
        }
        return new int[]{x, y};
    }

    public static void show(int[][] shownArr){
        for (int[] ints : shownArr) {
            for (int i : ints) {
                System.out.print(i + "  ");
            }
            System.out.println();
        }
    }

    public static int[][] downPicture(int[][] movedArray) {
        int[] location = getZeroLocation(movedArray);
        if (location[0] == movedArray.length - 1) {
            return new int[][]{};
        }
        System.out.println("向上移动");
        movedArray[location[0]][location[1]] = movedArray[location[0] + 1][location[1]];
        movedArray[location[0] + 1][location[1]] = 0;

        show(movedArray);
        return movedArray;
    }

    public static int[][] upPicture(int[][] movedArray) {
        int[] location = getZeroLocation(movedArray);
        if (location[0] == 0) {
            return new int[][]{};
        }
        System.out.println("向下移动");
        movedArray[location[0]][location[1]] = movedArray[location[0] - 1][location[1]];
        movedArray[location[0] - 1][location[1]] = 0;

        show(movedArray);
        return movedArray;
    }

    public static int[][] rightPicture(int[][] movedArray) {
        int[] location = getZeroLocation(movedArray);
        if (location[1] == movedArray.length - 1) {
            return new int[][]{};
        }
        System.out.println("向左移动");
        movedArray[location[0]][location[1]] = movedArray[location[0]][location[1] + 1];
        movedArray[location[0]][location[1] + 1] = 0;

        show(movedArray);
        return movedArray;
    }

    public static int[][] leftPicture(int[][] movedArray) {
        int[] location = getZeroLocation(movedArray);
        if (location[1] == 0) {
            return new int[][]{};
        }
        System.out.println("向右移动");
        movedArray[location[0]][location[1]] = movedArray[location[0]][location[1] - 1];
        movedArray[location[0]][location[1] - 1] = 0;

        show(movedArray);
        return movedArray;
    }

}
