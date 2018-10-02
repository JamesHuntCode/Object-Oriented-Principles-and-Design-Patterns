/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guis;

/**
 *
 * @author James
 */
public class MyWeight extends javax.swing.JFrame {

    /**
     * Creates new form MyWeight
     */
    public MyWeight() {
        initComponents();
    }
    
    /** 
     * Handle the conversion from KG to LBS.
     */
    private void doConversion()
    {
        int inputValue = Integer.parseInt(txtInputKilos.getText());
        double value = inputValue * 2.2;
        
        txtInputLbs.setText("" + value);
    }
   
    /**
     * Handle the closing of the application.
     */
    private void closeApplication()
    {
        System.exit(0);
    }
    
    /**
     * This method is called from within the constructor to initialise the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLBS = new javax.swing.JLabel();
        txtInputLbs = new javax.swing.JTextField();
        lblMainHeader = new javax.swing.JLabel();
        lblKG = new javax.swing.JLabel();
        txtInputKilos = new javax.swing.JTextField();
        btnConvert = new javax.swing.JButton();
        btnCloseApplication = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lblLBS.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblLBS.setText("LBS: ");
        lblLBS.setToolTipText("");

        txtInputLbs.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        lblMainHeader.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblMainHeader.setText("Weight Conversion Application");
        lblMainHeader.setToolTipText("");

        lblKG.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblKG.setText("KG: ");
        lblKG.setToolTipText("");

        txtInputKilos.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        btnConvert.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnConvert.setText("Convert KG >> LBS");
        btnConvert.setActionCommand("");
        btnConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertActionPerformed(evt);
            }
        });

        btnCloseApplication.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnCloseApplication.setText("Close Application");
        btnCloseApplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseApplicationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnConvert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblMainHeader)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblKG)
                        .addGap(18, 18, 18)
                        .addComponent(txtInputKilos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblLBS)
                        .addGap(18, 18, 18)
                        .addComponent(txtInputLbs, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnCloseApplication, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblMainHeader)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtInputKilos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblKG)
                    .addComponent(txtInputLbs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLBS))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnConvert, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCloseApplication, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertActionPerformed
        doConversion();
    }//GEN-LAST:event_btnConvertActionPerformed

    private void btnCloseApplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseApplicationActionPerformed
        closeApplication();
    }//GEN-LAST:event_btnCloseApplicationActionPerformed

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
            java.util.logging.Logger.getLogger(MyWeight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyWeight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyWeight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyWeight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyWeight().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCloseApplication;
    private javax.swing.JButton btnConvert;
    private javax.swing.JLabel lblKG;
    private javax.swing.JLabel lblLBS;
    private javax.swing.JLabel lblMainHeader;
    private javax.swing.JTextField txtInputKilos;
    private javax.swing.JTextField txtInputLbs;
    // End of variables declaration//GEN-END:variables
}
