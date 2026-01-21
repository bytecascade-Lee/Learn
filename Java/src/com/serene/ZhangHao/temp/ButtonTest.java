package com.serene.ZhangHao.temp;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;

public class ButtonTest {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception e) {
                e.printStackTrace();
            }

            JFrame frame = new JFrame("按钮工具类测试");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new BorderLayout());

            // 创建主面板
            JPanel mainPanel = new JPanel(new GridBagLayout());
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.insets = new Insets(10, 10, 10, 10);

            // 第一行：普通按钮
            gbc.gridx = 0;
            gbc.gridy = 0;
            JLabel label1 = new JLabel("普通按钮（互斥组A）:");
            mainPanel.add(label1, gbc);

            gbc.gridx = 1;
            JButton normalBtn1 = ButtonUtil.createNormalButton(null, "普通按钮1", "groupA", false, () -> System.out.println("普通按钮1被点击"));
            mainPanel.add(normalBtn1, gbc);

            gbc.gridx = 2;
            JButton normalBtn2 = ButtonUtil.createNormalButton(null, "普通按钮2", "groupA", false, () -> System.out.println("普通按钮2被点击"));
            mainPanel.add(normalBtn2, gbc);

            gbc.gridx = 3;
            JButton normalBtn3 = ButtonUtil.createNormalButton(null, "普通按钮3", "groupA", false, () -> System.out.println("普通按钮3被点击"));
            mainPanel.add(normalBtn3, gbc);

            // 第二行：Toggle按钮
            gbc.gridx = 0;
            gbc.gridy = 1;
            JLabel label2 = new JLabel("Toggle按钮（互斥组B）:");
            mainPanel.add(label2, gbc);

            gbc.gridx = 1;
            JButton toggleBtn1 = ButtonUtil.createToggleButton(null, "Toggle1",
                    "groupB", false, false,
                    //  + ButtonUtil.isToggleButtonSelected(toggleBtn1)
                    () -> System.out.println("Toggle按钮1状态: "));
            mainPanel.add(toggleBtn1, gbc);

            gbc.gridx = 2;
            JButton toggleBtn2 = ButtonUtil.createToggleButton(null, "Toggle2",
                    "groupB", false, false,
                    () -> System.out.println("Toggle按钮2状态: "));
            mainPanel.add(toggleBtn2, gbc);

            gbc.gridx = 3;
            JButton toggleBtn3 = ButtonUtil.createToggleButton(null, "Toggle3",
                    null, false, false,
                    () -> System.out.println("独立Toggle按钮状态: "));
            mainPanel.add(toggleBtn3, gbc);

            // 第三行：独立按钮
            gbc.gridx = 0;
            gbc.gridy = 2;
            JLabel label3 = new JLabel("独立普通按钮:");
            mainPanel.add(label3, gbc);

            gbc.gridx = 1;
            JButton independentBtn = ButtonUtil.createNormalButton(null, "独立按钮",
                    null, false, () -> System.out.println("独立按钮被点击"));
            mainPanel.add(independentBtn, gbc);

            // 第四行：设置面板测试
            gbc.gridx = 0;
            gbc.gridy = 3;
            JLabel label4 = new JLabel("设置面板测试:");
            mainPanel.add(label4, gbc);

            gbc.gridx = 1;
            gbc.gridwidth = 3;
            JPanel settingsPanel = new JPanel(new FlowLayout());

            JTextField textField = new JTextField(15);
            textField.setText("请输入设置...");
            settingsPanel.add(textField);

            // 创建设置控制器
            ButtonUtil.SettingsController settingsController = new ButtonUtil.SettingsController() {
                private boolean modified = false;

                @Override
                public boolean isModified() {
                    return modified;
                }

                @Override
                public void setModified(boolean modified) {
                    this.modified = modified;
                }
            };

            // 应用按钮
            JButton applyBtn = ButtonUtil.createDisableOnClickButton(null, "应用", settingsController, false, () -> {
                System.out.println("应用设置: " + textField.getText());
                textField.setText("");
            });
            settingsPanel.add(applyBtn);

            // 添加文本改变监听器
            textField.getDocument().addDocumentListener(new DocumentListener() {
                public void changedUpdate(DocumentEvent e) {
                    update();
                }

                public void removeUpdate(DocumentEvent e) {
                    update();
                }

                public void insertUpdate(DocumentEvent e) {
                    update();
                }

                private void update() {
                    boolean hasText = textField.getText().trim().length() > 0;
                    settingsController.setModified(hasText);
                    // 手动更新按钮状态
                    SwingUtilities.invokeLater(() -> {
                        if (hasText && !applyBtn.isEnabled()) {
                            applyBtn.setEnabled(true);
                            ButtonUtil.applyNormalStyle(applyBtn);
                        } else if (!hasText && applyBtn.isEnabled()) {
                            applyBtn.setEnabled(false);
                            ButtonUtil.applyDisabledStyle(applyBtn);
                        }
                    });
                }
            });

            mainPanel.add(settingsPanel, gbc);

            frame.add(mainPanel, BorderLayout.CENTER);
            frame.setSize(800, 300);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
