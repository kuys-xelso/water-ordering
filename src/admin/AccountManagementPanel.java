/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package admin;

import classes.ScrollBar;
import connection.connect1;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author gardh
 */
public class AccountManagementPanel extends javax.swing.JPanel {

    Connection con ;
    PreparedStatement pst;
    ResultSet rs;
    String acctype = "";
    
    public AccountManagementPanel() {
        initComponents();
        scrollpane3.setVerticalScrollBar(new ScrollBar());
        editUserBtn.setEnabled(false);
        delUserBtn.setEnabled(false);
        
        
        con = connect1.con();
        
        try {
          pst = con.prepareCall("SELECT tbl_user_accounts.user_id, tbl_customer.fullname, tbl_customer.address, "
                    + "tbl_customer.contact_number, tbl_user_accounts.username, tbl_user_accounts.password, tbl_user_accounts.account_type FROM tbl_user_accounts INNER JOIN tbl_customer "
                    + "ON tbl_user_accounts.user_id = tbl_customer.user_id");

          
          rs = pst.executeQuery();
            
            while(rs.next()){
                 Object[] rowdata = new Object[7];
                 
                 for(int i = 0; i < 7; i++){
            
                rowdata[i] =rs.getObject(i+1);
            
            }
            tableUsers.addRow(rowdata);
            
            
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(AccountManagementPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
              ListSelectionModel selectionModel = tableUsers.getSelectionModel();
        selectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        selectionModel.addListSelectionListener(new ListSelectionListener() {
    @Override
    public void valueChanged(ListSelectionEvent e) {
        if (!e.getValueIsAdjusting()) { // To avoid multiple events being fired
            boolean rowSelected = tableUsers.getSelectedRow() != -1;

            // Enable/disable the buttons based on row selection
            editUserBtn.setEnabled(rowSelected);
            delUserBtn.setEnabled(rowSelected);
            addUserBtn.setEnabled(!rowSelected);
        
              txt_userId.setText("");
        
           
        }
        
        
    }
});

        int nextId = NextUserIdFromDatabase();

           // Set the obtained ID in the JTextField
           txt_userId.setText(String.valueOf(nextId)); 

        
        
    }

    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new Panel.panelBorder();
        scrollpane3 = new javax.swing.JScrollPane();
        tableUsers = new classes.Table();
        jLabel1 = new javax.swing.JLabel();
        txt_userId = new javax.swing.JTextField();
        txt_fullName = new javax.swing.JTextField();
        txt_address = new javax.swing.JTextField();
        txt_contact = new javax.swing.JTextField();
        txt_username = new javax.swing.JTextField();
        txt_password = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        addUserBtn = new classes.Button();
        editUserBtn = new classes.Button();
        delUserBtn = new classes.Button();
        clearUserBtn = new classes.Button();
        acctypeCombobx = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(242, 242, 242));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        scrollpane3.setBorder(null);

        tableUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User ID", "Fullname", "Address", "Contact Number", "Username", "Password", "Account Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollpane3.setViewportView(tableUsers);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("USER ACCOUNTS");

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollpane3, javax.swing.GroupLayout.DEFAULT_SIZE, 934, Short.MAX_VALUE)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollpane3, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        txt_userId.setEditable(false);
        txt_userId.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txt_userId.setFocusable(false);

        txt_fullName.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        txt_address.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        txt_contact.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        txt_username.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txt_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usernameActionPerformed(evt);
            }
        });

        txt_password.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("User ID");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Fullname");

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Contact Number");

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Username");

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Address");

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Password");

        addUserBtn.setText("ADD USER");
        addUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserBtnActionPerformed(evt);
            }
        });

        editUserBtn.setBackground(new java.awt.Color(16, 171, 9));
        editUserBtn.setText("EDIT USER");
        editUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editUserBtnActionPerformed(evt);
            }
        });

        delUserBtn.setBackground(new java.awt.Color(248, 49, 9));
        delUserBtn.setText("DELETE USER");
        delUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delUserBtnActionPerformed(evt);
            }
        });

        clearUserBtn.setBackground(new java.awt.Color(249, 106, 6));
        clearUserBtn.setText("CLEAR");
        clearUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearUserBtnActionPerformed(evt);
            }
        });

        acctypeCombobx.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        acctypeCombobx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "RESELLER", "DIRECT CLIENT" }));
        acctypeCombobx.setBorder(null);
        acctypeCombobx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acctypeCombobxActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("ACCOUNT TYPE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(editUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_address, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt_fullName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_userId, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(txt_contact)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(acctypeCombobx, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_username, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                                    .addComponent(txt_password))
                                .addGap(92, 92, 92))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(delUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                .addComponent(clearUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_userId, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_fullName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_address, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(acctypeCombobx, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_contact, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void delUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delUserBtnActionPerformed
      
         int confirmation = JOptionPane.showConfirmDialog(
        null, "Are you sure you want to delete this user from the table?", "Confirm", JOptionPane.YES_NO_OPTION
    );

                    if (confirmation == JOptionPane.YES_OPTION) {
                        deleteTableDataUser();
                        loadDatafromDataBase(); 
                    } 

                                    tableUsers.clearSelection();
                                // Get the next available ID from the database
                                   int nextId = NextUserIdFromDatabase();

                                   // Set the obtained ID in the JTextField
                                   txt_userId.setText(String.valueOf(nextId)); 
    }//GEN-LAST:event_delUserBtnActionPerformed

    private void txt_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usernameActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
      
         tableUsers.clearSelection();
        
         // Get the next available ID from the database
           int nextId = NextUserIdFromDatabase();

           // Set the obtained ID in the JTextField
           txt_userId.setText(String.valueOf(nextId)); 
           txt_fullName.setText("");
           txt_address.setText("");
           txt_contact.setText("");
           txt_username.setText("");
           txt_password.setText("");
           editUserBtn.setText("EDIT USER");
           
           tableUsers.setEnabled(true);
           tableUsers.setFocusable(true);

    }//GEN-LAST:event_formMouseClicked

    private void editUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editUserBtnActionPerformed
       
        if(editUserBtn.getText().equals("EDIT USER")){
             int selectedrow  =tableUsers.getSelectedRow();
             if (selectedrow != -1) {
                 Object[] rowData = new Object[7];

             for (int i = 0; i < 7; i++) {
                rowData[i] =  tableUsers.getValueAt(selectedrow, i);
                 }

                     txt_userId.setText(rowData[0].toString());
                     txt_fullName.setText(rowData[1].toString());
                     txt_address.setText(rowData[2].toString());
                     txt_contact.setText(rowData[3].toString());
                     txt_username.setText(rowData[4].toString());
                     txt_password.setText(rowData[5].toString());
                    
                     if(rowData[6].toString().equals("RESELLER")){
                            acctypeCombobx.setSelectedIndex(1);
                     }
                     else if(rowData[6].toString().equals("DIRECT CLIENT")){
                              acctypeCombobx.setSelectedIndex(2);
                     }
                  
    
   
        }
     editUserBtn.setText("SAVE USER");
     
     tableUsers.setEnabled(false);
     tableUsers.setFocusable(false);
    
   }
   else if(editUserBtn.getText().equals("SAVE USER")){
    
        con = connect1.con();
        
         int Id = Integer.parseInt(txt_userId.getText());
         String name = null ;
         String address;
         String contact;
         String username;
         String password;
       
         if (!txt_fullName.getText().isEmpty()) {
             name = txt_fullName.getText();
             if (!txt_address.getText().isEmpty()) {
                address = txt_address.getText();
                 if (!txt_contact.getText().isEmpty() && txt_contact.getText().matches("^[-+]?\\d+$")) {
                     contact = txt_contact.getText();
                     if(!txt_username.getText().isEmpty()){
                         username = txt_contact.getText();
                         if(!txt_password.getText().isEmpty()){
                              password = txt_contact.getText(); 
                             if(!acctype.isBlank()){
                    
                     
                                 

                            
                                
                                updateUser(name, address, contact,username,password,acctype, Id);
                            

                                 loadDatafromDataBase();

                                 txt_userId.setText("");
                                 txt_fullName.setText("");
                                 txt_address.setText("");
                                 txt_contact.setText("");
                                 txt_username.setText("");
                                 txt_password.setText("");

                                 editUserBtn.setText("EDIT USER");

                                 
                                            // Get the next available ID from the database
                                                int nextId = NextUserIdFromDatabase();

                                                // Set the obtained ID in the JTextField
                                                txt_userId.setText(String.valueOf(nextId)); 

                             
                             tableUsers.setEnabled(true);
                        tableUsers.setFocusable(true);
                            
                            
                            
                            
                            
                            }else{
                           JOptionPane.showMessageDialog(null, "Password is Empty.");
                                 }  
                           }else{
                         JOptionPane.showMessageDialog(null, "Password is Empty.");
                       }
                    }else{
                    JOptionPane.showMessageDialog(null, "Username is empty.");
                         }
                 } else {
                JOptionPane.showMessageDialog(null, "Contact is empty or have letters");
                 }
             } else {
                  JOptionPane.showMessageDialog(null, "Address is Empty.");
             }
       } else {
             JOptionPane.showMessageDialog(null, "Fullname is Empty.");
       }
         
       
    
         }
   
    
      
    }//GEN-LAST:event_editUserBtnActionPerformed

    private void acctypeCombobxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acctypeCombobxActionPerformed
        
          switch (acctypeCombobx.getSelectedIndex()) {
            case 1:
                acctype = acctypeCombobx.getSelectedItem().toString();
                break;
            case 2:
                acctype = acctypeCombobx.getSelectedItem().toString();
                break;
           
            default:
                acctype ="";
                break;
        }
        
    }//GEN-LAST:event_acctypeCombobxActionPerformed

    private void clearUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearUserBtnActionPerformed
       
              int confirmation = JOptionPane.showConfirmDialog(
        null, "Are you sure you want to clear all data from the table?", "Confirm", JOptionPane.YES_NO_OPTION
    );

                                if (confirmation == JOptionPane.YES_OPTION) {
                                    clearTableDataUser();
                                } 
    }//GEN-LAST:event_clearUserBtnActionPerformed

    private void addUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserBtnActionPerformed
       
          if (!txt_fullName.getText().isEmpty()) {
             if (!txt_address.getText().isEmpty()) {
                 if (!txt_contact.getText().isEmpty() && txt_contact.getText().matches("^[-+]?\\d+$")) {
                     if(!txt_username.getText().isEmpty()){
                         if(!txt_password.getText().isEmpty()){
                             if(!acctype.isBlank()){
                    
                                 int id = Integer.parseInt(txt_userId.getText());
                                 String name = txt_fullName.getText();
                                 String addrss = txt_address.getText();
                                 String contacNo = txt_contact.getText();
                                 String uname = txt_username.getText();
                                 String password = txt_password.getText();
                                 
                                    if(!isUserAlreadyExists(name)){
                                    
                                    
                                        insertUser(name, addrss, contacNo, 
                                                uname, password, acctype,id);
                                
                            
                                 loadDatafromDataBase();

                                 txt_userId.setText("");
                                 txt_fullName.setText("");
                                 txt_address.setText("");
                                 txt_contact.setText("");
                                 txt_username.setText("");
                                 txt_password.setText("");

                              

                                 
                                            // Get the next available ID from the database
                                                int nextId = NextUserIdFromDatabase();

                                                // Set the obtained ID in the JTextField
                                                txt_userId.setText(String.valueOf(nextId)); 

                             
                             tableUsers.setEnabled(true);
                        tableUsers.setFocusable(true);
                            
                              }  else {
                    JOptionPane.showMessageDialog(null, "Product with the same name already exists.");
                }
                            
                            
                            
                            }else{
                           JOptionPane.showMessageDialog(null, "Account type is empty.");
                                 }  
                           }else{
                         JOptionPane.showMessageDialog(null, "Password is Empty.");
                       }
                    }else{
                    JOptionPane.showMessageDialog(null, "Username is empty.");
                         }
                 } else {
                JOptionPane.showMessageDialog(null, "Contact is empty or have letters");
                 }
             } else {
                  JOptionPane.showMessageDialog(null, "Address is Empty.");
             }
       } else {
             JOptionPane.showMessageDialog(null, "Fullname is Empty.");
       }
        
    }//GEN-LAST:event_addUserBtnActionPerformed

        
    
    
     private void loadDatafromDataBase(){
     
         con = connect1.con();
         
         DefaultTableModel model = (DefaultTableModel) tableUsers.getModel();
         model.setRowCount(0);
         
           try {
            pst = con.prepareCall("SELECT tbl_user_accounts.user_id, tbl_customer.fullname, tbl_customer.address, "
                    + "tbl_customer.contact_number, tbl_user_accounts.username, tbl_user_accounts.password, tbl_user_accounts.account_type FROM tbl_user_accounts INNER JOIN tbl_customer "
                    + "ON tbl_user_accounts.user_id = tbl_customer.user_id");
            rs = pst.executeQuery();
            
           while(rs.next()){
                 Object[] rowdata = new Object[7];
                 
                 for(int i = 0; i < 7; i++){
            
                rowdata[i] =rs.getObject(i+1);
            
            }
            model.addRow(rowdata);
            
            
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(DashboardPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
         
     }
    
     
     

     
    private int NextUserIdFromDatabase() {
    int nextId = 0;

    try {
        // Get the auto-increment value for the table
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SHOW TABLE STATUS LIKE 'tbl_user_accounts'");
        
        if (rs.next()) {
            nextId = rs.getInt("Auto_increment");   
        }

        stmt.close();
    } catch (SQLException ex) {
        Logger.getLogger(Inventory.class.getName()).log(Level.SEVERE, null, ex);
    }

    return nextId;
}


private boolean isUserAlreadyExists(String fullName) {
    String sql = "SELECT COUNT(*) FROM tbl_customer WHERE fullname = ?";
    try (PreparedStatement statement = con.prepareStatement(sql)) {
        statement.setString(1, fullName);
        try (ResultSet rs = statement.executeQuery()) {
            if (rs.next()) {
                int count = rs.getInt(1);
                return count > 0;
            }
        }
    } catch (SQLException ex) {
        Logger.getLogger(Inventory.class.getName()).log(Level.SEVERE, null, ex);
    }
    return false;
}


private void insertUser(String fullname, String address, String contact, String usrname, String pass,String account_type, int id) {
    String sql = "INSERT INTO `tbl_user_accounts` ( `username`, `password` , `account_type` )  VALUES (?,?,?)" ;
    try (PreparedStatement statement = con.prepareStatement(sql)) {
        statement.setString(1, usrname);
        statement.setString(2, pass);
        statement.setString(3, account_type);
        statement.executeUpdate();
       
             try {
             String sql1 =   "INSERT INTO `tbl_customer`( `fullname`, `address`,`contact_number`,`user_id`) VALUES (?,?,?,?)";
            PreparedStatement statement1 = con.prepareStatement(sql1);
                statement1.setString(1, fullname);
                statement1.setString(2, address);
                statement1.setString(3, contact);
                statement1.setInt(4, id);
                
                
                 statement1.executeUpdate();
                 
                   } catch (SQLException ex) {
              Logger.getLogger(Inventory.class.getName()).log(Level.SEVERE, null, ex);
     
        }
        
    } catch (SQLException ex) {
        Logger.getLogger(Inventory.class.getName()).log(Level.SEVERE, null, ex);
    }
}


private void updateUser(String name, String addrss, String contact, String usrname, String pass, String account_type, int user_id) {
    String sql = "UPDATE tbl_customer SET fullname = ?, address = ?, contact_number = ? WHERE user_id= ?";
    try (PreparedStatement statement = con.prepareStatement(sql)) {
         statement.setString(1, name);
         statement.setString(2, addrss);
         statement.setString(3, contact);
         statement.setInt(4, user_id);

            statement.executeUpdate();
            
            try {
             String sql1 =  "UPDATE tbl_user_accounts SET username = ?, password =?, account_type = ? WHERE user_id = ?" ;
            PreparedStatement statement1 = con.prepareStatement(sql1);
                statement1.setString(1, usrname);
                statement1.setString(2, pass);
                statement1.setString(3, account_type);
                statement1.setInt(4, user_id);
                
                 statement1.executeUpdate();
           
        } catch (SQLException ex) {
              Logger.getLogger(Inventory.class.getName()).log(Level.SEVERE, null, ex);
     
        }
            
    } catch (SQLException ex) {
        Logger.getLogger(Inventory.class.getName()).log(Level.SEVERE, null, ex);
    }
}

private void clearTableDataUser() {
    String sql = "DELETE FROM tbl_user_accounts";
    
    try (PreparedStatement statement = con.prepareStatement(sql)) {
        statement.executeUpdate();
        JOptionPane.showMessageDialog(null, "All data cleared from the table.");
        
        // Refresh the table after clearing data
        loadDatafromDataBase();
    } catch (SQLException ex) {
        Logger.getLogger(Inventory.class.getName()).log(Level.SEVERE, null, ex);
    }
}


private void deleteTableDataUser(){

 int selectedRow = tableUsers.getSelectedRow();

              
                    // Extract information from the selected row
                    int userId = (int) tableUsers.getValueAt(selectedRow, 0);

                    // Construct the SQL DELETE statement
                    String sql = "DELETE FROM tbl_user_accounts WHERE user_id = ?";

                    try (PreparedStatement statement = con.prepareStatement(sql)) {
                        // Set the parameter in the DELETE statement
                        statement.setInt(1, userId);

                        // Execute the DELETE statement
                        statement.executeUpdate();

                        // Remove the selected row from the JTable model
                        DefaultTableModel model = (DefaultTableModel) tableUsers.getModel();
                        model.removeRow(selectedRow);

                      
                       
                    
                    } catch (SQLException ex) {
                        Logger.getLogger(Inventory.class.getName()).log(Level.SEVERE, null, ex);
                    }



}





    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> acctypeCombobx;
    private classes.Button addUserBtn;
    private classes.Button clearUserBtn;
    private classes.Button delUserBtn;
    private classes.Button editUserBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private Panel.panelBorder panelBorder1;
    private javax.swing.JScrollPane scrollpane3;
    private classes.Table tableUsers;
    private javax.swing.JTextField txt_address;
    private javax.swing.JTextField txt_contact;
    private javax.swing.JTextField txt_fullName;
    private javax.swing.JTextField txt_password;
    private javax.swing.JTextField txt_userId;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
