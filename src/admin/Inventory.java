/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package admin;

import classes.ScrollBar;

import connection.connect1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.sql.Statement;





public class Inventory extends javax.swing.JPanel {
    
     Connection con;
    PreparedStatement pst;
    ResultSet rs;
     
    
    public Inventory() {
        initComponents();
         con = connect1.con();
        
        
        scrollpane2.setVerticalScrollBar(new ScrollBar());
        edit_Btn.setEnabled(false);
        delete_Btn.setEnabled(false);
        
        
       
         try {
            pst = con.prepareCall("SELECT `product_id`, `product_name` , `price`, `stock` FROM `tbl_products` ");
            rs = pst.executeQuery();
            
            while(rs.next()){
            Object[] rowdata = new Object[4];
            
            for(int i = 0; i < 4; i++){
            
                rowdata[i] =rs.getObject(i+1);
            
            }
            tableProducts.addRow(rowdata);
            
            }
        } catch (SQLException ex) {  
            Logger.getLogger(DashboardPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
          
      
        ListSelectionModel selectionModel = tableProducts.getSelectionModel();
        selectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        selectionModel.addListSelectionListener(new ListSelectionListener() {
    @Override
    public void valueChanged(ListSelectionEvent e) {
        if (!e.getValueIsAdjusting()) { // To avoid multiple events being fired
            boolean rowSelected = tableProducts.getSelectedRow() != -1;

            // Enable/disable the buttons based on row selection
            edit_Btn.setEnabled(rowSelected);
            delete_Btn.setEnabled(rowSelected);
            add_Btn.setEnabled(!rowSelected);
        
              txt_prodID.setText("");
        
           
        }
        
        
    }
});

       
                // Get the next available ID from the database
           int nextId = NextProductIdFromDatabase();

           // Set the obtained ID in the JTextField
           txt_prodID.setText(String.valueOf(nextId)); 

       
        
    } 
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new Panel.panelBorder();
        scrollpane2 = new javax.swing.JScrollPane();
        tableProducts = new classes.Table();
        jLabel1 = new javax.swing.JLabel();
        txt_prodID = new javax.swing.JTextField();
        txt_price = new javax.swing.JTextField();
        txt_stock = new javax.swing.JTextField();
        txt_prodName = new javax.swing.JTextField();
        add_Btn = new classes.Button();
        delete_Btn = new classes.Button();
        edit_Btn = new classes.Button();
        clear_Btn = new classes.Button();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(242, 242, 242));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        scrollpane2.setBorder(null);

        tableProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Product Name", "Price", "Stock"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollpane2.setViewportView(tableProducts);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("PRODUCTS");

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollpane2, javax.swing.GroupLayout.DEFAULT_SIZE, 935, Short.MAX_VALUE)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollpane2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );

        txt_prodID.setEditable(false);
        txt_prodID.setFocusable(false);

        add_Btn.setText("ADD PRODUCT");
        add_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_BtnActionPerformed(evt);
            }
        });

        delete_Btn.setBackground(new java.awt.Color(248, 49, 9));
        delete_Btn.setText("DELETE PRODUCT");
        delete_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_BtnActionPerformed(evt);
            }
        });

        edit_Btn.setBackground(new java.awt.Color(16, 171, 9));
        edit_Btn.setText("EDIT PRODUCT");
        edit_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_BtnActionPerformed(evt);
            }
        });

        clear_Btn.setBackground(new java.awt.Color(249, 106, 6));
        clear_Btn.setText("CLEAR");
        clear_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_BtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Product ID");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Product Name");

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Price");

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Stock");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(add_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(edit_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(delete_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(clear_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_prodID, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_prodName, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_price, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_stock, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_prodID, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_price, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_prodName, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_stock, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(103, 103, 103)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(add_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(delete_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(clear_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(edit_Btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        tableProducts.clearSelection();
        
         // Get the next available ID from the database
           int nextId = NextProductIdFromDatabase();

           // Set the obtained ID in the JTextField
           txt_prodID.setText(String.valueOf(nextId)); 
           txt_prodName.setText("");
           txt_price.setText("");
           txt_stock.setText("");
           edit_Btn.setText("EDIT PRODUCT");
           
            tableProducts.setEnabled(true);
           tableProducts.setFocusable(true);

    }//GEN-LAST:event_formMouseClicked

    private void edit_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_BtnActionPerformed
      
   if(edit_Btn.getText().equals("EDIT PRODUCT")){
      
             int selectedrow  =tableProducts.getSelectedRow();
              
             if (selectedrow != -1) {
               
                 Object[] rowData = new Object[4];

             for (int i = 0; i < 4; i++) {
                rowData[i] =  tableProducts.getValueAt(selectedrow, i);
                 }

                     txt_prodID.setText(rowData[0].toString());
                     txt_prodName.setText(rowData[1].toString());
                     txt_price.setText(rowData[2].toString());
                     txt_stock.setText(rowData[3].toString());
    
   
        }
     edit_Btn.setText("SAVE PRODUCT");
     
     tableProducts.setEnabled(false);
        tableProducts.setFocusable(false);
      
   }
   else if(edit_Btn.getText().equals("SAVE PRODUCT")){
    
        con = connect1.con();
        
         int Id = Integer.parseInt(txt_prodID.getText());
         String name = null ;
         double price = 0;
         int stock = 0;
       
         if (!txt_prodName.getText().isEmpty()) {
             name = txt_prodName.getText();
             if (!txt_price.getText().isEmpty() && txt_price.getText().matches("^[-+]?\\d*\\.\\d+$")) {
                 price = Double.parseDouble(txt_price.getText());
                 if (!txt_stock.getText().isEmpty() && txt_stock.getText().matches("^[-+]?\\d+$")) {
                     stock = Integer.parseInt(txt_stock.getText());
                     
                           
                                
                                updateProduct(name, stock, price, Id);
                            

                                 loadDatafromDataBase();

                                 txt_prodID.setText("");
                                 txt_prodName.setText("");
                                 txt_price.setText("");
                                 txt_stock.setText("");

                                 edit_Btn.setText("EDIT PRODUCT");

                                 
                                            // Get the next available ID from the database
                                                int nextId = NextProductIdFromDatabase();

                                                // Set the obtained ID in the JTextField
                                                txt_prodID.setText(String.valueOf(nextId)); 
                                               
                                                
                                       tableProducts.setEnabled(true);
                                   tableProducts.setFocusable(true);
                            
                      } else {
                    JOptionPane.showMessageDialog(null, "Invalid. Stock must not Empty and Dont have letters.");
           
                 }
             } else {
                  JOptionPane.showMessageDialog(null, "Invalid. Price must not Empty and Dont have letters.");
             }
           
       } else {
             JOptionPane.showMessageDialog(null, "Product name is Empty.");
       }
         
       
    
    }
    
 
    }//GEN-LAST:event_edit_BtnActionPerformed

    private void add_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_BtnActionPerformed
     
   
       
          if (!txt_prodName.getText().isEmpty()) {
            
             if (!txt_price.getText().isEmpty() && txt_price.getText().matches("^[-+]?\\d*\\.\\d+$")) {
               
                 if (!txt_stock.getText().isEmpty() && txt_stock.getText().matches("^[-+]?\\d+$")) {
                   
                            
                            String name = txt_prodName.getText();
                            double price = Double.parseDouble(txt_price.getText());
                            int stock = Integer.parseInt(txt_stock.getText());

                           if (!isProductAlreadyExists(name)) {
                             // Product does not exist, proceed with insertion
                                     insertProduct(name, stock, price);
                           

                                 loadDatafromDataBase();
                           
                                 
                                 txt_prodID.setText("");
                                 txt_prodName.setText("");
                                 txt_price.setText("");
                                 txt_stock.setText("");

                                 
                                        // Get the next available ID from the database
                                        int nextId = NextProductIdFromDatabase();

                                        // Set the obtained ID in the JTextField
                                        txt_prodID.setText(String.valueOf(nextId)); 

                           }  else {
                    JOptionPane.showMessageDialog(null, "Product with the same name already exists.");
                }

                  } else {
                            JOptionPane.showMessageDialog(null, "Invalid. Stock must not Empty and Dont have letters.");
           
                 }
             } else {
                  JOptionPane.showMessageDialog(null, "Invalid. Price must not Empty and Dont have letters.");
             }
           
       } else {
             JOptionPane.showMessageDialog(null, "Product name is Empty.");
       }
        
         
          
    }//GEN-LAST:event_add_BtnActionPerformed

    private void delete_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_BtnActionPerformed
       
         int confirmation = JOptionPane.showConfirmDialog(
        null, "Are you sure you want to delete this product from the table?", "Confirm", JOptionPane.YES_NO_OPTION
    );

    if (confirmation == JOptionPane.YES_OPTION) {
        deleteTableData();
        loadDatafromDataBase(); 
    } 
        
                                    tableProducts.clearSelection();
                                // Get the next available ID from the database
                                   int nextId = NextProductIdFromDatabase();

                                   // Set the obtained ID in the JTextField
                                   txt_prodID.setText(String.valueOf(nextId)); 

    }//GEN-LAST:event_delete_BtnActionPerformed

    private void clear_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_BtnActionPerformed
       
          int confirmation = JOptionPane.showConfirmDialog(
        null, "Are you sure you want to clear the data from the table?", "Confirm", JOptionPane.YES_NO_OPTION
    );

    if (confirmation == JOptionPane.YES_OPTION) {
        clearTableData();
        loadDatafromDataBase(); 
    } 
        
    }//GEN-LAST:event_clear_BtnActionPerformed

    
    
     private void loadDatafromDataBase(){
     
         con = connect1.con();
         
         DefaultTableModel model = (DefaultTableModel) tableProducts.getModel();
         model.setRowCount(0);
         
           try {
            pst = con.prepareCall("SELECT `product_id`, `product_name` , `price`, `stock` FROM `tbl_products` ");
            rs = pst.executeQuery();
                
            while(rs.next()){
            Object[] rowdata = new Object[4];
            
            for(int i = 0; i < 4; i++){
            
                rowdata[i] =rs.getObject(i+1);
            
            }
            model.addRow(rowdata);
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
         
     }
    
     
     

     
    private int NextProductIdFromDatabase() {
    int nextId = 0;

    try {
        // Get the auto-increment value for the table
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SHOW TABLE STATUS LIKE 'tbl_products'");
        
        if (rs.next()) {
            nextId = rs.getInt("Auto_increment");
        }

        stmt.close();
    } catch (SQLException ex) {
        Logger.getLogger(Inventory.class.getName()).log(Level.SEVERE, null, ex);
    }

    return nextId;
}


private boolean isProductAlreadyExists(String productName) {
    String sql = "SELECT COUNT(*) FROM tbl_products WHERE product_name = ?";
    try (PreparedStatement statement = con.prepareStatement(sql)) {
        statement.setString(1, productName);
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


private void insertProduct(String name, int stock, double price) {
    String sql = "INSERT INTO `tbl_products`( `product_name`, `stock`, `price`) VALUES (?,?,?)";
    try (PreparedStatement statement = con.prepareStatement(sql)) {
        statement.setString(1, name);
        statement.setInt(2, stock);
        statement.setDouble(3, price);
        statement.executeUpdate();
    } catch (SQLException ex) {
        Logger.getLogger(Inventory.class.getName()).log(Level.SEVERE, null, ex);
    }
}


private void updateProduct(String name, int stock, double price, int Id) {
    String sql = "UPDATE tbl_products SET product_name = ?,stock = ?, price = ?  WHERE product_id= ?";
    try (PreparedStatement statement = con.prepareStatement(sql)) {
         statement.setString(1, name);
         statement.setInt(2, stock);
         statement.setDouble(3, price);
         statement.setInt(4, Id);

            statement.executeUpdate();
            
    } catch (SQLException ex) {
        Logger.getLogger(Inventory.class.getName()).log(Level.SEVERE, null, ex);
    }
}

private void clearTableData() {
    String sql = "DELETE FROM tbl_products";
    
    try (PreparedStatement statement = con.prepareStatement(sql)) {
        statement.executeUpdate();
        JOptionPane.showMessageDialog(null, "All data cleared from the table.");
        
        // Refresh the table after clearing data
        loadDatafromDataBase();
    } catch (SQLException ex) {
        Logger.getLogger(Inventory.class.getName()).log(Level.SEVERE, null, ex);
    }
}

private void deleteTableData(){

      int selectedRow = tableProducts.getSelectedRow();

              
                    // Extract information from the selected row
                    int productId = (int) tableProducts.getValueAt(selectedRow, 0);

                    // Construct the SQL DELETE statement
                    String sql = "DELETE FROM tbl_products WHERE product_id = ?";

                    try (PreparedStatement statement = con.prepareStatement(sql)) {
                        // Set the parameter in the DELETE statement
                        statement.setInt(1, productId);

                        // Execute the DELETE statement
                        statement.executeUpdate();

                        // Remove the selected row from the JTable model
                        DefaultTableModel model = (DefaultTableModel) tableProducts.getModel();
                        model.removeRow(selectedRow);

                      
       
                    
                    } catch (SQLException ex) {
                        Logger.getLogger(Inventory.class.getName()).log(Level.SEVERE, null, ex);
                    }


}



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private classes.Button add_Btn;
    private classes.Button clear_Btn;
    private classes.Button delete_Btn;
    private classes.Button edit_Btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private Panel.panelBorder panelBorder1;
    private javax.swing.JScrollPane scrollpane2;
    private classes.Table tableProducts;
    private javax.swing.JTextField txt_price;
    private javax.swing.JTextField txt_prodID;
    private javax.swing.JTextField txt_prodName;
    private javax.swing.JTextField txt_stock;
    // End of variables declaration//GEN-END:variables
}
