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
public class transparentPanel extends JPanel{
      public transparentPanel() {
        setOpaque(false); // Set the panel to be transparent
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(new Color(0, 0, 0, 0)); // Set the color with 0 alpha value
        g.fillRect(0, 0, getWidth(), getHeight()); // Fill the panel with transparent color
        super.paintComponent(g);
    }
}
