/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp;


import config.login_db;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class registerForm extends javax.swing.JFrame {

    /**
     * Creates new form registerForm
     */
    public registerForm() {
        initComponents();     
        
    }
    
    
        Color navcolor= new Color(255,102,102);
        Color headcolor= new Color(255,153,153);
        Color bodycolor = new Color(255,204,204);
        
        
        
        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        close1 = new javax.swing.JLabel();
        minimize1 = new javax.swing.JLabel();
        clear = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtcontact = new javax.swing.JTextField();
        txtfirstname = new javax.swing.JTextField();
        txtlastname = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtusername = new javax.swing.JTextField();
        register = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(255, 153, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        jLabel1.setText("REGISTER");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 200, 40));

        minimize.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimize.setText("—");
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        jPanel3.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 10, 30, 50));

        close.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setText("X");
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        jPanel3.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 0, 30, 60));

        close1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        close1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close1.setText("X");
        close1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close1MouseClicked(evt);
            }
        });
        jPanel3.add(close1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 30, 50));

        minimize1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        minimize1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimize1.setText("—");
        minimize1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimize1MouseClicked(evt);
            }
        });
        jPanel3.add(minimize1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 30, 40));

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 0, 470, 50);

        clear.setBackground(new java.awt.Color(255, 153, 153));
        clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clearMouseExited(evt);
            }
        });
        clear.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("CLEAR");
        clear.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 40));

        jPanel1.add(clear);
        clear.setBounds(100, 430, 110, 40);

        txtcontact.setBackground(new java.awt.Color(255, 204, 204));
        txtcontact.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        txtcontact.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Contact No.", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Baskerville Old Face", 0, 15))); // NOI18N
        txtcontact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcontactActionPerformed(evt);
            }
        });
        jPanel1.add(txtcontact);
        txtcontact.setBounds(60, 250, 330, 50);

        txtfirstname.setBackground(new java.awt.Color(255, 204, 204));
        txtfirstname.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        txtfirstname.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Firstname", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Baskerville Old Face", 0, 15))); // NOI18N
        txtfirstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfirstnameActionPerformed(evt);
            }
        });
        jPanel1.add(txtfirstname);
        txtfirstname.setBounds(60, 70, 330, 50);

        txtlastname.setBackground(new java.awt.Color(255, 204, 204));
        txtlastname.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        txtlastname.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Lastname", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Baskerville Old Face", 0, 15))); // NOI18N
        txtlastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlastnameActionPerformed(evt);
            }
        });
        jPanel1.add(txtlastname);
        txtlastname.setBounds(60, 130, 330, 50);

        txtemail.setBackground(new java.awt.Color(255, 204, 204));
        txtemail.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        txtemail.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Email", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Baskerville Old Face", 0, 15))); // NOI18N
        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });
        jPanel1.add(txtemail);
        txtemail.setBounds(60, 310, 330, 50);

        txtusername.setBackground(new java.awt.Color(255, 204, 204));
        txtusername.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        txtusername.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Username", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Baskerville Old Face", 0, 15))); // NOI18N
        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });
        jPanel1.add(txtusername);
        txtusername.setBounds(60, 190, 330, 50);

        register.setBackground(new java.awt.Color(255, 153, 153));
        register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registerMouseExited(evt);
            }
        });
        register.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("REGISTER");
        register.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 40));

        jPanel1.add(register);
        register.setBounds(230, 430, 110, 40);

        txtpassword.setBackground(new java.awt.Color(255, 204, 204));
        txtpassword.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        txtpassword.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Baskerville Old Face", 0, 15))); // NOI18N
        jPanel1.add(txtpassword);
        txtpassword.setBounds(60, 370, 330, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseClicked
        txtfirstname.setText(null);
        txtlastname.setText(null);
        txtemail.setText(null);      
        txtusername.setText(null);
        txtcontact.setText(null);
    }//GEN-LAST:event_clearMouseClicked

    private void clearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseEntered
        clear.setBackground(navcolor);
    }//GEN-LAST:event_clearMouseEntered

    private void clearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseExited
        clear.setBackground(headcolor);
    }//GEN-LAST:event_clearMouseExited

    private void txtcontactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcontactActionPerformed

    }//GEN-LAST:event_txtcontactActionPerformed

    private void txtfirstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfirstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfirstnameActionPerformed

    private void txtlastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlastnameActionPerformed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void txtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusernameActionPerformed

    private void registerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerMouseEntered
       register.setBackground(navcolor);
    }//GEN-LAST:event_registerMouseEntered

    private void registerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerMouseExited
        register.setBackground(headcolor);
    }//GEN-LAST:event_registerMouseExited

    private void registerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerMouseClicked
         
        if (txtfirstname.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please type your Firstname!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }else if(txtlastname.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please type your Lastname!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }else if (txtusername.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please type your Username!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }else if(txtcontact.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please type your Contact!", "Error", JOptionPane.ERROR_MESSAGE);
            return;      
        }else if(txtemail.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please type your Email!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }else if(txtpassword.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please type your Password!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }      
        
        String fname = txtfirstname.getText();
        String lname = txtlastname.getText();
        String uname = txtusername.getText();
        String cont = txtcontact.getText();
        String ema = txtemail.getText();
        String pass = String.valueOf(txtpassword.getPassword());        
         
        PreparedStatement ps;
        ResultSet rs;
        String registerUserQuery = "INSERT INTO `user_db`(`u_firstname`, `u_lastname`, `u_username`, `u_contact`, `u_email`, `u_password`) VALUES (?,?,?,?,?,?)";
                 
                 try {
                     
                     ps = login_db.getConnection().prepareStatement(registerUserQuery);
                     ps.setString(1, fname);
                     ps.setString(2, lname);
                     ps.setString(3, uname);
                     ps.setString(4, cont);
                     ps.setString(5, ema);
                     ps.setString(6, pass);
                           if(ps.executeUpdate() != 0){
                             JOptionPane.showMessageDialog(null, "Your Account Has Been Created");
                         }else{
                             JOptionPane.showMessageDialog(null, "Error: Check Your Information");
                         }
                 } catch (SQLException ex) {
                     Logger.getLogger(registerForm.class.getName()).log(Level.SEVERE, null, ex);
                 }
                 
           loginForm lo = new loginForm();
           lo.setVisible(true);
           this.dispose();        

    }//GEN-LAST:event_registerMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        int a =JOptionPane.showConfirmDialog(null, "Confirm Exit?");
        if(a == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_closeMouseClicked

    private void close1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close1MouseClicked
        int a =JOptionPane.showConfirmDialog(null, "Confirm Exit?");
        if(a == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_close1MouseClicked

    private void minimize1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimize1MouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_minimize1MouseClicked

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
            java.util.logging.Logger.getLogger(registerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registerForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel clear;
    private javax.swing.JLabel close;
    private javax.swing.JLabel close1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel minimize;
    private javax.swing.JLabel minimize1;
    private javax.swing.JPanel register;
    public javax.swing.JTextField txtcontact;
    public javax.swing.JTextField txtemail;
    public javax.swing.JTextField txtfirstname;
    public javax.swing.JTextField txtlastname;
    private javax.swing.JPasswordField txtpassword;
    public javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
