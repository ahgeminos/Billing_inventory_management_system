
package billing_management_system;

import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {

    
    public Login() {
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

        username_label = new javax.swing.JLabel();
        password_label = new javax.swing.JLabel();
        username_TextField = new javax.swing.JTextField();
        PasswordField = new javax.swing.JPasswordField();
        password_CheckBox = new javax.swing.JCheckBox();
        login_Button = new javax.swing.JButton();
        close_Button = new javax.swing.JButton();
        Login_gif_label = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setMaximumSize(new java.awt.Dimension(1250, 767));
        setMinimumSize(new java.awt.Dimension(1250, 767));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1250, 767));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        username_label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        username_label.setText("Username");
        getContentPane().add(username_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 370, -1, -1));

        password_label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        password_label.setText("Password");
        getContentPane().add(password_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 410, -1, -1));

        username_TextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(username_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 370, 200, -1));

        PasswordField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordFieldActionPerformed(evt);
            }
        });
        getContentPane().add(PasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 410, 200, -1));

        password_CheckBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        password_CheckBox.setText("Show Password");
        password_CheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_CheckBoxActionPerformed(evt);
            }
        });
        getContentPane().add(password_CheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 460, -1, -1));

        login_Button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        login_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/management/system/login.png"))); // NOI18N
        login_Button.setText("Login");
        login_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(login_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 510, -1, -1));

        close_Button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        close_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/management/system/close Jframe.png"))); // NOI18N
        close_Button.setText("Close");
        close_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(close_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 510, -1, -1));

        Login_gif_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/management/system/login ani.gif"))); // NOI18N
        getContentPane().add(Login_gif_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 250, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing_management_system/login background.PNG"))); // NOI18N
        jLabel1.setMaximumSize(null);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void close_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close_ButtonActionPerformed
        // TODO add your handling code here:
        int a=JOptionPane.showConfirmDialog(null,"Do you really want to Close Application","Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_close_ButtonActionPerformed

    private void login_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_ButtonActionPerformed
        // TODO add your handling code here:
        if(username_TextField.getText().equals("User") && PasswordField.getText().equals("Admin"))
        {
           setVisible(false);
           new Home().setVisible(true);
        }
        else
           JOptionPane.showMessageDialog(null,"Incorrect Username or Password");
        
    }//GEN-LAST:event_login_ButtonActionPerformed

    private void password_CheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password_CheckBoxActionPerformed
        // TODO add your handling code here:
        if(password_CheckBox.isSelected())
        {
            PasswordField.setEchoChar((char)0);
        }
        else
            PasswordField.setEchoChar('*');
    }//GEN-LAST:event_password_CheckBoxActionPerformed

    private void PasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordFieldActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Login_gif_label;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JButton close_Button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton login_Button;
    private javax.swing.JCheckBox password_CheckBox;
    private javax.swing.JLabel password_label;
    private javax.swing.JTextField username_TextField;
    private javax.swing.JLabel username_label;
    // End of variables declaration//GEN-END:variables

}
