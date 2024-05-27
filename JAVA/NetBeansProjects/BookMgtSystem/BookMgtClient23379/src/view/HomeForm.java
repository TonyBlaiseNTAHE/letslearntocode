/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;

/**
 *
 * @author Mhz
 */
public class HomeForm extends javax.swing.JFrame {
//    private String password;
//
//    // Constructor to accept the email of the logged-in user
//    public HomeForm(String password) {
//        initComponents();
//        this.password = password;
//        // Call a method to handle button visibility based on the email
//        handleButtonVisibility();
//    }
//
//    // Method to handle button visibility based on the logged-in user's email
//    private void handleButtonVisibility() {
//        // Check if the logged-in user's email matches the specific email
//        if (password.equals("tony123")) {
//            // Set visibility of buttons accordingly
//            addBookBtn.setVisible(true);
//            showUsersBtn.setVisible(true);
//            rentBookBtn.setVisible(true);
//        } else {
//            addBookBtn.setVisible(false);
//            showUsersBtn.setVisible(false);
//            rentBookBtn.setVisible(true);
//        }
//    }
    /**
     * Creates new form HomeForm
     */
    public HomeForm() {
        initComponents();
        //handleButtonVisibility();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        rentBookBtn = new javax.swing.JButton();
        addBookBtn = new javax.swing.JButton();
        showUsersBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Book Management System ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, -1, -1));

        rentBookBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rentBookBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/house.png"))); // NOI18N
        rentBookBtn.setText("Rent a Book");
        rentBookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rentBookBtnActionPerformed(evt);
            }
        });
        getContentPane().add(rentBookBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        addBookBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        addBookBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/books.png"))); // NOI18N
        addBookBtn.setText("Add a Book");
        addBookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBookBtnActionPerformed(evt);
            }
        });
        getContentPane().add(addBookBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, -1, -1));

        showUsersBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        showUsersBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/users.png"))); // NOI18N
        showUsersBtn.setText("Show Users");
        showUsersBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showUsersBtnActionPerformed(evt);
            }
        });
        getContentPane().add(showUsersBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, -1, -1));

        exitBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        exitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        getContentPane().add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 230, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/imgonline-com-ua-resize-4Uh6ws1uQJm.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rentBookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rentBookBtnActionPerformed
        // TODO add your handling code here:
        new RentalForm().setVisible(true);
        
    }//GEN-LAST:event_rentBookBtnActionPerformed

    private void addBookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBookBtnActionPerformed

        new BookForm().setVisible(true);
        
    }//GEN-LAST:event_addBookBtnActionPerformed

    private void showUsersBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showUsersBtnActionPerformed
        // TODO add your handling code here:
        new UsersForm().setVisible(true);
        
    }//GEN-LAST:event_showUsersBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        // TODO add your handling code here:
        int res = JOptionPane.showConfirmDialog(null, "Do you really want to close the Application", "Select", JOptionPane.YES_NO_OPTION);
            if (res == 0) {
                System.exit(0);
            }
    }//GEN-LAST:event_exitBtnActionPerformed

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
            java.util.logging.Logger.getLogger(HomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBookBtn;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton rentBookBtn;
    private javax.swing.JButton showUsersBtn;
    // End of variables declaration//GEN-END:variables
}
