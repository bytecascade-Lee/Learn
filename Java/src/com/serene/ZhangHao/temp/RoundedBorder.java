package com.serene.ZhangHao.temp;

import javax.swing.border.Border;
import java.awt.*;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2026/1/21
 */
public class RoundedBorder implements Border {
    private static final int CORNER_RADIUS = 8;
    private static final int LEFT_GAP = 10;

    private final Color color;
    private final int thickness;
    private final boolean rounded;

    public RoundedBorder(Color color, int thickness, boolean rounded) {
        this.color = color;
        this.thickness = thickness;
        this.rounded = rounded;
    }


    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int arc = rounded ? CORNER_RADIUS * 2 : 0;

        g2d.setColor(color);
        g2d.setStroke(new BasicStroke(thickness));

        int offset = thickness / 2;
        g2d.drawRoundRect(x + offset, y + offset,
                width - thickness, height - thickness,
                arc, arc);
        g2d.dispose();
    }

    @Override
    public Insets getBorderInsets(Component c) {
        int inset = thickness + (rounded ? 2 : 0);
        return new Insets(inset, inset + LEFT_GAP, inset, inset);
    }

    @Override
    public boolean isBorderOpaque() {
        return false;
    }
}
