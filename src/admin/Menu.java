/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package admin;

import Panel.panelBorder;
import java.awt.Color;
import javax.swing.JButton;
import admin.AdminDashboard;
import event.ButtonClickListener;
import java.awt.Component;
import java.awt.Container;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;


/**
 *
 * @author gardh
 */
public class Menu extends javax.swing.JPanel {

     private ButtonClickListener buttonClickListener;
    
     
     public void setButtonClickListener(ButtonClickListener listener) {
        this.buttonClickListener = listener;
    }

    public Menu() {
        initComponents();
        dashBoard.requestFocus();
        setOpaque(false);
        
    }

   

   
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gradientPanelMenu1 = new Panel.GradientPanelMenu();
        dashBoard = new classes.Button1();
        prodInventory = new classes.Button1();
        accountManagement = new classes.Button1();
        deliveryManagement = new classes.Button1();
        logout = new classes.Button1();
        orders = new classes.Button1();

        gradientPanelMenu1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dashBoard.setText("DASHBOARD");
        dashBoard.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dashBoardFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                dashBoardFocusLost(evt);
            }
        });
        dashBoard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashBoardActionPerformed(evt);
            }
        });
        gradientPanelMenu1.add(dashBoard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 220, -1));

        prodInventory.setText("PRODUCT INVENTORY");
        prodInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prodInventoryActionPerformed(evt);
            }
        });
        gradientPanelMenu1.add(prodInventory, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 220, -1));

        accountManagement.setText("ACCOUNT MANAGEMENT");
        accountManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountManagementActionPerformed(evt);
            }
        });
        gradientPanelMenu1.add(accountManagement, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 220, -1));

        deliveryManagement.setText("DELIVERY MANAGEMENT");
        deliveryManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deliveryManagementActionPerformed(evt);
            }
        });
        gradientPanelMenu1.add(deliveryManagement, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 220, -1));

        logout.setText("LOGOUT");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        gradientPanelMenu1.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 220, -1));

        orders.setText("ORDERS");
        orders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordersActionPerformed(evt);
            }
        });
        gradientPanelMenu1.add(orders, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 220, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gradientPanelMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gradientPanelMenu1, javax.swing.GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed

        logout.setOpaque(true);
        logout.setForeground(Color.WHITE);

        setButton(dashBoard);
        setButton(prodInventory);
        setButton(accountManagement);
        setButton(deliveryManagement);
        setButton(orders);
    }//GEN-LAST:event_logoutActionPerformed

    private void deliveryManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deliveryManagementActionPerformed

        deliveryManagement.setOpaque(true);
        deliveryManagement.setForeground(Color.WHITE);

        setButton(dashBoard);
        setButton(prodInventory);
        setButton(accountManagement);
        setButton(orders);
        setButton(logout);
    }//GEN-LAST:event_deliveryManagementActionPerformed

    private void accountManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountManagementActionPerformed

        accountManagement.setOpaque(true);
        accountManagement.setForeground(Color.WHITE);

        setButton(dashBoard);
        setButton(prodInventory);
        setButton(deliveryManagement);
        setButton(orders);
        setButton(logout);
    }//GEN-LAST:event_accountManagementActionPerformed

    private void prodInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodInventoryActionPerformed
        prodInventory.setOpaque(true);
        prodInventory.setForeground(Color.WHITE);

        setButton(dashBoard);
        setButton(accountManagement);
        setButton(deliveryManagement);
        setButton(orders);
        setButton(logout);
        
           if (buttonClickListener != null) {
                    buttonClickListener.onButtonClick("PRODUCT INVENTORY");
                }      
        
    }//GEN-LAST:event_prodInventoryActionPerformed

    private void dashBoardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashBoardActionPerformed

        dashBoard.setOpaque(true);
        dashBoard.setForeground(Color.WHITE);

        setButton(prodInventory);
        setButton(accountManagement);
        setButton(deliveryManagement);
        setButton(orders);
        setButton(logout );
        
       
                
    }//GEN-LAST:event_dashBoardActionPerformed

    private void dashBoardFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dashBoardFocusLost

    }//GEN-LAST:event_dashBoardFocusLost

    private void dashBoardFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dashBoardFocusGained
        
        dashBoard.setOpaque(true);
        dashBoard.setForeground(Color.WHITE);
    }//GEN-LAST:event_dashBoardFocusGained

    private void ordersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordersActionPerformed
      orders.setOpaque(true);
        orders.setForeground(Color.WHITE);

        setButton(dashBoard);
        setButton(prodInventory);
        setButton(accountManagement);
        setButton(deliveryManagement);
        setButton(logout );
    }//GEN-LAST:event_ordersActionPerformed

  
     
    
    public void setButton(JButton button){
    
         button.setOpaque(false);
        button.setForeground(Color.BLACK);
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private classes.Button1 accountManagement;
    private classes.Button1 dashBoard;
    private classes.Button1 deliveryManagement;
    private Panel.GradientPanelMenu gradientPanelMenu1;
    private classes.Button1 logout;
    private classes.Button1 orders;
    private classes.Button1 prodInventory;
    // End of variables declaration//GEN-END:variables
}
