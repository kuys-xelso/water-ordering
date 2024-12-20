/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author gardh
 */
public class TransparentPanelMenu extends JPanel {
   
    private boolean isFocused;

    public TransparentPanelMenu() {
        setOpaque(false); // Set the panel to be transparent
        isFocused = false;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(new Color(0, 0, 0, 0)); // Set the color with 0 alpha value
        g.fillRect(0, 0, getWidth(), getHeight()); // Fill the panel with transparent color

        if (isFocused) {
            // Draw focus paint
            g.setColor(new Color(0, 0, 255, 128)); // Blue translucent color
            g.fillRect(0, 0, getWidth(), getHeight());
        }
    }

    @Override
    public void setFocusable(boolean focusable) {
        super.setFocusable(focusable);
        if (!focusable) {
            isFocused = false;
        }
    }

    @Override
    public void requestFocus() {
        super.requestFocus();
        isFocused = true;
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        if (isFocused) {
            // Draw focus border
            g.setColor(Color.BLUE);
            g.drawRect(0, 0, getWidth() - 1, getHeight() - 1);
        }
    }
}

