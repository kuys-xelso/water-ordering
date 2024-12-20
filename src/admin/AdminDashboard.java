/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package admin;

import connection.connect1;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import login.LoginFrame;

/**
 *
 * @author gardh
 */
public class AdminDashboard extends javax.swing.JFrame {
    
    Connection con;
    PreparedStatement pst;
    ResultSet rs;

   private DashboardPanel dashboardpanel;
   private Inventory inventory;
   private AccountManagementPanel accountManagementPanel;
   private OrderManagementPanel ordermanagementpanel;
   private ManagePayment managepayment;
 
   
    public AdminDashboard() {
        initComponents();
       init();
       dashBoard.requestFocus();
       
       dashboardpanel = new DashboardPanel();
       inventory = new Inventory();
       accountManagementPanel = new AccountManagementPanel();
       ordermanagementpanel = new OrderManagementPanel();
       managepayment = new ManagePayment();
       
       jPanel2.add(dashboardpanel);
       jPanel2.add(inventory);
       jPanel2.add(accountManagementPanel);
       jPanel2.add(ordermanagementpanel);
       jPanel2.add(managepayment);
       
       dashboardpanel.setVisible(false);
       inventory.setVisible(false);
       accountManagementPanel.setVisible(false);
       ordermanagementpanel.setVisible(false);
       managepayment.setVisible(false);
    }

    
    
    
    public void init(){
        setBackground(new Color(0,0,0,0));
    
    }
    
    

       
 
       
       
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder2 = new Panel.panelBorder();
        gradientPanelMenu1 = new Panel.GradientPanelMenu();
        dashBoard = new classes.Button1();
        accountManagement = new classes.Button1();
        prodInventory = new classes.Button1();
        orderManagement = new classes.Button1();
        orders = new classes.Button1();
        logout = new classes.Button1();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbl_fullname = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ADMIN");
        setUndecorated(true);

        panelBorder2.setBackground(new java.awt.Color(216, 216, 216));

