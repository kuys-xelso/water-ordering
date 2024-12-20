/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Panel;


import connection.connect1;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JOptionPane;
import login.LoginFrame;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import login.SignUpForm;



/**
 *
 * @author gardh
 */
public class SignUpScroll extends javax.swing.JPanel {

    private String acctype = "";
    Connection con;
    PreparedStatement pst;
  
    
    
    public SignUpScroll() {
        setOpaque(false);
        initComponents();
        btn_signUp.requestFocus();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        txt_fullname = new classes.Textfield();
        supplierBtn = new javax.swing.JRadioButton();
        resellerBtn = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        txt_contactNo = new classes.Textfield();
        txt_address = new classes.Textfield();
        txt_pass = new classes.Passwordfeild();
        showPass = new javax.swing.JCheckBox();
        txt_Cpass = new classes.Passwordfeild();
        showCpass = new javax.swing.JCheckBox();
        btn_signUp = new classes.Button();
        lbl_login = new javax.swing.JLabel();
        txt_usernameSU = new classes.Textfield();

        jRadioButton1.setText("jRadioButton1");

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SignUp");

        txt_fullname.setText("FULLNAME");
        txt_fullname.setForeground(Color.GRAY);
        txt_fullname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_fullnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_fullnameFocusLost(evt);
            }
        });

        buttonGroup1.add(supplierBtn);
        supplierBtn.setForeground(new java.awt.Color(255, 255, 255));
        supplierBtn.setText("DIRECT CLIENT");
        supplierBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierBtnActionPerformed(evt);
            }
        });

        buttonGroup1.add(resellerBtn);
        resellerBtn.setForeground(new java.awt.Color(255, 255, 255));
        resellerBtn.setText("RESELLER");
        resellerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resellerBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("ACCOUNT TYPE");

        txt_contactNo.setText("CONTACT NUMBER");
        txt_contactNo.setForeground(Color.GRAY);
        txt_contactNo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_contactNoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_contactNoFocusLost(evt);
            }
        });

        txt_address.setText("ADDRESS");
        txt_address.setForeground(Color.GRAY);
        txt_address.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_addressFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_addressFocusLost(evt);
            }
        });

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

        showPass.setForeground(new java.awt.Color(255, 255, 255));
        showPass.setText("Show Password");
        showPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPassActionPerformed(evt);
            }
        });

        txt_Cpass.setText("CONFIRM PASSWORD");
        txt_Cpass.setForeground(Color.GRAY);
        txt_Cpass.setEchoChar('\0');
        txt_Cpass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_CpassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_CpassFocusLost(evt);
            }
        });
        txt_Cpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_CpassActionPerformed(evt);
            }
        });

        showCpass.setForeground(new java.awt.Color(255, 255, 255));
        showCpass.setText("Show Confirm Password");
        showCpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showCpassActionPerformed(evt);
            }
        });

        btn_signUp.setText("SignUp");
        btn_signUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signUpActionPerformed(evt);
            }
        });

        lbl_login.setForeground(new java.awt.Color(255, 255, 255));
        lbl_login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_login.setText("Already have an Account? Login here!");
        lbl_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_loginMouseClicked(evt);
            }
        });

        txt_usernameSU.setText("USERNAME");
        txt_usernameSU.setForeground(Color.GRAY);
        txt_usernameSU.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_usernameSUFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_usernameSUFocusLost(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(showPass)
                    .addComponent(txt_contactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showCpass)
                    .addComponent(btn_signUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_Cpass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_fullname, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                    .addComponent(supplierBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resellerBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_address, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                    .addComponent(txt_pass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_usernameSU, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                    .addComponent(lbl_login, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addComponent(txt_fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(supplierBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resellerBtn)
                .addGap(79, 79, 79)
                .addComponent(txt_contactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_address, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_usernameSU, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showPass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_Cpass, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showCpass)
                .addGap(36, 36, 36)
                .addComponent(btn_signUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(lbl_login)
                .addContainerGap(44, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_fullnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_fullnameFocusGained

        if(txt_fullname.getText().equals("FULLNAME")){
            txt_fullname.setText("");
            txt_fullname.setForeground(Color.BLACK );
        }
    }//GEN-LAST:event_txt_fullnameFocusGained

    private void txt_fullnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_fullnameFocusLost

        if(txt_fullname.getText().isEmpty()){
            txt_fullname.setText("FULLNAME");
            txt_fullname.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_txt_fullnameFocusLost

    private void resellerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resellerBtnActionPerformed
       
        if(resellerBtn.isSelected()){
        
            acctype = resellerBtn.getText();
            
        }
    }//GEN-LAST:event_resellerBtnActionPerformed

    private void txt_contactNoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_contactNoFocusGained
        
        if(txt_contactNo.getText().equals("CONTACT NUMBER")){
            txt_contactNo.setText("");
            txt_contactNo.setForeground(Color.BLACK );
        }

    }//GEN-LAST:event_txt_contactNoFocusGained

    private void txt_contactNoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_contactNoFocusLost
      
         if(txt_contactNo.getText().isEmpty()){
            txt_contactNo.setText("CONTACT NUMBER");
            txt_contactNo.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_txt_contactNoFocusLost

    private void txt_addressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_addressFocusGained
       
        if(txt_address.getText().equals("ADDRESS")){
            txt_address.setText("");
            txt_address.setForeground(Color.BLACK );
        }
    }//GEN-LAST:event_txt_addressFocusGained

    private void txt_addressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_addressFocusLost
       
        if(txt_address.getText().isEmpty()){
            txt_address.setText("ADDRESS");
            txt_address.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_txt_addressFocusLost

    
    
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

    private void txt_CpassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_CpassFocusGained
        
          if(txt_Cpass.getText().equals("CONFIRM PASSWORD")){
            txt_Cpass.setText("");
            txt_Cpass.setEchoChar('\u2022');
            txt_Cpass.setForeground(Color.black);
        }
    }//GEN-LAST:event_txt_CpassFocusGained

    private void txt_CpassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_CpassFocusLost
        
        
        if(txt_Cpass.getText().isEmpty()){
            txt_Cpass.setText("CONFIRM PASSWORD");
            txt_Cpass.setEchoChar('\0');
            txt_Cpass.setForeground(Color.GRAY);
        }
        
    }//GEN-LAST:event_txt_CpassFocusLost

  
    
    private void showCpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showCpassActionPerformed
       
        if(showCpass.isSelected()){
            txt_Cpass.setEchoChar('\0');
        }else{
            txt_Cpass.setEchoChar('\u2022');
        }
        
    }//GEN-LAST:event_showCpassActionPerformed

    private void btn_signUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signUpActionPerformed

       String fname = txt_fullname.getText();
      //String compName = txt_companyName.getText();
       String contact = txt_contactNo.getText();
       String address = txt_address.getText();
       String username = txt_usernameSU.getText();
       String pass = new String(txt_pass.getPassword());
       String cpass = new String(txt_Cpass.getPassword());
       
      if(!fname.equals("FULLNAME")){
           if( fname.matches("[a-zA-Z ]+")){
               if (!acctype.isEmpty()) {
                       if (!contact.equals("CONTACT NUMBER")) {
                           if (!address.equals("ADDRESS")) {
                               if(!username.equals("USERNAME")){
                               if (!pass.equals("PASSWORD")) {
                                   if (!cpass.equals("CONFIRM PASSWORD")) {
                                       if (cpass.equals(pass)) {
                                           
                                         con = connect1.con();
                                           
                                          
                                           try {
                                               
                                               pst = con.prepareCall("INSERT INTO tbl_user_accounts(`user_id`, `username`, `password`, `account_type`) VALUES(null,?,?,?)");
                                                
                                               pst.setString(1, username);
                                               pst.setString(2, pass);
                                               pst.setString(3, acctype);
                                              
                                             int affectedRows =   pst.executeUpdate();
                                                int user_id = 0;
                                                
                                               if (affectedRows > 0) {
                                                  
                                                   try (var rs = pst.getGeneratedKeys()){
                                                       
                                                     if (rs.next()) {
                                                    user_id = rs.getInt(1);
                                                   } else {
                                                        throw new SQLException("User ID retrieval failed.");
                                                             }
                                                            }

                                               } 
                    
                                      
                                                pst = con.prepareCall("INSERT INTO `tbl_customer`(`customer_id`, `fullname`, `address`, `contact_number`, `user_id`) VALUES (null,?,?,?,?)");
                                                
                                                pst.setString(1, fname);
                                                pst.setString(2, address);
                                                pst.setString(3, contact);
                                                pst.setInt(4, user_id);
                                              
                                              
                                                  pst.executeUpdate();
                                                   JOptionPane.showMessageDialog(null, "Account Created Succesfully");
                                                 
                                                  new LoginFrame().setVisible(true);
                                                  new SignUpForm().dispose();
                                              
                                                
                                               
                                                
                                              
                                                
                                                } catch (SQLException ex) {
                                               Logger.getLogger(SignUpScroll.class.getName()).log(Level.SEVERE, null, ex);
                                           }
                                           
                                           
                                           
                                       } else {
                                           JOptionPane.showMessageDialog(null, "Password and Confirm Password must be equal.");
                                    }
                                       
                                } else {
                                         JOptionPane.showMessageDialog(null, "Confirm Password is empty.");
                                   }
                            } else {
                                   JOptionPane.showMessageDialog(null, "Password is empty.");
                               }
                        }else{
                                JOptionPane.showMessageDialog(null, "Username is empty.");
                               }
                    } else {  
                               JOptionPane.showMessageDialog(null, "Address is empty.");
                           }
                 } else {
                           JOptionPane.showMessageDialog(null, "Contact Number is empty.");
                       }
             } else {
                   JOptionPane.showMessageDialog(null, "Account type is empty.");
               }
         }else{
               JOptionPane.showMessageDialog(null, "Fullname is invalid.");
           }
      }else{
           JOptionPane.showMessageDialog(null, "Fullname is empty.");
       }
       
       
       
       
       
       
       
       
       
       
    }//GEN-LAST:event_btn_signUpActionPerformed

    private void txt_usernameSUFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_usernameSUFocusGained
      
           if(txt_usernameSU.getText().equals("USERNAME")){
            txt_usernameSU.setText("");
            txt_usernameSU.setForeground(Color.BLACK );
        }
    }//GEN-LAST:event_txt_usernameSUFocusGained

    private void txt_usernameSUFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_usernameSUFocusLost
        
         if(txt_usernameSU.getText().isEmpty()){
            txt_usernameSU.setText("USERNAME");
            txt_usernameSU.setForeground(Color.GRAY);
        } 
    }//GEN-LAST:event_txt_usernameSUFocusLost

    private void txt_CpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_CpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_CpassActionPerformed

    private void lbl_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_loginMouseClicked
        new LoginFrame().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lbl_loginMouseClicked

    private void supplierBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierBtnActionPerformed
      
        if(supplierBtn.isSelected()){
            acctype = supplierBtn.getText();
       
            
        }
    }//GEN-LAST:event_supplierBtnActionPerformed

 protected void paintChildren(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g = new GradientPaint(0, 0, Color.decode("#1CB5E0"), 0, getHeight(), Color.decode("#000046"));
        g2.setPaint(g);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.fillRect(getWidth() - 20, 0, getWidth() , getHeight());
        super.paintChildren(grphcs);
    }
 
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private classes.Button btn_signUp;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JLabel lbl_login;
    private javax.swing.JRadioButton resellerBtn;
    private javax.swing.JCheckBox showCpass;
    private javax.swing.JCheckBox showPass;
    private javax.swing.JRadioButton supplierBtn;
    private classes.Passwordfeild txt_Cpass;
    private classes.Textfield txt_address;
    private classes.Textfield txt_contactNo;
    private classes.Textfield txt_fullname;
    private classes.Passwordfeild txt_pass;
    private classes.Textfield txt_usernameSU;
    // End of variables declaration//GEN-END:variables
}
