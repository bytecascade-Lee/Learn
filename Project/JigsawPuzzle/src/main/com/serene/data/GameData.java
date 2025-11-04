package main.com.serene.data;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/11/3
 */
public class GameData {

    private int bound;
    private int[][] movedArray;

    // 构造方法初始化数据
    public GameData(int bound, int[][] array) {
        this.bound = bound;
        this.movedArray = array;
    }

    public int getBound() {
        return bound;
    }

    public void setBound(int bound) {
        if (bound >= 1) {
            this.bound = bound;
        }
    }

    public int[][] getMovedArray() {
        return movedArray;
    }

    public void setMovedArray(int[][] newArray) {
        this.movedArray = newArray;

    }
}
