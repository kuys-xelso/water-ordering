/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package login;

import Customer.CustomerDashboard;
import Customer.DashboardCustomerPanel;

import admin.AdminDashboard;
import classes.DataModel;
import connection.connect1;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;


/**
 *
 * @author gardh
 */
public class LoginFrame extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pst;
    ResultSet rs;       
    
    private  String Cname = "";
    public LoginFrame() {
       con = connect1.con();
        initComponents();
        init();
        btn_login.requestFocus();
        
      
    }

    
    public  void init(){
    
        setBackground(new Color(0,0,0,0));
        
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        panelBorder1 = new Panel.panelBorder();
        txt_username = new classes.Textfield();
        txt_pass = new classes.Passwordfeild();
        btn_login = new classes.Button();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        showPass = new javax.swing.JCheckBox();
        gradientPanel2 = new Panel.GradientPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelBorder1.setBackground(new java.awt.Color(242, 242, 242));
        panelBorder1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_username.setText("USERNAME");
        txt_username.setForeground(Color.GRAY);
        txt_username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_usernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_usernameFocusLost(evt);
            }
        });
        txt_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usernameActionPerformed(evt);
            }
        });
        panelBorder1.add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 260, 40));

        txt_pass.setText("PASSWORD");
        txt_pass.setForeground(Color.GRAY);
        txt_pass.setEchoChar('\0');
        txt_pass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_passFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_passFocusLost(evt);
            }
        });
        panelBorder1.add(txt_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 260, 40));

        btn_login.setText("Login");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        panelBorder1.add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 260, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Dont have an Account Yet? Sign Up here!");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        panelBorder1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 260, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/shield-lock.png"))); // NOI18N
        panelBorder1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/person.png"))); // NOI18N
        panelBorder1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, 40));

        showPass.setForeground(new java.awt.Color(255, 255, 255));
        showPass.setText("Show Password");
        showPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPassActionPerformed(evt);
            }
        });
        panelBorder1.add(showPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, -1, -1));
        panelBorder1.add(gradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, -1));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("x");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        panelBorder1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, 30, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/droplet (4)_1.png"))); // NOI18N
        panelBorder1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, 100, 100));

        jLabel6.setFont(new java.awt.Font("Eras Bold ITC", 0, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Pro");
        panelBorder1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 230, -1, 40));

        jLabel7.setFont(new java.awt.Font("Eras Bold ITC", 0, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 153, 255));
        jLabel7.setText("waterOrder");
        panelBorder1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, 180, 40));

        jLabel8.setFont(new java.awt.Font("Serif", 2, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("\"Quench your Thirst with just one Click\"");
        panelBorder1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, 230, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, 835, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
      
        String un = txt_username.getText();
        String ps = new String (txt_pass.getPassword());

          if(un.equals("USERNAME")){ 
        JOptionPane.showMessageDialog(null, "Username is Empty.");
        return;
        }
        if(ps.equals("PASSWORD")){
        JOptionPane.showMessageDialog(null, "Password is Empty.");
        return;
        }
        
        try {
            String sql = "SELECT * FROM  tbl_user_accounts WHERE username=? AND password=?";
            pst = con.prepareCall(sql);
            pst.setString(1, un);
            pst.setString(2, ps);
            rs = pst.executeQuery();

            if(rs.next()){
                int userid = rs.getInt("user_id");
                String role = rs.getString("account_type");
               
                if( role.equals("ADMIN")){
                   
                    new AdminDashboard().setVisible(true);
                    this.dispose();

                }
                if(role.equals("DIRECT CLIENT") || role.equals("RESELLER")){
                    try{
                    pst = con.prepareCall("SELECT fullname,customer_id FROM tbl_customer WHERE user_id =? ");
                     pst.setInt(1, userid);
                     rs = pst.executeQuery();
                     int id = 0;
                     while (rs.next()) {                        
                       Cname = rs.getString("fullname");
                       id= rs.getInt("customer_id");
                       
                    }
                        DataModel.setData(Cname);
                      DataModel.setDatID(id);
                   CustomerDashboard customerDashboard = new CustomerDashboard();
                    DashboardCustomerPanel cdp = new DashboardCustomerPanel();
                  
                 
                
                    customerDashboard.setVisible(true);
                    this.dispose();
                    }catch (SQLException e){
                      e.printStackTrace();
                    }
                }
                
            }else{
                    JOptionPane.showMessageDialog(null, "Incorrect Username or Password.");
                }

            
        } catch (SQLException ex) {
            Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_loginActionPerformed

    private void txt_usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_usernameFocusGained
        showPass.setSelected(false);
         if(txt_username.getText().equals("USERNAME")){
            txt_username.setText("");
            txt_username.setForeground(Color.BLACK );
        }
    }//GEN-LAST:event_txt_usernameFocusGained

    private void txt_usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_usernameFocusLost
       
          if(txt_username.getText().isEmpty()){
            txt_username.setText("USERNAME");
            txt_username.setForeground(Color.GRAY);
        } 
    }//GEN-LAST:event_txt_usernameFocusLost

    private void txt_passFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_passFocusGained
    
          if(txt_pass.getText().equals("PASSWORD")){
            txt_pass.setText("");
            txt_pass.setEchoChar('\u2022');
            txt_pass.setForeground(Color.black);
        }
    }//GEN-LAST:event_txt_passFocusGained

    private void txt_passFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_passFocusLost
       
         if(txt_pass.getText().isEmpty()){
            txt_pass.setText("PASSWORD");
            txt_pass.setEchoChar('\0');
            txt_pass.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_txt_passFocusLost

    private void showPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPassActionPerformed
     
        if(showPass.isSelected()){
            txt_pass.setEchoChar('\0');
        }else{
            txt_pass.setEchoChar('\u2022');
        }
    }//GEN-LAST:event_showPassActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
      
        new SignUpForm().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void txt_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usernameActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
      
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

   
    
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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private classes.Button btn_login;
    private Panel.GradientPanel gradientPanel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JProgressBar jProgressBar1;
    private Panel.panelBorder panelBorder1;
    private javax.swing.JCheckBox showPass;
    private classes.Passwordfeild txt_pass;
    private classes.Textfield txt_username;
    // End of variables declaration//GEN-END:variables
}
