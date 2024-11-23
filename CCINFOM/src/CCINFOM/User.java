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
public class User extends javax.swing.JFrame {
    

    private static final String username = "root";
    private static final String password = "Mypassword";
    private static final String connURL = "jdbc:mysql://localhost:3306/db_socmed";
    /**
     * Creates new form Accounts
     */
    public User() {
        initComponents();
        updateDB();
    }
    
    private void updateDB(){
        int colCounts;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection sqlConn = DriverManager.getConnection(connURL, username, password);
            PreparedStatement pst = sqlConn.prepareStatement("SELECT * FROM users");
            ResultSet rs = pst.executeQuery();
            ResultSetMetaData st = rs.getMetaData();
            
            colCounts = st.getColumnCount();
            
            DefaultTableModel recordTable = (DefaultTableModel)userTable.getModel();
            recordTable.setRowCount(0);
            
            while(rs.next()){
                Vector columnData = new Vector();
                for(int j = 1; j <= colCounts; j++){
                    columnData.add(rs.getObject(j));
                }
                
                recordTable.addRow(columnData);
            }
        }catch(ClassNotFoundException | SQLException ex){
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
    
    private ArrayList<Integer> getCalendar(){
        ArrayList<Integer> dateList = new ArrayList<Integer>();
        
        // get the date selected by the user
        Date dateSelected = calendarBday.getDate();
        Calendar calendar = Calendar.getInstance();
        // set the calendar's date to the user selected date
        calendar.setTime(dateSelected);
            
        // get the day (1-31)
        dateList.add(calendar.get(Calendar.DAY_OF_MONTH));
        // month is 0 based (0-11), plus 1 makes it 1-12
        dateList.add(calendar.get(Calendar.MONTH) + 1);
        dateList.add(calendar.get(Calendar.YEAR));
        
        return dateList;
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
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        label2 = new javax.swing.JLabel();
        tfLname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfFname = new javax.swing.JTextField();
        label3 = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        label4 = new javax.swing.JLabel();
        calendarBday = new com.toedter.calendar.JCalendar();
        btnDelete = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 158, 160), 8));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 68)); // NOI18N
        jLabel1.setText("User");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 160, 80));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 930, 100));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 158, 160), 4));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 22)); // NOI18N
        label2.setText("Last name");
        jPanel2.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 118, -1, 33));
        jPanel2.add(tfLname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 375, 33));

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 22)); // NOI18N
        jLabel3.setText("First name");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 43, -1, 33));
        jPanel2.add(tfFname, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 77, 376, 33));

        label3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 22)); // NOI18N
        label3.setText("Email");
        jPanel2.add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 202, -1, 33));
        jPanel2.add(tfEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 241, 375, 33));

        label4.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 22)); // NOI18N
        label4.setText("Birthday");
        jPanel2.add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, -1, 33));

        calendarBday.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 158, 160), 3));
        jPanel2.add(calendarBday, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 375, 158));

        btnDelete.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel2.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 150, -1));

        btnAdd.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel2.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 150, -1));

        btnUpdate.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel2.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 300, 150, -1));

        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "user_id", "first_name", "last_name", "email", "birth_date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        userTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(userTable);
        if (userTable.getColumnModel().getColumnCount() > 0) {
            userTable.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 850, 220));

        btnExit.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        btnExit.setText("EXIT");
        btnExit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel2.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 300, 150, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 930, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 970, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 970, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection sqlConn = DriverManager.getConnection(connURL, username, password);
            PreparedStatement pst = sqlConn.prepareStatement("INSERT INTO users(first_name, last_name, email, birth_date)" + 
                    "VALUE(?, ?, ?, ?)");
                        
            ArrayList<Integer> dateList = getCalendar();

            String fname = tfFname.getText();
            String lname = tfLname.getText();
            String email = tfEmail.getText();
            
            if(fname.isEmpty() || lname.isEmpty() || email.isEmpty()){
                JOptionPane.showMessageDialog(this, "Complete the information needed.", "Warning", JOptionPane.ERROR_MESSAGE);
            }
            else{
                pst.setString(1, fname);
                pst.setString(2, lname);
                pst.setString(3, email);
                pst.setString(4, dateList.get(2) + "-" + dateList.get(1) + "-" + dateList.get(0));
            
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Record Added!", "User", JOptionPane.OK_OPTION);
                updateDB();
            }
        }catch(HeadlessException | ClassNotFoundException | SQLException ex){
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        HomePage hp = new HomePage();
        hp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        DefaultTableModel recordTable = (DefaultTableModel)userTable.getModel();
        int selectedRow = userTable.getSelectedRow();
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection sqlConn = DriverManager.getConnection(connURL, username, password);
            
            if(JOptionPane.showConfirmDialog(this, "Confirm if you want to delete record.", "Message", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION){
                PreparedStatement pst = sqlConn.prepareStatement("DELETE FROM users WHERE user_id=?");
                
                pst.setInt(1, Integer.parseInt(recordTable.getValueAt(selectedRow, recordTable.findColumn("user_id")).toString()));
                pst.executeUpdate();
                
                JOptionPane.showMessageDialog(this, "Record Deleted!", "Message", JOptionPane.OK_OPTION);
                updateDB();
            }
        }catch(HeadlessException | ClassNotFoundException | NumberFormatException | SQLException ex){
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        ArrayList<Integer> dateList = getCalendar();
        ArrayList<String> ids = new ArrayList<String>();
        boolean isNewEmpty = false;
        ResultSet rs = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection sqlConn = DriverManager.getConnection(connURL, username, password);
            
            DefaultTableModel recordTable = (DefaultTableModel)userTable.getModel();
            int selectedRow = userTable.getSelectedRow();
            
            String old_email = recordTable.getValueAt(selectedRow, recordTable.findColumn("email")).toString();
            
            String fname = tfFname.getText();
            String lname = tfLname.getText();
            String new_email = tfEmail.getText();
            String birthday = dateList.get(2) + "-" + dateList.get(1) + "-" + dateList.get(0);
            
            PreparedStatement pst = sqlConn.prepareStatement("SELECT user_id FROM users WHERE email=?");
            
            for(int j = 0; j < 2; j++){
                pst.setString(1, j == 0? old_email : new_email);
                
                rs = pst.executeQuery();
                if(!(rs.next()))
                    isNewEmpty = true;
                else
                    ids.add(rs.getString(1)); // old id always exist
            }
            
            if(isNewEmpty)
                JOptionPane.showMessageDialog(this, "Please create a user first as the email cannot be found.", "Error", JOptionPane.ERROR_MESSAGE);
            else if(!(isNewEmpty) && !(ids.get(0).equals(ids.get(1))))
                JOptionPane.showMessageDialog(this, "Email has been created by other users.", "Error", JOptionPane.ERROR_MESSAGE);
            else{
                pst = sqlConn.prepareStatement("UPDATE users SET first_name=?, last_name=?, email=?, birth_date=?"
                + "WHERE user_id=?");
 
                pst.setString(1, fname);
                pst.setString(2, lname);
                pst.setString(3, new_email);
                pst.setString(4, birthday);
                pst.setString(5, ids.get(0));
                
                pst.executeUpdate();
                    
                JOptionPane.showMessageDialog(this, "Record Updated!", "User", JOptionPane.OK_OPTION);
                updateDB();
                userTable.setRowSelectionInterval(selectedRow, selectedRow);
            }    
        }catch(HeadlessException | ClassNotFoundException | SQLException ex){
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void userTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTableMouseClicked
        DefaultTableModel recordTable = (DefaultTableModel)userTable.getModel();
        int selectedRow = userTable.getSelectedRow();
        
        String dateString = recordTable.getValueAt(selectedRow, recordTable.findColumn("birth_date")).toString();
        try{
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            // convert date string to date object
            Date date = dateFormat.parse(dateString);
            // set the date to the calendar
            calendarBday.setDate(date);
            tfFname.setText(recordTable.getValueAt(selectedRow, recordTable.findColumn("first_name")).toString());
            tfLname.setText(recordTable.getValueAt(selectedRow, recordTable.findColumn("last_name")).toString());
            tfEmail.setText(recordTable.getValueAt(selectedRow, recordTable.findColumn("email")).toString());
        }catch(ParseException ex){
            JOptionPane.showMessageDialog(this, ex.getMessage());
        } 
    }//GEN-LAST:event_userTableMouseClicked

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
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnUpdate;
    private com.toedter.calendar.JCalendar calendarBday;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfFname;
    private javax.swing.JTextField tfLname;
    private javax.swing.JTable userTable;
    // End of variables declaration//GEN-END:variables
}
