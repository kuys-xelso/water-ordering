/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package admin;

import classes.Model_card;
import classes.ScrollBar;
import connection.connect1;
import java.awt.Container;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JTable;




public class DashboardPanel extends javax.swing.JPanel {

    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
      
    
    public DashboardPanel() {
        initComponents();
        
        tableScroll.setVerticalScrollBar(new ScrollBar());
        
        con = connect1.con();
        
        try {
            pst = con.prepareCall("SELECT COUNT(*) FROM tbl_user_accounts WHERE user_id>1;");
            rs = pst.executeQuery();
         
            while(rs.next()){
                int i = rs.getInt(1);
                String value = String.valueOf(i);
            card1.setData(new Model_card("TOTAL ACCOUNTS",value));
        }
        } catch (Exception e) {
             e.printStackTrace();
        }
        
        
        
        try {
              pst = con.prepareCall("SELECT COUNT(*) FROM tbl_products;");
            rs = pst.executeQuery();
         
            while(rs.next()){
                int i = rs.getInt(1);
                String value = String.valueOf(i);
            card2.setData(new Model_card("TOTAL PRODUCTS",value));
        }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
          try {
              pst = con.prepareCall("SELECT COUNT(*) FROM tbl_orders;");
            rs = pst.executeQuery();
         
            while(rs.next()){ 
                int i = rs.getInt(1);
                String value = String.valueOf(i);
            card3.setData(new Model_card("TOTAL ORDERS",value));
        }
        } catch (Exception e) {
            e.printStackTrace();
        }
          
        try {
            pst = con.prepareCall("SELECT `product_id`, `product_name` , `price`, `stock` FROM `tbl_products` ");
            rs = pst.executeQuery();
            
            while(rs.next()){
            Object[] rowdata = new Object[4];
            
            for(int i = 0; i < 4; i++){
            
                rowdata[i] =rs.getObject(i+1);
            
            }
            table1.addRow(rowdata);
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(DashboardPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
          
    }

    
    public JTable getTable(){
    return table1;
    }
   
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        card1 = new Panel.Card();
        card2 = new Panel.Card();
        card3 = new Panel.Card();
        panelBorder1 = new Panel.panelBorder();
        jLabel2 = new javax.swing.JLabel();
        tableScroll = new javax.swing.JScrollPane();
        table1 = new classes.Table();

        jLabel1.setText("jLabel1");

        setBackground(new java.awt.Color(242, 242, 242));

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
        jLabel2.setText("LIST OF PRODUCTS");

        tableScroll.setBorder(null);

        table1.setModel(new javax.swing.table.DefaultTableModel(
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
        tableScroll.setViewportView(table1);

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tableScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 933, Short.MAX_VALUE)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tableScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 945, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Panel.Card card1;
    private Panel.Card card2;
    private Panel.Card card3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private Panel.panelBorder panelBorder1;
    private classes.Table table1;
    private javax.swing.JScrollPane tableScroll;
    // End of variables declaration//GEN-END:variables
}
