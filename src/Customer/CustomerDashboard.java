/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Customer;

import classes.DataModel;
import connection.connect1;
import java.awt.Color;
import javax.swing.JButton;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import login.LoginFrame;


/**
 *
 * @author gardh
 */
public class CustomerDashboard extends javax.swing.JFrame {

    private DashboardCustomerPanel dashboardcustomer;
    private orderPanel orderP;
    private deliveredPanel deliveryP;
    
    
    private String Cname;
    
    
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
    
    public CustomerDashboard() {
         Cname = DataModel.getData();
        
        initComponents();
        init();
        
       con = connect1.con();
        
        dashboard.requestFocus();
        
        dashboardcustomer = new DashboardCustomerPanel();
        orderP = new orderPanel();
        deliveryP =  new deliveredPanel();
        
        
        jPanel1.add(dashboardcustomer);
        jPanel1.add(orderP);
        jPanel1.add(deliveryP);
         
        
        dashboardcustomer.setVisible(false);
        orderP.setVisible(false);
        deliveryP.setVisible(false);
        
      lbl_fullname.setText(Cname);
        
         
        
    }

    
      public  void init(){
    
        setBackground(new Color(0,0,0,0));
        
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new Panel.panelBorder();
        jPanel1 = new javax.swing.JPanel();
        gradientPanelMenu1 = new Panel.GradientPanelMenu();
        Delivered = new classes.Button1();
        lbl = new javax.swing.JLabel();
        dashboard = new classes.Button1();
        profile = new classes.Button1();
        ordersBtn = new classes.Button1();
        jLabel1 = new javax.swing.JLabel();
        lbl_fullname = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DIRECT CLIENT");
        setUndecorated(true);

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.CardLayout());

        gradientPanelMenu1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Delivered.setText("DELIVERED");
        Delivered.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeliveredActionPerformed(evt);
            }
        });
        gradientPanelMenu1.add(Delivered, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 220, -1));

        lbl.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lbl.setForeground(new java.awt.Color(0, 0, 0));
        lbl.setText("    My Purchases");
        gradientPanelMenu1.add(lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 220, 40));

        dashboard.setText("DASHBOARD");
        dashboard.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dashboardFocusGained(evt);
            }
        });
        dashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboardActionPerformed(evt);
            }
        });
        gradientPanelMenu1.add(dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 220, -1));

        profile.setText("LOGOUT");
        profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileActionPerformed(evt);
            }
        });
        gradientPanelMenu1.add(profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 220, -1));

        ordersBtn.setText("ORDERS");
        ordersBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordersBtnActionPerformed(evt);
            }
        });
        gradientPanelMenu1.add(ordersBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 220, -1));

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome!");
        gradientPanelMenu1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 80, 20));

        lbl_fullname.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 14)); // NOI18N
        lbl_fullname.setForeground(new java.awt.Color(255, 255, 255));
        lbl_fullname.setText("Hector");
        lbl_fullname.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        gradientPanelMenu1.add(lbl_fullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 180, 30));

        jLabel7.setFont(new java.awt.Font("Eras Bold ITC", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("waterOrder");
        gradientPanelMenu1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, 20));

        jLabel6.setFont(new java.awt.Font("Eras Bold ITC", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Pro");
        gradientPanelMenu1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, 20));

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addComponent(gradientPanelMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 994, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(gradientPanelMenu1, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void DeliveredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeliveredActionPerformed

        Delivered.setOpaque(true);
        Delivered.setForeground(Color.WHITE);

        
          setButton(dashboard);
          setButton(ordersBtn);
          setButton(profile);
       
          dashboardcustomer.setVisible(false);
          orderP.setVisible(false);
          deliveryP.setVisible(true);
       
    }//GEN-LAST:event_DeliveredActionPerformed

    private void dashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardActionPerformed
        
          dashboard.setOpaque(true);
          dashboard.setForeground(Color.WHITE);
          
         
          setButton(ordersBtn);
          setButton(Delivered);
          setButton(profile);
          
          dashboardcustomer.setVisible(true);
          orderP.setVisible(false);
          deliveryP.setVisible(false);
          
    }//GEN-LAST:event_dashboardActionPerformed

    private void profileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileActionPerformed
      
        profile.setOpaque(true);
          profile.setForeground(Color.WHITE);
         
        
          setButton(dashboard);
          setButton(ordersBtn);
          setButton(Delivered);
        
                  
         int confirmation = JOptionPane.showConfirmDialog(
        null, "Are you sure you want to logout?", "Confirm", JOptionPane.YES_NO_OPTION
    );

    if (confirmation == JOptionPane.YES_OPTION) {
        LoginFrame log = new LoginFrame();
          log.setVisible(true);
        dispose();
        
        
    } 
          
    }//GEN-LAST:event_profileActionPerformed

    private void ordersBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordersBtnActionPerformed
      
          ordersBtn.setOpaque(true);
          ordersBtn.setForeground(Color.WHITE);
         
        
          setButton(dashboard);
          setButton(Delivered);
          setButton(profile);
          
          dashboardcustomer.setVisible(false);
          orderP.setVisible(true);
          deliveryP.setVisible(false);
       
    }//GEN-LAST:event_ordersBtnActionPerformed

    private void dashboardFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dashboardFocusGained
       
          dashboard.setOpaque(true);
          dashboard.setForeground(Color.WHITE);
    }//GEN-LAST:event_dashboardFocusGained

    
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
            java.util.logging.Logger.getLogger(CustomerDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private classes.Button1 Delivered;
    private classes.Button1 dashboard;
    private Panel.GradientPanelMenu gradientPanelMenu1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl;
    private javax.swing.JLabel lbl_fullname;
    private classes.Button1 ordersBtn;
    private Panel.panelBorder panelBorder1;
    private classes.Button1 profile;
    // End of variables declaration//GEN-END:variables
}
