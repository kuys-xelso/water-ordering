/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Customer;

import classes.DataModel;
import classes.Model_card;
import classes.ScrollBar;
import connection.connect1;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingUtilities;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;




public class DashboardCustomerPanel extends javax.swing.JPanel {

    private int cID;
    private int id=0;
    
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
   String orderType ="";
    
    public DashboardCustomerPanel() {
        initComponents();
        id = DataModel.getDataID();
   
         addToCartBtn.setEnabled(false);
         
         editCart.setEnabled(false);
         removeItem.setEnabled(false);
         clearCart.setEnabled(false);
         checkOutBtn.setEnabled(false);
                     
        
        tableScroll.setVerticalScrollBar(new ScrollBar());
        tableScroll1.setVerticalScrollBar(new ScrollBar());
       
        purchaseSpinner.setValue(0);
        cartSpinner.setValue(0);
        
        con = connect1.con();
        
        try {
            pst = con.prepareCall("SELECT COUNT(*) FROM tbl_orders WHERE  customer_id =?;");
            pst.setInt(1, id);
            rs = pst.executeQuery();
         
            while(rs.next()){
                int i = rs.getInt(1);
                String value = String.valueOf(i);
            card1.setData(new Model_card("ORDERS",value));
        }
        } catch (Exception e) {
             e.printStackTrace();
        }
        
        
        
        try {
              pst = con.prepareCall("SELECT COUNT(*) FROM tbl_orders WHERE  status = ? AND customer_id = ?;");
              pst.setString(1, "DELIVERED");
              pst.setInt(2, id);
            rs = pst.executeQuery();
         
            while(rs.next()){
                int i = rs.getInt(1);
                String value = String.valueOf(i);
            card2.setData(new Model_card("DELIVERED",value));
        }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        
        
          try {
              pst = con.prepareCall("SELECT SUM(total_amount) FROM tbl_orders WHERE customer_id = ?;");
              pst.setInt(1, id);
            rs = pst.executeQuery();
         
            while(rs.next()){ 
                int i = rs.getInt(1);
                String value = String.valueOf(i);
            card3.setData(new Model_card("TOTAL PURCHASE","P   "+value));
        }
        } catch (SQLException e) {
            e.printStackTrace();
        }
          
        try {
            pst = con.prepareCall("SELECT `product_id`, `product_name` , `price` FROM `tbl_products` ");
            rs = pst.executeQuery();
            
            while(rs.next()){
            Object[] rowdata = new Object[3];
            
            for(int i = 0; i < 3; i++){
            
                rowdata[i] =rs.getObject(i+1);
            
            }
            table1.addRow(rowdata);
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardCustomerPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        

        
      
        ListSelectionModel selectionModel = table1.getSelectionModel();
        selectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        selectionModel.addListSelectionListener(new ListSelectionListener() {
    @Override
    public void valueChanged(ListSelectionEvent e) {
        if (!e.getValueIsAdjusting()) { // To avoid multiple events being fired
              int selectedRow = table1.getSelectedRow();
           
                    // Check if a valid selection is made
                    if (selectedRow != -1) {
                         addToCartBtn.setEnabled(true);
                        // Get the selected item from the table
                        Object selectedItem1 = table1.getValueAt(selectedRow, 1);
                        Object selectedItem2 = table1.getValueAt(selectedRow, 2);

                        // Set the selected item in the text field
                        prod_txt.setText(selectedItem1.toString());
                        prod_txt1.setText(selectedItem2.toString());
                        purchaseSpinner.setValue(1);
                               table2.clearSelection();
                               editCart.setEnabled(false);
                               removeItem.setEnabled(false);
                               clearCart.setEnabled(false);

                    }
        
        
    }
}
        });

        
    
        
        
          ListSelectionModel selectionModel1 = table2.getSelectionModel();
            selectionModel1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
           selectionModel1.addListSelectionListener(new ListSelectionListener() {
    @Override
    public void valueChanged(ListSelectionEvent e) {
        if (!e.getValueIsAdjusting()) { // To avoid multiple events being fired
              int selectedRow = table2.getSelectedRow();
                  
                    // Check if a valid selection is made
                    if (selectedRow != -1) {
            
                        
                         editCart.setEnabled(true);
                         removeItem.setEnabled(true);
                         clearCart.setEnabled(true);
                         table1.clearSelection();
                         addToCartBtn.setEnabled(false );

                        // Get the selected item from the table
                     
                      
                    
                    
                    }
        
        
    }
}
        });

      
          try {
            pst = con.prepareCall("SELECT customer_id FROM tbl_customer");
            rs = pst.executeQuery();
            
              while (rs.next()) {                  
                  cID = rs.getInt("customer_id");
              }
             
        } catch (Exception e) {
        }
      
    
    
    
    
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        card1 = new Panel.Card();
        card2 = new Panel.Card();
        card3 = new Panel.Card();
        panelBorder1 = new Panel.panelBorder();
        jLabel2 = new javax.swing.JLabel();
        panelBorder3 = new Panel.panelBorder();
        tableScroll = new javax.swing.JScrollPane();
        table1 = new classes.Table();
        addToCartBtn = new classes.Button();
        prod_txt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        prod_txt1 = new javax.swing.JTextField();
        purchaseSpinner = new classes.WholeNumberSpinner();
        panelBorder2 = new Panel.panelBorder();
        jLabel3 = new javax.swing.JLabel();
        removeItem = new classes.Button();
        editCart = new classes.Button();
        checkOutBtn = new classes.Button();
        jLabel4 = new javax.swing.JLabel();
        cartProd = new javax.swing.JTextField();
        clearCart = new classes.Button();
        jLabel5 = new javax.swing.JLabel();
        LABL = new javax.swing.JLabel();
        tableScroll1 = new javax.swing.JScrollPane();
        table2 = new classes.Table();
        amount_lbl = new javax.swing.JLabel();
        delivery = new javax.swing.JRadioButton();
        walkIn = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        cartSpinner = new classes.WholeNumberSpinner();

        jLabel1.setText("jLabel1");

        setBackground(new java.awt.Color(242, 242, 242));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jLayeredPane1.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        card1.setColor1(new java.awt.Color(79, 231, 134));
        card1.setColor2(new java.awt.Color(36, 217, 15));
        jLayeredPane1.add(card1);

        card2.setColor1(new java.awt.Color(74, 204, 249));
        card2.setColor2(new java.awt.Color(4, 87, 233));
        jLayeredPane1.add(card2);

        card3.setColor1(new java.awt.Color(249, 194, 86));
        card3.setColor2(new java.awt.Color(254, 175, 5));
        jLayeredPane1.add(card3);

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));
        panelBorder1.setForeground(new java.awt.Color(242, 242, 242));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Purchase Product");

        panelBorder3.setBackground(new java.awt.Color(229, 229, 229));

        tableScroll.setBorder(null);

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Product Name", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableScroll.setViewportView(table1);

        javax.swing.GroupLayout panelBorder3Layout = new javax.swing.GroupLayout(panelBorder3);
        panelBorder3.setLayout(panelBorder3Layout);
        panelBorder3Layout.setHorizontalGroup(
            panelBorder3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder3Layout.createSequentialGroup()
                .addComponent(tableScroll)
                .addContainerGap())
        );
        panelBorder3Layout.setVerticalGroup(
            panelBorder3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder3Layout.createSequentialGroup()
                .addGap(0, 16, Short.MAX_VALUE)
                .addComponent(tableScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        addToCartBtn.setBackground(new java.awt.Color(255, 102, 0));
        addToCartBtn.setText("ADD TO CART");
        addToCartBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCartBtnActionPerformed(evt);
            }
        });

