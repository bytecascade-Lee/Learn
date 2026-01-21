package com.serene.ZhangHao.temp;

//import org.jetbrains.annotations.NotNull;
//import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.Map;

/**
 * 按钮工具类 - 重构版
 * 支持三种类型的按钮：普通按钮、点击后禁用按钮、Toggle按钮
 * 所有按钮类型均支持互斥组功能
 *
 * @author Serene Lee
 * @date 2026/1/21
 */
public class ButtonUtil {
    /**
     * 按钮尺寸
     */
    private static final int BTN_WIDTH = 120;
    private static final int BTN_HEIGHT = 45;

    /**
     * 圆角半径
     */
    private static final int CORNER_RADIUS = 8;

    /**
     * 边框粗细
     */
    private static final int BORDER_THICKNESS_NORMAL = 2;
    private static final int BORDER_THICKNESS_HOVER = 4;
    private static final int BORDER_THICKNESS_SELECTED = 4;
    private static final int BORDER_THICKNESS_DISABLED = 2;

    /**
     * 图标与文字间距
     */
    private static final int ICON_TEXT_GAP = 5;

    /**
     * 字体配置
     */
    private static final int FONT_SIZE_NORMAL = 14;
    private static final String FONT_NAME = "微软雅黑";
    private static final int FONT_STYLE_NORMAL = Font.PLAIN;
    private static final int FONT_STYLE_HOVER = Font.BOLD;
    private static final int FONT_STYLE_DISABLED = Font.PLAIN;

    /**
     * 背景色
     */
    private static final Color COLOR_BG_NORMAL = new Color(255, 255, 255);
    private static final Color COLOR_BG_HOVER = new Color(240, 240, 240);
    private static final Color COLOR_BG_SELECTED = new Color(255, 150, 180);
    private static final Color COLOR_BG_DISABLED = new Color(240, 240, 240);

    /**
     * 文字色
     */
    private static final Color COLOR_TEXT_NORMAL = new Color(51, 51, 51);
    private static final Color COLOR_TEXT_HOVER = new Color(255, 150, 180);
    private static final Color COLOR_TEXT_SELECTED = new Color(255, 255, 255);
    private static final Color COLOR_TEXT_DISABLED = new Color(160, 160, 160);

    /**
     * 边框色
     */
    private static final Color COLOR_BORDER_NORMAL = new Color(255, 150, 180);
    private static final Color COLOR_BORDER_HOVER = new Color(255, 150, 180);
    private static final Color COLOR_BORDER_SELECTED = new Color(255, 150, 180);
    private static final Color COLOR_BORDER_DISABLED = new Color(200, 200, 200);

    // ======================== 互斥组管理 ========================

    /**
     * 存储每个互斥组当前选中的按钮
     * Key: 互斥组ID (String)
     * Value: 当前选中的按钮
     */
    private static final Map<String, JButton> SELECTED_BUTTONS = new HashMap<>();

    /**
     * Toggle按钮的状态管理
     * Key: 按钮实例
     * Value: 是否选中
     */
    private static final Map<JButton, Boolean> TOGGLE_BUTTON_STATES = new HashMap<>();

    // ======================== 接口定义 ========================

    /**
     * 创建普通按钮
     *
     * @param icon          按钮图标（可为null）
     * @param text          按钮文字
     * @param groupId       互斥组ID：相同ID的按钮互斥，null或空字符串为独立按钮
     * @param leftAlign     true=左对齐，false=居中
     * @param businessLogic 点击后的业务逻辑（可为null）
     * @return 配置完成的自定义按钮
     */
    public static JButton createNormalButton(Icon icon,
                                             String text,
                                             String groupId,
                                             boolean leftAlign,
                                             Runnable businessLogic) {

        JButton button = createBaseButton(icon, text, leftAlign);
        applyNormalStyle(button);
        bindMouseEvents(button, groupId, false); // 不是Toggle按钮
        bindNormalActionListener(button, groupId, businessLogic);
        return button;
    }

    // ======================== 按钮创建方法 ========================

    /**
     * 创建点击后禁用按钮（适用于设置面板的"应用"按钮）
     *
     * @param icon               按钮图标（可为null）
     * @param text               按钮文字
     * @param settingsController 设置控制器，用于管理按钮状态
     * @param leftAlign          true=左对齐，false=居中
     * @param businessLogic      点击后的业务逻辑（可为null）
     * @return 配置完成的自定义按钮
     */
    public static JButton createDisableOnClickButton(Icon icon,
                                                     String text,
                                                     SettingsController settingsController,
                                                     boolean leftAlign,
                                                     Runnable businessLogic) {

        JButton button = createBaseButton(icon, text, leftAlign);
        applyDisabledStyle(button);
        bindDisableOnClickEvents(button, settingsController);
        bindDisableOnClickActionListener(button, settingsController, businessLogic);
        return button;
    }

