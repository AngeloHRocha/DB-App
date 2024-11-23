/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CCINFOM;

import java.awt.HeadlessException;
import java.awt.print.PrinterException;
import javax.swing.JFrame;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane; 
import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author Asus
 */
public class PinningPost extends javax.swing.JFrame {
    /**
     * Creates new form PinningPost
     */
    public PinningPost() {
        initComponents();
        addComboItems();
    }
    
    
    private void addComboItems(){
        cbPlatform.removeAllItems();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection sqlConn = DatabaseConnection.getConnection();
            PreparedStatement pst = sqlConn.prepareStatement("SELECT platform_name FROM platforms");
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                cbPlatform.addItem(rs.getString(1));
            }
        }catch(ClassNotFoundException | SQLException ex){
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
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
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        btnShow = new javax.swing.JButton();
        cbPlatform = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePost = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        tfTitle = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taContent = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        tfType = new javax.swing.JTextField();
        btnExit = new javax.swing.JButton();
        btnPin = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 158, 160), 8));

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 48)); // NOI18N
        jLabel1.setText("Pinning a Post");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(232, 232, 232))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 158, 160), 4));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel2.setText("Account name");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 25, -1, 28));
        jPanel3.add(tfName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 369, 34));

        btnShow.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        btnShow.setText("Show Posts");
        btnShow.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowActionPerformed(evt);
            }
        });
        jPanel3.add(btnShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, 227, -1));

        cbPlatform.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(cbPlatform, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 370, 40));

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel6.setText("Platform");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 90, -1));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 158, 160), 4));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablePost.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "post_id", "account_id", "post_date", "content_type", "title", "content"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablePost.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePostMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablePost);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 810, 110));

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel3.setText("Title");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 60, 20));
        jPanel4.add(tfTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 530, 30));

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel4.setText("Content");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, 30));

        taContent.setColumns(20);
        taContent.setRows(5);
        jScrollPane2.setViewportView(taContent);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 530, -1));

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel5.setText("Content type");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, 30));
        jPanel4.add(tfType, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 530, 30));

        btnExit.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        btnExit.setText("Exit");
        btnExit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel4.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 330, 130, -1));

        btnPin.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        btnPin.setText("Pin");
        btnPin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnPin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPinActionPerformed(evt);
            }
        });
        jPanel4.add(btnPin, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, 130, -1));

        jButton1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jButton1.setText("Unpin");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 130, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed
        DefaultTableModel recordTable = (DefaultTableModel)tablePost.getModel();
        PreparedStatement pst;
        ResultSet rs;
        ResultSetMetaData st;
        int colCount;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection sqlConn = DatabaseConnection.getConnection();
            
            String account_name = tfName.getText();
            String platform_name = (String)cbPlatform.getSelectedItem();
            
            pst = sqlConn.prepareStatement("SELECT platform_id FROM platforms WHERE platform_name=?");
            pst.setString(1, platform_name);
           
            rs = pst.executeQuery();
            rs.next();
            int platform_id = rs.getInt(1);
            
            pst = sqlConn.prepareStatement("SELECT account_id FROM accounts WHERE platform_id=? AND account_name=?");
            pst.setInt(1, platform_id);
            pst.setString(2, account_name);
            
            rs = pst.executeQuery();
            if(rs.next()){
                int account_id = rs.getInt(1);
                
                pst = sqlConn.prepareStatement("SELECT po.post_id, po.account_id, po.post_date, ct.content_type, pc.title, pc.content "
                        + "FROM posts po "
                        + "JOIN post_contents pc ON po.post_id = pc.post_id "
                        + "JOIN content_types ct ON pc.type_id = ct.type_id "
                        + "WHERE po.account_id=?");
                pst.setInt(1, account_id);
                
                rs = pst.executeQuery();
                st = rs.getMetaData();
                colCount = st.getColumnCount();
                
                recordTable.setRowCount(0);
                
                while(rs.next()){
                    Vector columnData = new Vector();
                    
                    for(int j = 1; j <= colCount; j++){
                        columnData.add(rs.getObject(j));
                    }
                    recordTable.addRow(columnData);
                }
            }
            else{
                JOptionPane.showMessageDialog(this, "Account name not found.", "Warning", JOptionPane.ERROR_MESSAGE);
                recordTable.setRowCount(0);
            }
                
            
        }catch(HeadlessException | ClassNotFoundException | SQLException ex){
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_btnShowActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        HomePage hp = new HomePage();
        hp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void tablePostMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePostMouseClicked
        DefaultTableModel recordTable = (DefaultTableModel)tablePost.getModel();
        int selectedRow = tablePost.getSelectedRow();
        
        
        Object titleObj = recordTable.getValueAt(selectedRow, recordTable.findColumn("title"));
        String title = titleObj != null ? titleObj.toString() : "";
        tfTitle.setText(title);
        
        tfType.setText(recordTable.getValueAt(selectedRow, recordTable.findColumn("content_type")).toString());
        taContent.setText(recordTable.getValueAt(selectedRow, recordTable.findColumn("content")).toString());
        
        tablePost.setRowSelectionInterval(selectedRow, selectedRow);
    }//GEN-LAST:event_tablePostMouseClicked

    private void btnPinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPinActionPerformed
        DefaultTableModel recordTable = (DefaultTableModel)tablePost.getModel();
        int selectedRow = tablePost.getSelectedRow();
         
        int pinned_post_id = Integer.parseInt(recordTable.getValueAt(selectedRow, recordTable.findColumn("post_id")).toString());
        int account_id = Integer.parseInt(recordTable.getValueAt(selectedRow, recordTable.findColumn("account_id")).toString());
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection sqlConn = DatabaseConnection.getConnection();
            
            PreparedStatement pst = sqlConn.prepareStatement("UPDATE accounts SET pinned_post_id=? WHERE account_id=?");
            pst.setInt(1, pinned_post_id);
            pst.setInt(2, account_id);
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Post Pinned!");
        }catch(ClassNotFoundException | SQLException ex){
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_btnPinActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel recordTable = (DefaultTableModel)tablePost.getModel();
        int selectedRow = tablePost.getSelectedRow();
         
        int account_id = Integer.parseInt(recordTable.getValueAt(selectedRow, recordTable.findColumn("account_id")).toString());
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection sqlConn = DatabaseConnection.getConnection();
            
            PreparedStatement pst = sqlConn.prepareStatement("UPDATE accounts SET pinned_post_id=NULL WHERE account_id=?");
            pst.setInt(1, account_id);
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Post Unpinned!");
        }catch(ClassNotFoundException | SQLException ex){
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }       
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
            java.util.logging.Logger.getLogger(PinningPost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PinningPost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PinningPost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PinningPost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PinningPost().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnPin;
    private javax.swing.JButton btnShow;
    private javax.swing.JComboBox<String> cbPlatform;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea taContent;
    private javax.swing.JTable tablePost;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfTitle;
    private javax.swing.JTextField tfType;
    // End of variables declaration//GEN-END:variables
}