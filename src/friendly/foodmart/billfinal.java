/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package friendly.foodmart;

import java.awt.event.KeyEvent;
import java.util.logging.Logger;
import java.lang.System.Logger.Level;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.util.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author tuzzc
 */
public class billfinal extends javax.swing.JFrame {

    /**
     * Creates new form
     */
//    int max = 500;
//    int min = 100;
//    public void initbill(){
//        int b = (int)(Math.random()*(max-min+1)+min);
//        System.out.print(b);
//        
//    }
    public billfinal() {
        initComponents();
        
    }

//    billfinal(String msg) {
//        amt1.setText(msg);
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }

    public billfinal(String msg){
        Random rnd = new Random();
        int number = rnd.nextInt(9999); 
        String BID=Integer.toString(number);
        initComponents();
        //billid1.setText(model.getValueAt(Myindex,0).toString());
        billid1.setText(BID);
        amt2.setText(msg);
    }
    public void gettotal(String tot){
        String totalamt= tot;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        itemtable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        addtobill = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        Refresh = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        billid1 = new javax.swing.JTextPane();
        bill_id1 = new javax.swing.JLabel();
        c_id1 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        cid1 = new javax.swing.JTextPane();
        p_mode1 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        mode1 = new javax.swing.JTextPane();
        billdate1 = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        amt2 = new javax.swing.JTextPane();
        amount1 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        date2 = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtbill = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("RECORD DETAILS");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 3, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 3, Short.MAX_VALUE)))
        );

        itemtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BILL ID", "C ID", "MODE", "DATE-TIME", "AMOUNT"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        itemtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemtableMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(itemtable);

        addtobill.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addtobill.setText("ADD ITEM");
        addtobill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addtobillActionPerformed(evt);
            }
        });

        update.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        update.setText("UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        delete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        clear.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        clear.setText("CLEAR");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        Refresh.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Refresh.setText("REFRESH TABLE");
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(addtobill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(45, 45, 45)
                .addComponent(update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(48, 48, 48)
                .addComponent(Refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addtobill, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Refresh)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jScrollPane12.setViewportView(billid1);

        bill_id1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bill_id1.setText("Bill No");

        c_id1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        c_id1.setText("Customer ID");

        jScrollPane13.setViewportView(cid1);

        p_mode1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        p_mode1.setText("MODE");

        jScrollPane14.setViewportView(mode1);

        billdate1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        billdate1.setText("DATE-TIME");

        jScrollPane15.setViewportView(amt2);

        amount1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        amount1.setText("AMOUNT");

        jScrollPane7.setViewportView(date2);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(bill_id1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(c_id1)
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(391, 391, 391)
                        .addComponent(billdate1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(p_mode1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane7)))
                .addGap(58, 58, 58)
                .addComponent(amount1)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c_id1)
                            .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bill_id1)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(p_mode1)
                                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(amount1))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(billdate1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jScrollPane7)))
                .addGap(12, 12, 12))
        );

        txtbill.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jScrollPane3.setViewportView(txtbill);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 929, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addtobillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addtobillActionPerformed
        try {
            // TODO add your handling code here:
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket?useSSL=false","root","9799");

            String sql=("insert into billfinal values(?,?,?,?,?)");
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setInt(1,Integer.parseInt(billid1.getText()));
            //pst.setString(2, cid.getText());
            pst.setInt(2,Integer.parseInt(cid1.getText()));
            //pst.setString(3, pid.getText());
//            pst.setInt(3,Integer.parseInt(pid.getText()));
//            pst.setString(4, pname.getText());
//            pst.setString(5,itemprice.getText());
//            pst.setInt(6,Integer.parseInt(itemqty.getValue().toString()));
            pst.setString(3,mode1.getText());
            pst.setString(5,date2.getText());
//            pst.setString(10,time1.getText());
            pst.setInt(4,Integer.parseInt(amt2.getText()));

            // pst.setString(5,procategory.getSelectedItem().toString());

            int row=pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel)itemtable.getModel();

            JOptionPane.showMessageDialog(null, "insersion successful");
            con.close();
            ((DefaultTableModel)itemtable.getModel()).setNumRows(0);

        }

        catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_addtobillActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        if(billid1.getText().isEmpty()||cid1.getText().isEmpty()||mode1.getText().isEmpty()||amt2.getText().isEmpty()||date2.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Missing Information");
        }
        else{
            try
            {
                String date= date2.getText();

                Connection Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket?useSSL=false","root","9799");

                //String Query="Update customer set custname='"+cust_name.getText()+"'"+",custphno='"+cust_phno.getText()+"'"+",custgender'"+cust_gender.getText()+"'"+"where custid="+cust_id.getText();
                //Statement st = Con.createStatement();
                //st.executeUpdate(Query);
                //JOptionPane.showMessageDialog(null, "Update successful");
                //String sql="update Customer set cust_name=?, cust_phno=?, gender=? where cust_id=?";
                String sql="update billfinal set cust_id=?, mode=?, amount=?,  date_time=? where bill_id=?";
                //PreparedStatement pstm=Con.prepareStatement(sql);
                PreparedStatement pstm=Con.prepareStatement(sql);
                pstm.setInt(5, Integer.parseInt(billid1.getText()));
                pstm.setInt(1, Integer.parseInt(cid1.getText()));
                
                pstm.setString(2, mode1.getText());
                
//                pstm.setString(4, itemprice.getText());
//                pstm.setString(7, mode.getText());
//                pstm.setString(8, date.getText());
//                pstm.setString(9, time.getText());
                //            pstm.setString(2,pid.getText());
                //pstm.setString(5,itemqty.getValue().toString());
                pstm.setInt(3,Integer.parseInt(amt2.getText()));
                pstm.setString(4, date);

                pstm.executeUpdate();
                JOptionPane.showMessageDialog(this, "Update successful");
                Con.close();

            }
            catch(SQLException e)
            {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        if(billid1.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "select the BILL ID to be deleted");
        }
        else{
            try{
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket?useSSL=false","root","9799");
                String bid=billid1.getText();
                String Query="Delete from billfinal where bill_id="+bid;
                Statement st = con.createStatement();
                st.executeUpdate(Query);
                //SelectCustomer();
                JOptionPane.showMessageDialog(null, "Item deleted successfully");
                ((DefaultTableModel)itemtable.getModel()).setNumRows(0);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        billid1.setText("");
        cid1.setText("");
        mode1.setText("");
        //        itemqty.setValue("");
        date2.setText("");
        //billid.setText("");
        amt2.setText("");
        //time.setText("");
        //mode.setText("");
        //txttotal.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
        try{
            ((DefaultTableModel)itemtable.getModel()).setNumRows(0);
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket?useSSL=false","root","9799");
            Statement st = con.createStatement();
            String sql = "select * from billfinal";
            ResultSet rs= st.executeQuery(sql);
            DefaultTableModel tbModel = (DefaultTableModel)itemtable.getModel();
            while(rs.next()){

                String bill_id = String.valueOf(rs.getInt("bill_id"));
                String c_id= rs.getString("cust_id");
                String m_mode = rs.getString(("mode"));
                String d_date = rs.getString(("date_time"));
                String amt = String.valueOf(rs.getInt("amount"));
                String tbdata[]={bill_id, c_id, m_mode, d_date, amt};
                DefaultTableModel tbModel1 = (DefaultTableModel)itemtable.getModel();
                tbModel1.addRow(tbdata);
            }
//            int sum = 0;
//            for(int i = 0; i<itemtable.getRowCount(); i++)
//            {
//                sum = sum + Integer.parseInt(itemtable.getValueAt(i, 4).toString());
//            }
//            txttotal.setText(Integer.toString(sum));

            //            billid.setText("");
            //            p_name.setText("");
            //            itemprice.setText("");
            //            itemqty.setValue(0);
            //            amt.setText("");
            //            txttotal.setText("");
            con.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_RefreshActionPerformed

    private void itemtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemtableMouseClicked
        DefaultTableModel model = (DefaultTableModel)itemtable.getModel();
        int Myindex = itemtable.getSelectedRow();
        billid1.setText(model.getValueAt(Myindex,0).toString());
        cid1.setText(model.getValueAt(Myindex,1).toString());
        mode1.setText(model.getValueAt(Myindex,2).toString());
        date2.setText(model.getValueAt(Myindex,3).toString());
        amt2.setText(model.getValueAt(Myindex,4).toString());
    }//GEN-LAST:event_itemtableMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
        Welcome wel = new Welcome();
        wel.setVisible(true);

    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(billfinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(billfinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(billfinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(billfinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new billfinal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Refresh;
    private javax.swing.JButton addtobill;
    private javax.swing.JLabel amount1;
    private javax.swing.JTextPane amt2;
    private javax.swing.JLabel bill_id1;
    private javax.swing.JLabel billdate1;
    private javax.swing.JTextPane billid1;
    private javax.swing.JLabel c_id1;
    private javax.swing.JTextPane cid1;
    private javax.swing.JButton clear;
    private javax.swing.JTextPane date2;
    private javax.swing.JButton delete;
    private javax.swing.JTable itemtable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextPane mode1;
    private javax.swing.JLabel p_mode1;
    private javax.swing.JTextPane txtbill;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
