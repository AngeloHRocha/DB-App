/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CCINFOM;

/**
 *
 * @author Asus
 */
public class HomePage extends javax.swing.JFrame {

    /**
     * Creates new form HomePage
     */
    public HomePage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnEngTypes = new javax.swing.JButton();
        btnPost = new javax.swing.JButton();
        btnContentTypes = new javax.swing.JButton();
        btnPlatform = new javax.swing.JButton();
        btnUser = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnConFre = new javax.swing.JButton();
        btnPostCount = new javax.swing.JButton();
        btnPlatUsage = new javax.swing.JButton();
        btnPostEng = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnEngage = new javax.swing.JButton();
        btnContent = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        btnPinning = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home Page");
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(203, 248, 203));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("MV Boli", 1, 36)); // NOI18N
        jLabel2.setText("TABLES");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 147, -1));

        btnEngTypes.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        btnEngTypes.setText("Engagement_type");
        btnEngTypes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.add(btnEngTypes, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 200, 40));

        btnPost.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        btnPost.setText("Post");
        btnPost.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.add(btnPost, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 70, 180, 40));

        btnContentTypes.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        btnContentTypes.setText("Content type");
        btnContentTypes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.add(btnContentTypes, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, 180, 40));

        btnPlatform.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        btnPlatform.setText("Platform");
        btnPlatform.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnPlatform.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlatformActionPerformed(evt);
            }
        });
        jPanel1.add(btnPlatform, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 180, 40));

        btnUser.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        btnUser.setText("User");
        btnUser.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserActionPerformed(evt);
            }
        });
        jPanel1.add(btnUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 180, 40));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 980, 190));

        jPanel3.setBackground(new java.awt.Color(203, 248, 203));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("MV Boli", 1, 36)); // NOI18N
        jLabel1.setText("RECORDS");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 310, -1));

        btnConFre.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        btnConFre.setText("Content Frequency Report");
        btnConFre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.add(btnConFre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 310, 40));

        btnPostCount.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        btnPostCount.setText("Post Count Report ");
        btnPostCount.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.add(btnPostCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, 310, 40));

        btnPlatUsage.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        btnPlatUsage.setText("Platform Usage Report");
        btnPlatUsage.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnPlatUsage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlatUsageActionPerformed(evt);
            }
        });
        jPanel3.add(btnPlatUsage, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, 310, 40));

        btnPostEng.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        btnPostEng.setText("Posts Engagement Report");
        btnPostEng.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.add(btnPostEng, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 310, 40));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 980, 190));

        jLabel3.setBackground(new java.awt.Color(44, 92, 44));
        jLabel3.setFont(new java.awt.Font("MV Boli", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(121, 201, 121));
        jLabel3.setText("TRANSACTIONS");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 310, -1));

        btnEngage.setBackground(new java.awt.Color(152, 150, 150));
        btnEngage.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        btnEngage.setForeground(new java.awt.Color(255, 255, 255));
        btnEngage.setText("Engaging with a Post");
        btnEngage.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnEngage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEngageActionPerformed(evt);
            }
        });
        jPanel2.add(btnEngage, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 310, 40));

        btnContent.setBackground(new java.awt.Color(152, 150, 150));
        btnContent.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        btnContent.setForeground(new java.awt.Color(255, 255, 255));
        btnContent.setText("Assigning Content to a Post");
        btnContent.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnContent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContentActionPerformed(evt);
            }
        });
        jPanel2.add(btnContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 280, 310, 40));

        btnCreate.setBackground(new java.awt.Color(152, 150, 150));
        btnCreate.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        btnCreate.setForeground(new java.awt.Color(255, 255, 255));
        btnCreate.setText("Creating an Account");
        btnCreate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        jPanel2.add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 350, 310, 40));

        btnPinning.setBackground(new java.awt.Color(152, 150, 150));
        btnPinning.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        btnPinning.setForeground(new java.awt.Color(255, 255, 255));
        btnPinning.setText("Pinning a Post to a Profile");
        btnPinning.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnPinning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPinningActionPerformed(evt);
            }
        });
        jPanel2.add(btnPinning, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 310, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CCINFOM/canva-background-qmcc4n366c91sn6c.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 980, 230));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1003, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEngageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEngageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEngageActionPerformed

    private void btnContentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnContentActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        CreateAccount ac = new CreateAccount();
        ac.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnPinningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPinningActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPinningActionPerformed

    private void btnUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserActionPerformed
        User user = new User();
        user.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnUserActionPerformed

    private void btnPlatformActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlatformActionPerformed
        Platform plat = new Platform();
        plat.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnPlatformActionPerformed

    private void btnPlatUsageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlatUsageActionPerformed
        PlatformUsage pu = new PlatformUsage();
        pu.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnPlatUsageActionPerformed

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConFre;
    private javax.swing.JButton btnContent;
    private javax.swing.JButton btnContentTypes;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnEngTypes;
    private javax.swing.JButton btnEngage;
    private javax.swing.JButton btnPinning;
    private javax.swing.JButton btnPlatUsage;
    private javax.swing.JButton btnPlatform;
    private javax.swing.JButton btnPost;
    private javax.swing.JButton btnPostCount;
    private javax.swing.JButton btnPostEng;
    private javax.swing.JButton btnUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