    /**
     * 创建Toggle按钮
     *
     * @param icon            按钮图标（可为null）
     * @param text            按钮文字
     * @param groupId         互斥组ID：相同ID的按钮互斥，null或空字符串为独立按钮
     * @param leftAlign       true=左对齐，false=居中
     * @param initialSelected 初始是否选中
     * @param businessLogic   点击后的业务逻辑（可为null）
     * @return 配置完成的自定义按钮
     */
    public static JButton createToggleButton(Icon icon,
                                             String text,
                                             String groupId,
                                             boolean leftAlign,
                                             boolean initialSelected,
                                             Runnable businessLogic) {

        JButton button = createBaseButton(icon, text, leftAlign);
        TOGGLE_BUTTON_STATES.put(button, initialSelected);
        updateToggleStyle(button, initialSelected);
        bindMouseEvents(button, groupId, true);
        bindToggleActionListener(button, groupId, businessLogic);
        return button;
    }

    /**
     * 创建基础按钮
     */
    private static JButton createBaseButton(Icon icon, String text, boolean leftAlign) {
        JButton button = new JButton(text, icon) {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2d = (Graphics2D) g.create();
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g2d.setColor(getBackground());
                g2d.fillRoundRect(0, 0, getWidth(), getHeight(),
                        CORNER_RADIUS * 2, CORNER_RADIUS * 2);
                super.paintComponent(g);
                g2d.dispose();
            }

            @Override
            public Cursor getCursor() {
                if (this.isEnabled()) {
                    return super.getCursor();
                } else {
                    return Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR);
                }
            }

        };

        // 设置尺寸（严格固定）
        Dimension size = new Dimension(BTN_WIDTH, BTN_HEIGHT);
        button.setPreferredSize(size);
        button.setMinimumSize(size);
        button.setMaximumSize(size);

        // 设置图标和文字布局
        button.setHorizontalTextPosition(SwingConstants.RIGHT);
        button.setIconTextGap(ICON_TEXT_GAP);

        if (leftAlign) {
            button.setHorizontalAlignment(SwingConstants.LEFT);
        } else {
            button.setHorizontalAlignment(SwingConstants.CENTER);
        }

        // 移除默认样式
        button.setBorderPainted(true);
        button.setFocusPainted(false);
        button.setContentAreaFilled(false);
        button.setOpaque(false);

        return button;
    }

    // ======================== 基础按钮创建 ========================

    /**
     * 应用普通样式
     */
    static void applyNormalStyle(JButton button) {
        button.setOpaque(false);
        button.setContentAreaFilled(false);
        button.setEnabled(true);

        button.setBackground(COLOR_BG_NORMAL);
        button.setForeground(COLOR_TEXT_NORMAL);
        button.setFont(new Font(FONT_NAME, FONT_STYLE_NORMAL, FONT_SIZE_NORMAL));
        button.setBorder(new RoundedBorder(COLOR_BORDER_NORMAL, BORDER_THICKNESS_NORMAL, true));
    }

    // ======================== 样式应用方法 ========================

    /**
     * 应用悬浮样式
     */
    private static void applyHoverStyle(JButton button) {
        button.setOpaque(false);
        button.setContentAreaFilled(false);
        button.setEnabled(true);

        button.setBackground(COLOR_BG_HOVER);
        button.setForeground(COLOR_TEXT_HOVER);
        button.setFont(new Font(FONT_NAME, FONT_STYLE_HOVER, FONT_SIZE_NORMAL));
        button.setBorder(new RoundedBorder(COLOR_BORDER_HOVER, BORDER_THICKNESS_HOVER, true));
    }

    /**
     * 应用选中样式
     */
    private static void applySelectedStyle(JButton button) {
        // 下面这一行千问写的是true，按下去是直角，我改为false后按下去是圆角了
        button.setOpaque(false);
        button.setContentAreaFilled(false);
        button.setEnabled(true);

        button.setBackground(COLOR_BG_SELECTED);
        button.setForeground(COLOR_TEXT_SELECTED);
        button.setFont(new Font(FONT_NAME, FONT_STYLE_NORMAL, FONT_SIZE_NORMAL));
        button.setBorder(new RoundedBorder(COLOR_BORDER_SELECTED, BORDER_THICKNESS_SELECTED, true));
    }

    /**
     * 应用禁用样式
     */
    static void applyDisabledStyle(JButton button) {
        button.setOpaque(true);
        button.setContentAreaFilled(false);
        button.setEnabled(false);

        button.setBackground(COLOR_BG_DISABLED);
        button.setForeground(COLOR_TEXT_DISABLED);
        button.setFont(new Font(FONT_NAME, FONT_STYLE_DISABLED, FONT_SIZE_NORMAL));
        button.setBorder(new RoundedBorder(COLOR_BORDER_DISABLED, BORDER_THICKNESS_DISABLED, true));
        button.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
    }

    /**
     * 更新Toggle按钮的样式
     */
    private static void updateToggleStyle(JButton button, boolean isSelected) {
        if (isSelected) {
            applySelectedStyle(button);
        } else {
            applyNormalStyle(button);
        }
        TOGGLE_BUTTON_STATES.put(button, isSelected);
    }

    /**
     * 绑定鼠标事件
     */
    private static void bindMouseEvents(JButton button, String groupId, boolean isToggle) {
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                if (!button.isEnabled()) {
                    return; // 禁用状态下不响应鼠标事件
                }

                if (isToggle) {
                    // Toggle按钮：如果是选中状态，不改变样式；否则应用悬浮样式
                    if (!TOGGLE_BUTTON_STATES.getOrDefault(button, false)) {
                        applyHoverStyle(button);
                    }
                } else {
                    // 普通按钮：如果不是当前选中状态，显示悬浮样式
                    if (!isButtonSelected(button, groupId)) {
                        applyHoverStyle(button);
                    }
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (!button.isEnabled()) {
                    return; // 禁用状态下不响应鼠标事件
                }

                if (isToggle) {
                    // Toggle按钮：根据当前状态应用对应样式
                    boolean isSelected = TOGGLE_BUTTON_STATES.getOrDefault(button, false);
                    updateToggleStyle(button, isSelected);
                } else {
                    // 普通按钮：如果不是当前选中状态，恢复普通样式
                    if (!isButtonSelected(button, groupId)) {
                        applyNormalStyle(button);
                    } else {
                        applySelectedStyle(button); // 保持选中状态
                    }
                }
            }
        });
    }

    // ======================== 事件绑定方法 ========================

    /**
     * 绑定禁用按钮的鼠标事件
     */
    private static void bindDisableOnClickEvents(JButton button, SettingsController settingsController) {
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                if (!button.isEnabled()) {
                    // 禁用状态下显示禁止光标
                    button.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
                } else {
                    applyHoverStyle(button);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (!button.isEnabled()) {
                    applyDisabledStyle(button);
                } else {
                    applyNormalStyle(button);
                }
            }
        });

        // 监听设置状态变化
        if (settingsController != null) {
            Timer timer = new Timer(100, e -> {
                if (settingsController.isModified() && !button.isEnabled()) {
                    // 设置已修改，启用按钮
                    applyNormalStyle(button);
                } else if (!settingsController.isModified() && button.isEnabled()) {
                    // 设置未修改，禁用按钮
                    applyDisabledStyle(button);
                }
            });
            timer.start();
        }
    }

    /**
     * 绑定普通按钮的点击事件
     */
    private static void bindNormalActionListener(JButton button, String groupId, Runnable businessLogic) {
        button.addActionListener(e -> {
            // 如果按钮有互斥组，需要处理互斥逻辑
            if (groupId != null && !groupId.trim().isEmpty()) {
                handleMutualExclusion(button, groupId);
            }

            // 应用选中样式
            applySelectedStyle(button);

            // 执行业务逻辑
            if (businessLogic != null) {
                SwingUtilities.invokeLater(businessLogic);
            }
        });
    }

    /**
     * 绑定点击禁用按钮的点击事件
     */
    private static void bindDisableOnClickActionListener(JButton button, SettingsController settingsController, Runnable businessLogic) {
        button.addActionListener(e -> {
            // 立即禁用按钮
            applyDisabledStyle(button);

            // 通知设置控制器状态已应用
            if (settingsController != null) {
                settingsController.setModified(false);
            }

            // 执行业务逻辑
            if (businessLogic != null) {
                SwingUtilities.invokeLater(businessLogic);
            }
        });
    }

    /**
     * 绑定Toggle按钮的点击事件
     */
    private static void bindToggleActionListener(JButton button, String groupId, Runnable businessLogic) {
        button.addActionListener(e -> {
            boolean currentState = TOGGLE_BUTTON_STATES.getOrDefault(button, false);
            boolean newState = !currentState;

            // 如果按钮属于互斥组，需要特殊处理
            if (groupId != null && !groupId.trim().isEmpty()) {
                // 在互斥组中，Toggle按钮只能从选中变为非选中，不能从非选中变为选中
                if (!newState) {
                    // 从选中变为非选中，允许操作
                    updateToggleStyle(button, false);

                    // 如果这是当前组中唯一的选中按钮，移除组记录
                    if (SELECTED_BUTTONS.get(groupId) == button) {
                        SELECTED_BUTTONS.remove(groupId);
                    }
                } else {
                    // 从非选中变为选中，需要处理互斥逻辑
                    JButton previousSelected = SELECTED_BUTTONS.get(groupId);
                    if (previousSelected != null) {
                        // 如果已有选中按钮，先取消它的选中状态
                        boolean prevIsToggle = TOGGLE_BUTTON_STATES.containsKey(previousSelected);
                        if (prevIsToggle) {
                            TOGGLE_BUTTON_STATES.put(previousSelected, false);
                            updateToggleStyle(previousSelected, false);
                        } else {
                            applyNormalStyle(previousSelected);
                        }
                    }

                    // 更新组选中状态
                    SELECTED_BUTTONS.put(groupId, button);
                    updateToggleStyle(button, true);
                }
            } else {
                // 独立Toggle按钮，直接切换状态
                updateToggleStyle(button, newState);
            }

            // 执行业务逻辑
            if (businessLogic != null) {
                SwingUtilities.invokeLater(businessLogic);
            }
        });
    }

    /**
     * 处理互斥逻辑（仅适用于普通按钮和Toggle按钮的选中状态）
     */
    private static void handleMutualExclusion(JButton button, String groupId) {
        JButton previousSelected = SELECTED_BUTTONS.get(groupId);

        // 如果是同一个按钮，直接返回（已经选中）
        if (previousSelected == button) {
            return;
        }

        // 取消之前选中按钮的样式
        if (previousSelected != null) {
            // 检查之前的按钮是否是Toggle按钮
            if (TOGGLE_BUTTON_STATES.containsKey(previousSelected)) {
                // Toggle按钮恢复到未选中状态的样式
                updateToggleStyle(previousSelected, false);
            } else {
                applyNormalStyle(previousSelected);
            }
        }

        // 更新当前选中的按钮
        SELECTED_BUTTONS.put(groupId, button);
    }

    // ======================== 互斥组管理方法 ========================

    /**
     * 检查按钮是否是该组的当前选中按钮
     */
    private static boolean isButtonSelected(JButton button, String groupId) {
        if (groupId == null || groupId.trim().isEmpty()) {
            // 独立按钮没有选中状态
            return false;
        }
        return button == SELECTED_BUTTONS.get(groupId);
    }

    /**
     * 获取Toggle按钮的当前状态
     */
    public static boolean isToggleButtonSelected(JButton button) {
        return TOGGLE_BUTTON_STATES.getOrDefault(button, false);
    }

    /**
     * 设置Toggle按钮的选中状态
     */
    public static void setToggleButtonSelected(JButton button, boolean selected) {
        if (TOGGLE_BUTTON_STATES.containsKey(button)) {
            updateToggleStyle(button, selected);
        }
    }

    /**
     * 清除互斥组状态（可选，用于重置）
     */
    public static void clearGroupSelection(String groupId) {
        if (groupId != null) {
            SELECTED_BUTTONS.remove(groupId);
        }
    }

    /**
     * 清除所有互斥组状态
     */
    public static void clearAllSelections() {
        SELECTED_BUTTONS.clear();
    }

    /**
     * 清除所有Toggle按钮状态
     */
    public static void clearAllToggleStates() {
        TOGGLE_BUTTON_STATES.clear();
    }

    /**
     * 重置所有状态
     */
    public static void resetAllStates() {
        clearAllSelections();
        clearAllToggleStates();
    }

    /**
     * 设置控制器接口，用于管理按钮的启用/禁用状态
     */
    public interface SettingsController {
        boolean isModified(); // 是否有修改

        void setModified(boolean modified); // 设置修改状态
    }
}
