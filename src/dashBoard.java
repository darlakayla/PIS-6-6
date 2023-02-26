/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Color;
import internalPages.*;
import internalPages.dashBoardPage;
/**
 *
 * @author SCC-COLLEGE
 */
public class dashBoard extends javax.swing.JFrame {

    /**
     * Creates new form dashBoard
     */
    public dashBoard() {
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
        navbar = new javax.swing.JPanel();
        dashpane1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        reportspane = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        userpane1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        maindesktop = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(null);

        navbar.setBackground(new java.awt.Color(255, 102, 102));
        navbar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dashpane1.setBackground(new java.awt.Color(255, 102, 102));
        dashpane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashpane1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dashpane1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dashpane1MouseExited(evt);
            }
        });
        dashpane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DASHBOARD");
        dashpane1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 170, -1));

        navbar.add(dashpane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 170, 40));

        reportspane.setBackground(new java.awt.Color(255, 102, 102));
        reportspane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reportspaneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reportspaneMouseExited(evt);
            }
        });
        reportspane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("REPORTS");
        reportspane.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 170, 20));

        navbar.add(reportspane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 170, 40));

        userpane1.setBackground(new java.awt.Color(255, 102, 102));
        userpane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userpane1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                userpane1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                userpane1MouseExited(evt);
            }
        });
        userpane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("USER PAGE");
        userpane1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 170, 20));

        navbar.add(userpane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 170, 40));

        jPanel1.add(navbar);
        navbar.setBounds(0, 0, 170, 470);

        header.setBackground(new java.awt.Color(255, 153, 153));

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel1.add(header);
        header.setBounds(150, 0, 780, 50);

        maindesktop.setBackground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout maindesktopLayout = new javax.swing.GroupLayout(maindesktop);
        maindesktop.setLayout(maindesktopLayout);
        maindesktopLayout.setHorizontalGroup(
            maindesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );
        maindesktopLayout.setVerticalGroup(
            maindesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        jPanel1.add(maindesktop);
        maindesktop.setBounds(170, 40, 760, 430);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 926, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dashpane1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashpane1MouseEntered
      dashpane1.setBackground(bodycolor);
    }//GEN-LAST:event_dashpane1MouseEntered

    private void dashpane1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashpane1MouseExited
      dashpane1.setBackground(navcolor);
    }//GEN-LAST:event_dashpane1MouseExited

    private void reportspaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportspaneMouseEntered
      reportspane.setBackground(bodycolor);
    }//GEN-LAST:event_reportspaneMouseEntered

    private void reportspaneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportspaneMouseExited
      reportspane.setBackground(navcolor);
    }//GEN-LAST:event_reportspaneMouseExited

    private void userpane1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userpane1MouseEntered
      userpane1.setBackground(bodycolor);
    }//GEN-LAST:event_userpane1MouseEntered

    private void userpane1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userpane1MouseExited
      userpane1.setBackground(navcolor);
    }//GEN-LAST:event_userpane1MouseExited

    private void userpane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userpane1MouseClicked
      userPage up = new userPage();
      maindesktop.add(up).setVisible(true);
    }//GEN-LAST:event_userpane1MouseClicked

    private void dashpane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashpane1MouseClicked
       dashBoardPage dbp = new dashBoardPage();
       maindesktop.add(dbp).setVisible(true);
    }//GEN-LAST:event_dashpane1MouseClicked

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
            java.util.logging.Logger.getLogger(dashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashBoard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel dashpane1;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JDesktopPane maindesktop;
    private javax.swing.JPanel navbar;
    private javax.swing.JPanel reportspane;
    private javax.swing.JPanel userpane1;
    // End of variables declaration//GEN-END:variables
}
