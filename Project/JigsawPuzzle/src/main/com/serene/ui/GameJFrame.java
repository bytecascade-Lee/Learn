package main.com.serene.ui;

import main.com.serene.action.MovePicture;
import main.com.serene.data.GameData;
import javax.swing.*;
import javax.swing.border.BevelBorder;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/11/2
 */
public class GameJFrame extends JFrame implements KeyListener {

    private GameData gameData;
    public GameJFrame(GameData gameData) {

        this.gameData = gameData;
        int bound = gameData.getBound();
        int[][] movedArray = gameData.getMovedArray();
        initFrame();
        initMenuBar();
        initImage(bound, movedArray);

        // 设置窗口可见
        this.setVisible(true);
    }


    private void initImage(int x, int[][] arr) {
        this.getContentPane().removeAll();

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                String pictureName = ".\\image\\animal\\animal1\\" + arr[i][j] + ".jpg";
                ImageIcon imageIcon = new ImageIcon(pictureName);
                JLabel jLabel = new JLabel(imageIcon);
                jLabel.setBounds(j * 105 + 83, i * 105 + 134, 105, 105);
                jLabel.setBorder(new BevelBorder(BevelBorder.LOWERED));
                this.getContentPane().add(jLabel);
            }
        }

        String backgroundName = ".\\image\\background.png";
        ImageIcon background = new ImageIcon(backgroundName);
        JLabel jLabel = new JLabel(background);
        jLabel.setBounds(40, 40, 508, 560);
        this.getContentPane().add(jLabel);

        this.getContentPane().repaint();
    }

    private void initMenuBar() {
        // 添加菜单
        JMenuBar jMenuBar = new JMenuBar();

        JMenu functionMenu = new JMenu("功能");
        JMenu aboutUsMenu = new JMenu("关于我们");


        JMenuItem replayMenuItem = new JMenuItem("重新开始");
        JMenuItem logoutMenuItem = new JMenuItem("退出登录");
        JMenuItem closeGameMenuItem = new JMenuItem("关闭游戏");

        JMenuItem accountMenuItem = new JMenuItem("公众号");

        functionMenu.add(replayMenuItem);
        functionMenu.add(logoutMenuItem);
        functionMenu.add(closeGameMenuItem);

        aboutUsMenu.add(accountMenuItem);

        jMenuBar.add(functionMenu);
        jMenuBar.add(aboutUsMenu);

        this.setJMenuBar(jMenuBar);
    }

    private void initFrame() {
        // 设置窗口标题
        this.setTitle("拼图游戏 单机版");
        // 设置窗口长宽
        this.setSize(603, 680);
        // 设置窗口位置
        this.setLocationRelativeTo(null);
        // 设置窗口关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // 取消默认居中
        this.setLayout(null);
        // 添加键盘监听
        this.addKeyListener(this);
    }


    @Override
    public void keyPressed(KeyEvent e) {
        int bound = gameData.getBound();
        int[][] movedArray = gameData.getMovedArray();
        int code = e.getKeyCode();
        switch (code) {
            case KeyEvent.VK_LEFT: {
                int[][] newArray = MovePicture.leftPicture(movedArray);
                if (newArray.length == 0) {
                    System.out.println("无效移动");
                    return;
                }
                gameData.setMovedArray(newArray);
                initImage(bound, newArray);
                break;
            }
            case KeyEvent.VK_RIGHT: {
                int[][] newArray = MovePicture.rightPicture(movedArray);
                if (newArray.length == 0) {
                    System.out.println("无效移动");
                    return;
                }
                gameData.setMovedArray(newArray);
                initImage(bound, newArray);
                break;
            }
            case KeyEvent.VK_UP: {
                int[][] newArray = MovePicture.upPicture(movedArray);
                if (newArray.length == 0) {
                    System.out.println("无效移动");
                    return;
                }
                gameData.setMovedArray(newArray);
                initImage(bound, newArray);
                break;
            }
            case (KeyEvent.VK_DOWN): {
                int[][] newArray = MovePicture.downPicture(movedArray);
                if (newArray.length == 0) {
                    System.out.println("无效移动");
                    return;
                }
                gameData.setMovedArray(newArray);
                initImage(bound, newArray);
                break;
            }
            default: {
                System.out.println("无效操作：" + code);
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
