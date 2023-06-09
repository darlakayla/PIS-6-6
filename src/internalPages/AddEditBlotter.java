/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internalPages;

import config.dbconfiguration;
import java.awt.Color;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author HP
 */
public class AddEditBlotter extends javax.swing.JFrame {

    /**
     * Creates new form AddEditBlotter
     */
    public AddEditBlotter() {
        initComponents();
    }
        Color navcolor= new Color(255,102,102);
        Color headcolor= new Color(255,153,153);
        Color bodycolor = new Color(255,204,204);
        
        public String action;
        
        public void close(){
        this.dispose();
        dashBoard db = new dashBoard();
        db.setVisible(true);
        ResidentInfo rr = new ResidentInfo();
        db.maindesktop.add(rr).setVisible(true);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        stat = new javax.swing.JComboBox<>();
        rmid = new javax.swing.JTextField();
        cmid = new javax.swing.JTextField();
        sched = new com.toedter.calendar.JDateChooser();
        accus = new javax.swing.JTextField();
        cano = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        add1 = new javax.swing.JPanel();
        st_label = new javax.swing.JLabel();
        clastn = new javax.swing.JTextField();
        cfname = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        rlastn = new javax.swing.JTextField();
        rfname = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        jLabel9.setText("BLOTTER");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 170, 40));

        exit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.setText("X");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        jPanel2.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 10, 40, 30));

        minimize.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimize.setText("—");
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        jPanel2.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 10, 40, 40));

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 1080, 60);

        jLabel15.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("ID:");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(70, 120, 120, 40);

        jLabel4.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Case No.");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(70, 170, 120, 40);

        jLabel5.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Accusation:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(70, 220, 120, 40);

        jLabel6.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Schedule:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(70, 270, 120, 40);

        jLabel13.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("(MIDDLE INITIAL)");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(70, 420, 120, 40);

        jLabel14.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jLabel14.setText("Respondent: (LASTNAME)");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(550, 120, 170, 40);

        jLabel1.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jLabel1.setText("Status:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(600, 270, 120, 40);

        stat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Not Settled", "On-going Settled", "Settled" }));
        jPanel1.add(stat);
        stat.setBounds(720, 270, 280, 40);

        rmid.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jPanel1.add(rmid);
        rmid.setBounds(720, 220, 280, 40);

        cmid.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jPanel1.add(cmid);
        cmid.setBounds(190, 420, 280, 40);
        jPanel1.add(sched);
        sched.setBounds(190, 270, 280, 40);

        accus.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jPanel1.add(accus);
        accus.setBounds(190, 220, 280, 40);

        cano.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jPanel1.add(cano);
        cano.setBounds(190, 170, 280, 40);

        id.setEditable(false);
        id.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jPanel1.add(id);
        id.setBounds(190, 120, 280, 40);

        add1.setBackground(new java.awt.Color(255, 153, 153));
        add1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                add1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                add1MouseExited(evt);
            }
        });
        add1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        st_label.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        st_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        st_label.setText("LABEL");
        add1.add(st_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 30));

        jPanel1.add(add1);
        add1.setBounds(910, 350, 100, 30);

        clastn.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jPanel1.add(clastn);
        clastn.setBounds(190, 320, 280, 40);

        cfname.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jPanel1.add(cfname);
        cfname.setBounds(190, 370, 280, 40);

        jLabel16.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jLabel16.setText("Complainant:(LASTNAME)");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(20, 320, 170, 40);

        jLabel17.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel17.setText("(FIRST NAME)");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(70, 370, 120, 40);

        jLabel18.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel18.setText("(FIRST NAME)");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(600, 170, 120, 40);

        jLabel19.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel19.setText("(MIDDLE INITIAL)");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(600, 220, 120, 40);

        rlastn.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jPanel1.add(rlastn);
        rlastn.setBounds(720, 120, 280, 40);

        rfname.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jPanel1.add(rfname);
        rfname.setBounds(720, 170, 280, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1074, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        int a=JOptionPane.showConfirmDialog(null, "Confirm Exit?");
        if(a==JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_exitMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void add1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add1MouseClicked
         if(action.equals("Add")){
           dbconfiguration dbc = new dbconfiguration();        
           int result=0;
           try{
            
            String sql = "INSERT INTO blotter (b_caseno, b_accusation, b_schedule, complainantlastname, cfirstname, cmiddle, respondentlastname, rfirstname, rmiddle, b_status) VALUES (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = dbc.connection.prepareStatement(sql);
            pst.setString(1, cano.getText());          
            pst.setString(2, accus.getText());
            pst.setString(3,((JTextField)sched.getDateEditor().getUiComponent()).getText());
            pst.setString(4, clastn.getText());
            pst.setString(5, cfname.getText());
            pst.setString(6, cmid.getText());
            pst.setString(7, rlastn.getText());
            pst.setString(8, rfname.getText());
            pst.setString(9, rmid.getText());
            pst.setString(10, stat.getSelectedItem().toString());
            
            pst.execute();
            close();
        }catch(Exception e){             
        }
           if(result == 1){
               JOptionPane.showMessageDialog(null, "Successfully Save!");
            
           }else{
                System.out.println("Saving Data Failed!");
           }
       }else if(action.equals("Update")){
           
           dbconfiguration dbc = new dbconfiguration();
           
           try{
           String sql = "UPDATE blotter SET b_caseno = ?, b_accusation = ?, b_schedule = ?, complainantlastname = ?, cfirstname = ?, cmiddle = ?,  respondentlastname = ?, rfirstname = ?, rmiddle = ?, b_status = ?  WHERE b_id = '"+id.getText()+"'";
           PreparedStatement pst = dbc.connection.prepareStatement(sql);
            pst.setString(1, cano.getText());          
            pst.setString(2, accus.getText());
            pst.setString(3,((JTextField)sched.getDateEditor().getUiComponent()).getText());
            pst.setString(4, clastn.getText());
            pst.setString(5, cfname.getText());
            pst.setString(6, cmid.getText());
            pst.setString(7, rlastn.getText());
            pst.setString(8, rfname.getText());
            pst.setString(9, rmid.getText());
            pst.setString(10, stat.getSelectedItem().toString());
            
            pst.execute();
            close();
           
           JOptionPane.showMessageDialog(null, "Successfully Updated!");
           }catch(SQLException e){
               System.out.println("Database Connection Error!");
           }
       }else{
           JOptionPane.showMessageDialog(null, "No action selected!");
          
       }   
      

    }//GEN-LAST:event_add1MouseClicked

    private void add1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add1MouseEntered
        add1.setBackground(navcolor);
    }//GEN-LAST:event_add1MouseEntered

    private void add1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add1MouseExited
        add1.setBackground(headcolor);
    }//GEN-LAST:event_add1MouseExited

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
            java.util.logging.Logger.getLogger(AddEditBlotter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEditBlotter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEditBlotter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEditBlotter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEditBlotter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField accus;
    private javax.swing.JPanel add1;
    public javax.swing.JTextField cano;
    public javax.swing.JTextField cfname;
    public javax.swing.JTextField clastn;
    public javax.swing.JTextField cmid;
    private javax.swing.JLabel exit;
    public javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel minimize;
    public javax.swing.JTextField rfname;
    public javax.swing.JTextField rlastn;
    public javax.swing.JTextField rmid;
    public static com.toedter.calendar.JDateChooser sched;
    public javax.swing.JLabel st_label;
    public javax.swing.JComboBox<String> stat;
    // End of variables declaration//GEN-END:variables
}
