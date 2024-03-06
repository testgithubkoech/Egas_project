/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageGui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EgasOrdering extends javax.swing.JFrame {
    
    public EgasOrdering() {
        initComponents();
    }
     DefaultTableModel model;
     String item;
    int price;
    
    Connection con;
    PreparedStatement pst;
    PreparedStatement pst1;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        blRefill_Small_cylinder = new javax.swing.JRadioButton();
        blRefill_Large_cylinder = new javax.swing.JRadioButton();
        blBuy_new_smalll_cylinder = new javax.swing.JRadioButton();
        blBuy_new_large_cylinder = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtqty = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        txtpay = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtbal = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("Egas Ordering System");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(262, 262, 262)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        blRefill_Small_cylinder.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        blRefill_Small_cylinder.setText("Refill_Small_cylinder");
        blRefill_Small_cylinder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blRefill_Small_cylinderActionPerformed(evt);
            }
        });

        blRefill_Large_cylinder.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        blRefill_Large_cylinder.setText("Refill_Large_cylinder");

        blBuy_new_smalll_cylinder.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        blBuy_new_smalll_cylinder.setText("Buy_new_smalll_cylinder");

        blBuy_new_large_cylinder.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        blBuy_new_large_cylinder.setText("Buy_new_large_cylinder");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(blRefill_Small_cylinder)
                    .addComponent(blRefill_Large_cylinder)
                    .addComponent(blBuy_new_smalll_cylinder)
                    .addComponent(blBuy_new_large_cylinder)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(blRefill_Small_cylinder)
                .addGap(18, 18, 18)
                .addComponent(blRefill_Large_cylinder)
                .addGap(18, 18, 18)
                .addComponent(blBuy_new_smalll_cylinder)
                .addGap(18, 18, 18)
                .addComponent(blBuy_new_large_cylinder)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Price", "Qty", "Total"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Qty");

        txtqty.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Payment");

        txtpay.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtpay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpayActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Balance");

        txtbal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtbal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbalActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Print Invoice");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Total");

        txttotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txttotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttotalActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 51, 0));
        jButton3.setText("Remove");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(1, 1, 1)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtqty, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txttotal)
                    .addComponent(jLabel3)
                    .addComponent(txtpay)
                    .addComponent(jLabel4)
                    .addComponent(txtbal)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))
                .addContainerGap(99, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(4, 4, 4)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtpay, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtbal, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtqty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txttotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttotalActionPerformed
        // TODO add your handling code here:    
    }//GEN-LAST:event_txttotalActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         if(blRefill_Small_cylinder.isSelected()== true)
        {
            item = "Refill_Small_cylinder";
            price = 1500;
            
        }
         else if(blRefill_Large_cylinder.isSelected()== true)
        {
            item = "Refill_Large_cylinder";
            price = 2600;
            
        }
         else if(blBuy_new_smalll_cylinder.isSelected()== true)
        {
            item = "Buy_new_smalll_cylinder";
            price = 3500;
            
        }
         else if(blBuy_new_large_cylinder.isSelected()== true)
        {
            item = "Buy_new_large_cylindery";
            price = 5500;
        }
        int qty = Integer.parseInt(txtqty.getValue().toString());
        int tot = qty * price;
        
        model = (DefaultTableModel)jTable1.getModel();
        model.addRow(new Object[]
        {
            item,
            price,
            qty,
            tot
            
            
       });
        int sum = 0;
        for (int a=0; a<jTable1.getRowCount(); a++)
        {
            sum = sum + Integer.parseInt(jTable1.getValueAt(a,3).toString());
        
        }
        
        txttotal.setText(Integer.toString(sum));          
    }//GEN-LAST:event_jButton1ActionPerformed
 public void sales()
    {
        

        int lastid = 0;
        try {
            //connect to database
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/egas_db", "gideon","test123");
            
            String total = txttotal.getText();
            String bal = txtbal.getText();
            String pay = txtpay.getText();
            
            String query = "insert into sales(subtotal,pay,bal)values(?,?,?)";
            pst = con.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
            pst.setString(1, total);
             pst.setString(2, pay);
              pst.setString(3, bal);
              pst.executeUpdate();
              ResultSet rs = pst.getGeneratedKeys();
              
              if(rs.next())
              {
                  lastid = rs.getInt(1);
              }
              int row = jTable1.getRowCount();
              
               String query1 = "insert into sales_product(sales_id,prodname,price,qty,total)values(?,?,?,?,?)";
            pst1 = con.prepareStatement(query1);
            
            String prodname = "";
            int price;
            int qty;
            int tot = 0;
            
            
            for(int i=0; i<jTable1.getRowCount(); i++)
            {
                prodname = (String)jTable1.getValueAt(i, 0);
                 price = (int)jTable1.getValueAt(i, 1);
                  qty = (int)jTable1.getValueAt(i, 2);
                   tot = (int)jTable1.getValueAt(i, 3);
                   
                   pst1.setInt(1,lastid);
                    pst1.setString(2,prodname);
                     pst1.setInt(3,price);
                     pst1.setInt(4, qty);
                     pst1.setInt(5,tot);
                     pst1.executeUpdate();
                     
            }
               JOptionPane.showMessageDialog(this, "Saless Completed ");
               LogoutSystem();
               
         } catch (ClassNotFoundException ex) {
            Logger.getLogger(EgasOrdering.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(EgasOrdering.class.getName()).log(Level.SEVERE, null, ex);
        }
   
    
    }
 
    private void LogoutSystem(){
      Logout  logoutFrame= new  Logout();
         logoutFrame.setVisible(true);
         logoutFrame.pack();
        logoutFrame.setLocationRelativeTo(null);
        this.dispose();

    }
      
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        model.removeRow(jTable1.getSelectedRow());
        int sum = 0;
         for (int a=0; a<jTable1.getRowCount(); a++)
        {
            sum = sum + Integer.parseInt(jTable1.getValueAt(a,3).toString());
        
        }
        
        txttotal.setText(Integer.toString(sum));
        
        
        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtpayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpayActionPerformed
 //public void sales()
  {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EgasOrdering.class.getName()).log(Level.SEVERE, null, ex);
        }
      
      
      
      
      
      
  }
    
    
    private void txtbalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbalActionPerformed

    
    
    
    private void blRefill_Small_cylinderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blRefill_Small_cylinderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_blRefill_Small_cylinderActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int tot = Integer.parseInt(txttotal.getText());
        int pay = Integer.parseInt(txtpay.getText());
        
        int bal = pay - tot;
        
        
        txtbal.setText(String.valueOf(bal));
        
        sales();
        
    }//GEN-LAST:event_jButton2ActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton blBuy_new_large_cylinder;
    private javax.swing.JRadioButton blBuy_new_smalll_cylinder;
    private javax.swing.JRadioButton blRefill_Large_cylinder;
    private javax.swing.JRadioButton blRefill_Small_cylinder;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtbal;
    private javax.swing.JTextField txtpay;
    private javax.swing.JSpinner txtqty;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
}