        prod_txt.setEditable(false);
        prod_txt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        prod_txt.setFocusable(false);

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("PRODUCT");

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("QUANTITY");

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("PRICE");

        prod_txt1.setEditable(false);
        prod_txt1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        prod_txt1.setFocusable(false);

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelBorder3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelBorder1Layout.createSequentialGroup()
                                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(panelBorder1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(prod_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 190, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(prod_txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(purchaseSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addToCartBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBorder3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prod_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(prod_txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(purchaseSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(addToCartBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        panelBorder2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("My Cart");

        removeItem.setBackground(new java.awt.Color(236, 48, 54));
        removeItem.setText("REMOVE ITEM");
        removeItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeItemActionPerformed(evt);
            }
        });

        editCart.setText("EDIT ITEM");
        editCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editCartActionPerformed(evt);
            }
        });

        checkOutBtn.setBackground(new java.awt.Color(23, 193, 15));
        checkOutBtn.setText("CHECK OUT");
        checkOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkOutBtnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("QUANTITY");

        cartProd.setEditable(false);
        cartProd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cartProd.setFocusable(false);
        cartProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartProdActionPerformed(evt);
            }
        });

        clearCart.setBackground(new java.awt.Color(246, 169, 5));
        clearCart.setText("CLEAR CART");
        clearCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearCartActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("PRODUCT");

        LABL.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        LABL.setForeground(new java.awt.Color(0, 0, 0));
        LABL.setText("Amount:   P");

        tableScroll1.setBorder(null);

        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableScroll1.setViewportView(table2);

        amount_lbl.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        amount_lbl.setForeground(new java.awt.Color(0, 0, 0));

        buttonGroup1.add(delivery);
        delivery.setForeground(new java.awt.Color(0, 0, 0));
        delivery.setText("DELIVERY");
        delivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deliveryActionPerformed(evt);
            }
        });

        buttonGroup1.add(walkIn);
        walkIn.setForeground(new java.awt.Color(0, 0, 0));
        walkIn.setText("WALK IN");
        walkIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                walkInActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("ORDER TYPE");

        javax.swing.GroupLayout panelBorder2Layout = new javax.swing.GroupLayout(panelBorder2);
        panelBorder2.setLayout(panelBorder2Layout);
        panelBorder2Layout.setHorizontalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBorder2Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelBorder2Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(LABL, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(amount_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(15, 15, 15))
                                    .addGroup(panelBorder2Layout.createSequentialGroup()
                                        .addComponent(checkOutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 9, Short.MAX_VALUE)))
                                .addGap(27, 27, 27))
                            .addGroup(panelBorder2Layout.createSequentialGroup()
                                .addComponent(tableScroll1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cartProd, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel8)
                                    .addGroup(panelBorder2Layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(delivery, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(walkIn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cartSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addContainerGap())
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(panelBorder2Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(editCart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(removeItem, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(clearCart, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );
        panelBorder2Layout.setVerticalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cartProd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cartSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(walkIn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(delivery)
                        .addGap(0, 25, Short.MAX_VALUE))
                    .addComponent(tableScroll1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editCart, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearCart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(removeItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(amount_lbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LABL, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkOutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(16, Short.MAX_VALUE)
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 945, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelBorder2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBorder2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cartProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cartProdActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
       
        table1.clearSelection();
       
        
        
    }//GEN-LAST:event_formMouseClicked

    private void addToCartBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCartBtnActionPerformed
        
        
       String prod = prod_txt.getText();
       String quantity = purchaseSpinner.getValue().toString();
       String price = prod_txt1.getText();
       
     if (!prod.isEmpty()) {
        // Check if the product is already in the table
        int rowIndex = -1;
        for (int i = 0; i < table2.getRowCount(); i++) {
            String productName = table2.getValueAt(i, 0).toString().split(" x")[0];
            if (productName.equals(prod)) {
                rowIndex = i;
                break;
            }
        }
        
        if (rowIndex != -1) {
            
                 
 
     
            // Product is already in the table, add the quantity
            int oldQuantity = Integer.parseInt(table2.getValueAt(rowIndex, 0).toString().split(" x")[1].trim());
            int newQuantity = oldQuantity + Integer.parseInt(quantity);
           table2.setValueAt(prod + " x" + newQuantity, rowIndex, 0);
             
           
            
            prod_txt.setText("");
            prod_txt1.setText("");
            purchaseSpinner.setValue(0);
            addToCartBtn.setEnabled(false);
            
            table1.clearSelection();
            calculateTotalPrice();
            checkTable2();
        } else {
            // Product is not in the table, add a new row
            table2.addRow(new Object[]{prod + " x" + quantity, price});
            
             
                
            prod_txt.setText("");
            prod_txt1.setText("");
           purchaseSpinner.setValue(0);
            addToCartBtn.setEnabled(false);
            
            
                table1.clearSelection();
                
             calculateTotalPrice();
                    checkTable2();
                
        }
    } else {
        JOptionPane.showMessageDialog(null, "Empty text field. Choose a product.");
    }
       
       

       
    }//GEN-LAST:event_addToCartBtnActionPerformed

    private void editCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editCartActionPerformed
     
        int selectedRow = table2.getSelectedRow();
        
        if(editCart.getText().equals("EDIT ITEM")){
       
          String RowValue = table2.getValueAt(selectedRow,0).toString();
                         int quantity = Integer.parseInt(RowValue.split(" x")[1].trim());
                        Object selectedItem1 = RowValue.split(" x")[0].trim();

                        
        
                        
                        // Set the selected item in the text field
                       cartProd.setText(selectedItem1.toString());
                        cartSpinner.setValue(quantity);
                     
                        editCart.setText("SAVE ITEM");
                        table2.setEnabled(false);
                        table2.setFocusable(false);
                        
        }
       else if(editCart.getText().equals("SAVE ITEM")){
        
   
            String prod = cartProd.getText();
           String quantity  = cartSpinner.getValue().toString();
            table2.setValueAt(prod +" x" +quantity, selectedRow, 0);
        
            
          table2.setEnabled(true);
          table2.setFocusable(true);
          table2.clearSelection();
          editCart.setText("EDIT ITEM");
          cartSpinner.setValue(0);
            calculateTotalPrice();
        }
        
    }//GEN-LAST:event_editCartActionPerformed

    private void removeItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeItemActionPerformed
        DefaultTableModel model = (DefaultTableModel)table2.getModel();
       int selected = table2.getSelectedRow();
        if (selected != -1 ) {
            model.removeRow(selected);
               calculateTotalPrice();
        }
    }//GEN-LAST:event_removeItemActionPerformed

    private void clearCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearCartActionPerformed
       DefaultTableModel model = (DefaultTableModel)table2.getModel();
        
         int confirmation = JOptionPane.showConfirmDialog(
        null, "Are you sure you want to clear your Cart?", "Confirm", JOptionPane.YES_NO_OPTION
    );
           if (confirmation == JOptionPane.YES_OPTION) {
                      model.setRowCount(0);
                         calculateTotalPrice();
                                } 
    }//GEN-LAST:event_clearCartActionPerformed

    private void checkOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkOutBtnActionPerformed

        double price = 0;
        int id =0;
        
         ArrayList <String> productName = new ArrayList<>();
         ArrayList <Integer> productquantity = new ArrayList<>();
          
         
         if(!orderType.isEmpty()){
            
            
                  int orderid = 0;
                    try{
                        pst = con.prepareCall("INSERT INTO `tbl_orders`(`order_id`, `customer_id`, `order_date`, `total_amount`, `Status`) VALUES(null,?,current_timestamp,?,?)");
                        pst.setInt(1, cID);
                        pst.setDouble(2, 0);
                        pst.setString(3, "PENDING");
                        int rowsAffected = pst.executeUpdate();

                        if (rowsAffected>0) {                         
                                rs = pst.getGeneratedKeys();
                             if (rs.next()) {
                              orderid = rs.getInt(1);
                         
    }
                        }
        }catch (Exception e) {
                  e.printStackTrace();
            }
                 
          for (int i = 0; i < table2.getRowCount(); i++) {
         String name = table2.getValueAt(i, 0).toString().split(" x")[0];
         int quantity = Integer.parseInt(table2.getValueAt(i, 0).toString().split(" x")[1]);
         productName.add(name);
         productquantity.add(quantity);
          }
        
        for(int i = 0 ; i < productName.size() ; i++){
            double subtotal = 0;
            String prod = productName.get(i);
            int qty = productquantity.get(i);
        
            try {
                pst = con.prepareCall("SELECT `product_id`, `price` FROM tbl_products WHERE product_name = ?");
                pst.setString(1, prod);
                
                rs = pst.executeQuery();
                
                while(rs.next()){
            id = rs.getInt("product_id");
            price = rs.getDouble("price");
                }
                
        subtotal = price * qty; 
                try {
                    
                    
                    pst = con.prepareCall("INSERT INTO `tbl_orderdetails`(`orderDetails_id`, `order_id`, `product_id`, `quantity`, `subtotal`) VALUES(null,?,?,?,?)");
                    pst.setInt(1, orderid);
                    pst.setInt(2, id);
                    pst.setInt(3, qty);
                    pst.setDouble(4, subtotal);
                    
                    pst.executeUpdate();
                    
                    DataModel.setDataInt(orderid);
                    DataModel.setData(orderType);
                    
                    PlaceOrder porder = new PlaceOrder();
                    porder.setVisible(true);
                     JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(DashboardCustomerPanel.this);
                    topFrame.dispose();
                    
                } catch (SQLException e) {
                        e.printStackTrace();
                }
              
                
            } catch (SQLException e) {
                  e.printStackTrace();
            }
        }
        
               
            
        
         }else{
         JOptionPane.showMessageDialog(null, "Select OrderType.");
         }
    }//GEN-LAST:event_checkOutBtnActionPerformed

    private void walkInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_walkInActionPerformed
     
        if (walkIn.isSelected()) {
            orderType = "WALK IN";
        }
    }//GEN-LAST:event_walkInActionPerformed

    private void deliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deliveryActionPerformed
      
        
        if (delivery.isSelected()) {
            orderType = "DELIVERY";
        }
    }//GEN-LAST:event_deliveryActionPerformed
    
private void calculateTotalPrice() {
    TableModel model = table2.getModel();
    double totalPrice = 0.0;
    
    for (int i = 0; i < model.getRowCount(); i++) {
        String rowValue = model.getValueAt(i, 0).toString();
        int quantity = Integer.parseInt(rowValue.split(" x")[1].trim());
        double price = Double.parseDouble(model.getValueAt(i, 1).toString());
        double amount = quantity *price;
        totalPrice += amount;
    }
    
    DecimalFormat decimalFormat = new DecimalFormat("#.00");
    amount_lbl.setText(decimalFormat.format(totalPrice));
}

  private void checkTable2(){
      TableModel model =  table2.getModel();
      
      if(model.getRowCount()>0){
      checkOutBtn.setEnabled(true);
      
      }else{
       checkOutBtn.setEnabled(true);
      }
  
  }
  
  
   
   
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LABL;
    private classes.Button addToCartBtn;
    private javax.swing.JLabel amount_lbl;
    private javax.swing.ButtonGroup buttonGroup1;
    private Panel.Card card1;
    private Panel.Card card2;
    private Panel.Card card3;
    private javax.swing.JTextField cartProd;
    private classes.WholeNumberSpinner cartSpinner;
    private classes.Button checkOutBtn;
    private classes.Button clearCart;
    private javax.swing.JRadioButton delivery;
    private classes.Button editCart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private Panel.panelBorder panelBorder1;
    private Panel.panelBorder panelBorder2;
    private Panel.panelBorder panelBorder3;
    private javax.swing.JTextField prod_txt;
    private javax.swing.JTextField prod_txt1;
    private classes.WholeNumberSpinner purchaseSpinner;
    private classes.Button removeItem;
    private classes.Table table1;
    private classes.Table table2;
    private javax.swing.JScrollPane tableScroll;
    private javax.swing.JScrollPane tableScroll1;
    private javax.swing.JRadioButton walkIn;
    // End of variables declaration//GEN-END:variables
}
