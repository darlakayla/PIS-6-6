/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp;


import config.dbconfiguration;
import config.login_db;
import java.awt.Color;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Base64;
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
    
        public String hashPassword(String password) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(password.getBytes());
        byte[] digest = md.digest();
        return String.format("%064x", new java.math.BigInteger(1, digest));
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
        minimize = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        close1 = new javax.swing.JLabel();
        minimize1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        clear = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        register = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        firstname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lastname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        icon1 = new javax.swing.JLabel();
        icon2 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(255, 153, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        close1.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        close1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close1.setText("X");
        close1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close1MouseClicked(evt);
            }
        });
        jPanel3.add(close1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 30, 50));

        minimize1.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        minimize1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimize1.setText("—");
        minimize1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimize1MouseClicked(evt);
            }
        });
        jPanel3.add(minimize1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 30, 40));

        jLabel2.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        jLabel2.setText("REGISTER");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 200, 50));

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 0, 460, 50);

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
        clear.setBounds(110, 380, 110, 40);

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
        register.setBounds(250, 380, 110, 40);

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsFolder/left-arrow-in-circular-button-bl.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        jPanel1.add(back);
        back.setBounds(20, 410, 30, 30);

        jLabel1.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel1.setText("Firstname:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, 120, 100, 30);

        firstname.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jPanel1.add(firstname);
        firstname.setBounds(160, 120, 250, 30);

        jLabel3.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel3.setText("Lastname:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 170, 100, 30);

        lastname.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jPanel1.add(lastname);
        lastname.setBounds(160, 170, 250, 30);

        jLabel4.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel4.setText("Username:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 220, 100, 30);

        username.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jPanel1.add(username);
        username.setBounds(160, 220, 250, 30);

        jLabel6.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel6.setText("Password:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(40, 320, 100, 30);

        email.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jPanel1.add(email);
        email.setBounds(160, 270, 250, 30);

        jLabel7.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel7.setText("Email:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(40, 270, 100, 30);

        icon1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsFolder/show (1).png"))); // NOI18N
        icon1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icon1MousePressed(evt);
            }
        });
        jPanel1.add(icon1);
        icon1.setBounds(370, 320, 30, 30);

        icon2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsFolder/hide (1).png"))); // NOI18N
        icon2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icon2MousePressed(evt);
            }
        });
        jPanel1.add(icon2);
        icon2.setBounds(370, 320, 30, 30);

        password.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jPanel1.add(password);
        password.setBounds(160, 320, 250, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseClicked
        firstname.setText(null);
        lastname.setText(null);
        email.setText(null);      
        username.setText(null);
        password.setText(null);
    }//GEN-LAST:event_clearMouseClicked

    private void clearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseEntered
        clear.setBackground(navcolor);
    }//GEN-LAST:event_clearMouseEntered

    private void clearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseExited
        clear.setBackground(headcolor);
    }//GEN-LAST:event_clearMouseExited

    private void registerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerMouseEntered
       register.setBackground(navcolor);
    }//GEN-LAST:event_registerMouseEntered

    private void registerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerMouseExited
        register.setBackground(headcolor);
    }//GEN-LAST:event_registerMouseExited

    private void registerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerMouseClicked
         
        String fname = firstname.getText();
        String lname = lastname.getText();
        String uname = username.getText();
        String ema = email.getText();
        String pass = String.valueOf(password.getPassword());
        
        
        if (uname.equals(""))
        {
            JOptionPane.showMessageDialog(null, "All Fields Are Required!");
        }else if (pass.equals("")){
            JOptionPane.showMessageDialog(null, "Add a password");
        }
        else if (checkUsername(uname))
        {
             JOptionPane.showMessageDialog(null, "This Username Already Exist");
        }
        else{
        
        PreparedStatement ps;
        ResultSet rs;
        String registerUserQuery = "INSERT INTO `user_db`(`u_firstname`, `u_lastname`, `u_username`, `u_email`, `u_password`) VALUES (?,?,?,?,?)";

            try {
                ps = login_db.getConnection().prepareStatement(registerUserQuery);
                ps.setString(1, fname);
                ps.setString(2, lname);
                ps.setString(3, uname);
                ps.setString(4, ema);
                ps.setString(5, hashPassword(pass));
             
                    if(ps.executeUpdate() > 0){
                        JOptionPane.showMessageDialog(null, "New User Add");
                        loginForm lf = new loginForm();
                        this.dispose();
                        lf.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "Error: Check Your Information");
            }
            }catch (SQLException ex) {
                Logger.getLogger(registerForm.class.getName()).log(Level.SEVERE, null, ex);
            }catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(registerForm.class.getName()).log(Level.SEVERE, null, ex); 
        
        }
        }
  
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

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        loginForm lo = new loginForm();
        lo.setVisible(true);       
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void icon1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon1MousePressed
        icon2.setVisible(true);
        icon1.setVisible(false);
        password.setEchoChar((char)0);
    }//GEN-LAST:event_icon1MousePressed

    private void icon2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon2MousePressed
        icon1.setVisible(true);
        icon2.setVisible(false);
        password.setEchoChar('*');
    }//GEN-LAST:event_icon2MousePressed

    private void icon1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_icon1MouseClicked

        public boolean  checkUsername(String username)
    {
         PreparedStatement ps;      
         ResultSet rs;
         boolean checkUser= false;
        
         String query = "SELECT * FROM `user_db` WHERE `u_username`= ?";
         
            try {
                ps = login_db.getConnection().prepareStatement(query);
                ps.setString(1, username);
             
              rs = ps.executeQuery();
            
            if(rs.next())
            {
                checkUser =true;
            }
            }catch (SQLException ex) {
            Logger.getLogger(registerForm.class.getName()).log(Level.SEVERE, null, ex);
            }
          return checkUser; 
    }      
    

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
    private javax.swing.JLabel back;
    private javax.swing.JPanel clear;
    private javax.swing.JLabel close;
    private javax.swing.JLabel close1;
    private javax.swing.JTextField email;
    private javax.swing.JTextField firstname;
    private javax.swing.JLabel icon1;
    private javax.swing.JLabel icon2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField lastname;
    private javax.swing.JLabel minimize;
    private javax.swing.JLabel minimize1;
    private javax.swing.JPasswordField password;
    private javax.swing.JPanel register;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
