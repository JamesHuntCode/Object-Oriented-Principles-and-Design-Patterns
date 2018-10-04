/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guis;

import bankentities.BankAccount;
import javax.swing.JOptionPane;

/**
 *
 * @author James
 */
public class BankingDemoApp extends javax.swing.JFrame {
    
    private final BankAccount currentAccount;
    
    
    
    /**
     * Creates new form BankingDemoApp
     */
    public BankingDemoApp() {
        initComponents();
        
        currentAccount = new BankAccount("James Hunt");
        
        txtHolder.setText(currentAccount.getAccountHolder());
        txtBalance.setText("" + currentAccount.getBalance());
        txtOverdraft.setText("" + currentAccount.getOverdraft());
    }
    
    /**
     * Method to deposit money into the user's current account.
     */
    private void doDeposit() {
        try {
            currentAccount.depositFunds(Integer.parseInt(txtAmount.getText()));
            txtAmount.setText("");
            txtBalance.setText("" + currentAccount.getBalance());
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter numbers only.", "Error in amount", JOptionPane.ERROR_MESSAGE); 
        }
    }
    
    /**
     * Method to withdraw money from the user's current account.
     */
    private void doWithdraw() {
        try {
            boolean success = currentAccount.takeFunds(Integer.parseInt(txtAmount.getText()));

            if (success)
            {
                txtAmount.setText("");
                txtBalance.setText("" + currentAccount.getBalance());
            }
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter numbers only.", "Error in amount", JOptionPane.ERROR_MESSAGE); 
        }
    }

    /**
     * This method is called from within the constructor to initialise the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlSummary = new javax.swing.JPanel();
        lblBalance = new javax.swing.JLabel();
        lblOverdraft = new javax.swing.JLabel();
        txtBalance = new javax.swing.JTextField();
        txtOverdraft = new javax.swing.JTextField();
        pnlInteract = new javax.swing.JPanel();
        txtAmount = new javax.swing.JTextField();
        lblAmount = new javax.swing.JLabel();
        btnDesposit = new javax.swing.JButton();
        btnWithdraw = new javax.swing.JButton();
        lblHeader = new javax.swing.JLabel();
        txtHolder = new javax.swing.JTextField();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        pnlSummary.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblBalance.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblBalance.setText("Balance:");

        lblOverdraft.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblOverdraft.setText("Overdraft: ");

        txtBalance.setEditable(false);
        txtBalance.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtOverdraft.setEditable(false);
        txtOverdraft.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout pnlSummaryLayout = new javax.swing.GroupLayout(pnlSummary);
        pnlSummary.setLayout(pnlSummaryLayout);
        pnlSummaryLayout.setHorizontalGroup(
            pnlSummaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSummaryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSummaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblOverdraft)
                    .addComponent(lblBalance))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlSummaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBalance)
                    .addComponent(txtOverdraft))
                .addContainerGap())
        );
        pnlSummaryLayout.setVerticalGroup(
            pnlSummaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSummaryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSummaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBalance)
                    .addComponent(txtBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlSummaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOverdraft)
                    .addComponent(txtOverdraft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pnlInteract.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtAmount.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblAmount.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblAmount.setText("Amount: ");

        btnDesposit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDesposit.setText("Desposit");
        btnDesposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDespositActionPerformed(evt);
            }
        });

        btnWithdraw.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnWithdraw.setText("Withdraw");
        btnWithdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWithdrawActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlInteractLayout = new javax.swing.GroupLayout(pnlInteract);
        pnlInteract.setLayout(pnlInteractLayout);
        pnlInteractLayout.setHorizontalGroup(
            pnlInteractLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInteractLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInteractLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInteractLayout.createSequentialGroup()
                        .addComponent(lblAmount)
                        .addGap(26, 26, 26)
                        .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlInteractLayout.createSequentialGroup()
                        .addComponent(btnDesposit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnWithdraw)))
                .addContainerGap())
        );
        pnlInteractLayout.setVerticalGroup(
            pnlInteractLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInteractLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInteractLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAmount))
                .addGap(29, 29, 29)
                .addGroup(pnlInteractLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDesposit)
                    .addComponent(btnWithdraw))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblHeader.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblHeader.setText("Bank Account For:");

        txtHolder.setEditable(false);
        txtHolder.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnExit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnExit.setText("Exit Application");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlInteract, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlSummary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblHeader)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtHolder))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblHeader)
                .addGap(18, 18, 18)
                .addComponent(txtHolder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(pnlSummary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlInteract, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExit)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDespositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDespositActionPerformed
        doDeposit();
    }//GEN-LAST:event_btnDespositActionPerformed

    private void btnWithdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWithdrawActionPerformed
        doWithdraw();
    }//GEN-LAST:event_btnWithdrawActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(BankingDemoApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BankingDemoApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BankingDemoApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BankingDemoApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BankingDemoApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDesposit;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnWithdraw;
    private javax.swing.JLabel lblAmount;
    private javax.swing.JLabel lblBalance;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblOverdraft;
    private javax.swing.JPanel pnlInteract;
    private javax.swing.JPanel pnlSummary;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtBalance;
    private javax.swing.JTextField txtHolder;
    private javax.swing.JTextField txtOverdraft;
    // End of variables declaration//GEN-END:variables
}
