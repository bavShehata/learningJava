/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Admin_specific extends javax.swing.JFrame {

    /**
     * Creates new form Admin_specific
     */
    public Admin_specific() {
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

        Addtrain_RB = new javax.swing.JRadioButton();
        Removetrain_RB = new javax.swing.JRadioButton();
        Updatetrain_RB = new javax.swing.JRadioButton();
        Generatereport_RB = new javax.swing.JRadioButton();
        Assgintrain_RB = new javax.swing.JRadioButton();
        Unassgintrain_RB = new javax.swing.JRadioButton();
        Addroute_RB = new javax.swing.JRadioButton();
        Displaytrain_RB = new javax.swing.JRadioButton();
        Displayroute_RB = new javax.swing.JRadioButton();
        Removeroute_RB = new javax.swing.JRadioButton();
        Updateroute_RB = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        Createaccount_RB = new javax.swing.JRadioButton();
        Updateaccount_RB = new javax.swing.JRadioButton();
        Deleteaccount_RB = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Addtrain_RB.setText("Add Train");
        Addtrain_RB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Addtrain_RBActionPerformed(evt);
            }
        });

        Removetrain_RB.setText("Remove Train");
        Removetrain_RB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Removetrain_RBActionPerformed(evt);
            }
        });

        Updatetrain_RB.setText("Update Train");

        Generatereport_RB.setText("Generate Report");
        Generatereport_RB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Generatereport_RBActionPerformed(evt);
            }
        });

        Assgintrain_RB.setText("Assgin Train");

        Unassgintrain_RB.setText("Unassgin Train");

        Addroute_RB.setText("Add Route");

        Displaytrain_RB.setText("Display Trains");

        Displayroute_RB.setText("Display Route");

        Removeroute_RB.setText("Remove Route");

        Updateroute_RB.setText("Update Route");
        Updateroute_RB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Updateroute_RBActionPerformed(evt);
            }
        });

        jButton1.setText("Next");

        Createaccount_RB.setText("Create Account");
        Createaccount_RB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Createaccount_RBActionPerformed(evt);
            }
        });

        Updateaccount_RB.setText("Update Account");

        Deleteaccount_RB.setText("Delete Acoount");

        jLabel1.setText("Welcome Admin  Please choose from the following ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Unassgintrain_RB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Generatereport_RB)
                            .addComponent(Assgintrain_RB)
                            .addComponent(Addtrain_RB, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Updatetrain_RB)
                            .addComponent(Removetrain_RB))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Addroute_RB)
                            .addComponent(Removeroute_RB)
                            .addComponent(Displaytrain_RB)
                            .addComponent(Displayroute_RB)
                            .addComponent(Updateroute_RB))
                        .addGap(121, 121, 121))))
            .addGroup(layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(Createaccount_RB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                        .addComponent(Updateaccount_RB)
                        .addGap(105, 105, 105)
                        .addComponent(Deleteaccount_RB))
                    .addComponent(jSeparator2))
                .addGap(56, 56, 56))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 46, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Addtrain_RB)
                                .addGap(26, 26, 26)
                                .addComponent(Removetrain_RB)
                                .addGap(29, 29, 29)
                                .addComponent(Updatetrain_RB)
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Generatereport_RB)
                                    .addComponent(Removeroute_RB))
                                .addGap(30, 30, 30))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Addroute_RB)
                                .addGap(26, 26, 26)
                                .addComponent(Displaytrain_RB)
                                .addGap(29, 29, 29)
                                .addComponent(Displayroute_RB)
                                .addGap(82, 82, 82)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(jButton1)
                                .addGap(19, 19, 19))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Assgintrain_RB)
                                    .addComponent(Updateroute_RB))
                                .addGap(30, 30, 30)
                                .addComponent(Unassgintrain_RB)
                                .addGap(36, 36, 36))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Createaccount_RB)
                            .addComponent(Updateaccount_RB)
                            .addComponent(Deleteaccount_RB))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Addtrain_RBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Addtrain_RBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Addtrain_RBActionPerformed

    private void Removetrain_RBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Removetrain_RBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Removetrain_RBActionPerformed

    private void Generatereport_RBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Generatereport_RBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Generatereport_RBActionPerformed

    private void Updateroute_RBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Updateroute_RBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Updateroute_RBActionPerformed

    private void Createaccount_RBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Createaccount_RBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Createaccount_RBActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_specific.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_specific.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_specific.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_specific.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_specific().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Addroute_RB;
    private javax.swing.JRadioButton Addtrain_RB;
    private javax.swing.JRadioButton Assgintrain_RB;
    private javax.swing.JRadioButton Createaccount_RB;
    private javax.swing.JRadioButton Deleteaccount_RB;
    private javax.swing.JRadioButton Displayroute_RB;
    private javax.swing.JRadioButton Displaytrain_RB;
    private javax.swing.JRadioButton Generatereport_RB;
    private javax.swing.JRadioButton Removeroute_RB;
    private javax.swing.JRadioButton Removetrain_RB;
    private javax.swing.JRadioButton Unassgintrain_RB;
    private javax.swing.JRadioButton Updateaccount_RB;
    private javax.swing.JRadioButton Updateroute_RB;
    private javax.swing.JRadioButton Updatetrain_RB;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