        gradientPanelMenu1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dashBoard.setText("DASHBOARD");
        dashBoard.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dashBoardFocusGained(evt);
            }
        });
        dashBoard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashBoardActionPerformed(evt);
            }
        });
        gradientPanelMenu1.add(dashBoard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 220, -1));

        accountManagement.setText("ACCOUNT MANAGEMENT");
        accountManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountManagementActionPerformed(evt);
            }
        });
        gradientPanelMenu1.add(accountManagement, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 220, -1));

        prodInventory.setText("PRODUCT INVENTORY");
        prodInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prodInventoryActionPerformed(evt);
            }
        });
        gradientPanelMenu1.add(prodInventory, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 220, -1));

        orderManagement.setText("ODER MANAGEMENT");
        orderManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderManagementActionPerformed(evt);
            }
        });
        gradientPanelMenu1.add(orderManagement, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 220, -1));

        orders.setText("MANAGE PAYMENT");
        orders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordersActionPerformed(evt);
            }
        });
        gradientPanelMenu1.add(orders, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 220, -1));

        logout.setText("LOGOUT");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        gradientPanelMenu1.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 220, -1));

        jLabel7.setFont(new java.awt.Font("Eras Bold ITC", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("waterOrder");
        gradientPanelMenu1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, 20));

        jLabel6.setFont(new java.awt.Font("Eras Bold ITC", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Pro");
        gradientPanelMenu1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, 20));

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome!");
        gradientPanelMenu1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 80, 20));

        lbl_fullname.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 14)); // NOI18N
        lbl_fullname.setForeground(new java.awt.Color(255, 255, 255));
        lbl_fullname.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        gradientPanelMenu1.add(lbl_fullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 180, 30));

        jPanel2.setBackground(new java.awt.Color(187, 187, 187));
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout panelBorder2Layout = new javax.swing.GroupLayout(panelBorder2);
        panelBorder2.setLayout(panelBorder2Layout);
        panelBorder2Layout.setHorizontalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder2Layout.createSequentialGroup()
                .addComponent(gradientPanelMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 976, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        panelBorder2Layout.setVerticalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
            .addComponent(gradientPanelMenu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelBorder2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dashBoardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashBoardActionPerformed
      
         dashBoard.setOpaque(true);
        dashBoard.setForeground(Color.WHITE);

      
        setButton(prodInventory);
        setButton(accountManagement);
        setButton(orderManagement);
        setButton(orders);
        setButton(logout);
        
                dashboardpanel.setVisible(true);
        inventory.setVisible(false);
        accountManagementPanel.setVisible(false);
         ordermanagementpanel.setVisible(false);
            managepayment.setVisible(false);
       
        
    }//GEN-LAST:event_dashBoardActionPerformed

    private void accountManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountManagementActionPerformed
      
         accountManagement.setOpaque(true);
         accountManagement.setForeground(Color.WHITE);

        setButton(dashBoard);
        setButton(prodInventory);
        setButton(orderManagement);
        setButton(orders);
        setButton(logout);
        
        
          dashboardpanel.setVisible(false);
          inventory.setVisible(false);
                accountManagementPanel.setVisible(true);
           ordermanagementpanel.setVisible(false);
              managepayment.setVisible(false);
    }//GEN-LAST:event_accountManagementActionPerformed

    private void dashBoardFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dashBoardFocusGained
       dashBoard.setOpaque(true);
        dashBoard.setForeground(Color.WHITE);
    }//GEN-LAST:event_dashBoardFocusGained

    private void prodInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodInventoryActionPerformed
       
        
         prodInventory.setOpaque(true);
        prodInventory.setForeground(Color.WHITE);

        setButton(dashBoard);
        setButton(accountManagement);
        setButton(orderManagement);
        setButton(orders);
        setButton(logout);
        
        dashboardpanel.setVisible(false);
                inventory.setVisible(true);
        accountManagementPanel.setVisible(false);
        ordermanagementpanel.setVisible(false);
           managepayment.setVisible(false);
    }//GEN-LAST:event_prodInventoryActionPerformed

    private void orderManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderManagementActionPerformed

        orderManagement.setOpaque(true);
        orderManagement.setForeground(Color.WHITE);

        setButton(dashBoard);
        setButton(prodInventory);
        setButton(accountManagement);
        setButton(orders);
        setButton(logout);
        
          dashboardpanel.setVisible(false);
       inventory.setVisible(false);
       accountManagementPanel.setVisible(false);
       ordermanagementpanel.setVisible(true);
          managepayment.setVisible(false);
    }//GEN-LAST:event_orderManagementActionPerformed

    private void ordersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordersActionPerformed
        orders.setOpaque(true);
        orders.setForeground(Color.WHITE);

        setButton(dashBoard);
        setButton(prodInventory);
        setButton(accountManagement);
        setButton(orderManagement);
        setButton(logout );
        
          dashboardpanel.setVisible(false);
       inventory.setVisible(false);
       accountManagementPanel.setVisible(false);
       ordermanagementpanel.setVisible(false);
          managepayment.setVisible(true);
        
    }//GEN-LAST:event_ordersActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed

        logout.setOpaque(true);
        logout.setForeground(Color.WHITE);

        setButton(dashBoard);
        setButton(prodInventory);
        setButton(accountManagement);
        setButton(orderManagement);
        setButton(orders);
        
      
        
         int confirmation = JOptionPane.showConfirmDialog(
        null, "Are you sure you want to logout?", "Confirm", JOptionPane.YES_NO_OPTION
    );

    if (confirmation == JOptionPane.YES_OPTION) {
        LoginFrame log = new LoginFrame();
          log.setVisible(true);
        dispose();
        
        
    } 
      
    }//GEN-LAST:event_logoutActionPerformed
    
 public void setButton(JButton button){
    
         button.setOpaque(false);
        button.setForeground(Color.BLACK);
       
    }
    
    
 
  
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminDashboard().setVisible(true);
            }
        });
    }

    
    
   
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private classes.Button1 accountManagement;
    private classes.Button1 dashBoard;
    private Panel.GradientPanelMenu gradientPanelMenu1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_fullname;
    private classes.Button1 logout;
    private classes.Button1 orderManagement;
    private classes.Button1 orders;
    private Panel.panelBorder panelBorder2;
    private classes.Button1 prodInventory;
    // End of variables declaration//GEN-END:variables
}
