/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JScrollPane;

/**
 *
 * @author gardh
 */
public class TransparentScrollPane extends JScrollPane{
   
    public TransparentScrollPane() {
       
        setOpaque(false);
        getViewport().setOpaque(false);
        getViewport().setBackground(new Color(0, 0, 0, 0));
        setBorder(null);
    }
    
    @Override
    protected void paintChildren(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      
         g2.fillRoundRect(0, 0, getWidth(), getHeight(), 20,20);
        g2.fillRect(getWidth() - 20, 0, getWidth() , getHeight());
        super.paintChildren(grphcs);
    }
}

