import main.com.serene.ui.GameJFrame;
import main.com.serene.util.GameUtil;
import main.com.serene.data.GameData;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/11/2
 */
public class App {
    public static void main(String[] args) {
        int bound = 4;
        int[][] arr = GameUtil.generateArr(bound);
        GameData gameData = new GameData(bound, arr);
        new GameJFrame(gameData);
    }

}
