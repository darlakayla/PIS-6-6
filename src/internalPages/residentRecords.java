/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internalPages;

import java.awt.Color;
import java.awt.print.PrinterException;
import java.text.MessageFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author HP
 */
public class residentRecords extends javax.swing.JInternalFrame {

    /**
     * Creates new form residentRecords
     */
    public residentRecords() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
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
        search1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_priority = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        firstname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lastname = new javax.swing.JTextField();
        status = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        gender = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        voterstatus = new javax.swing.JTextField();
        search = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        clear = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        delete = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        update = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        insert = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        print = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(null);

        search1.setBackground(new java.awt.Color(255, 153, 153));
        search1.setFont(new java.awt.Font("Baskerville Old Face", 0, 16)); // NOI18N
        jPanel1.add(search1);
        search1.setBounds(20, 10, 240, 30);

        tbl_priority.setBackground(new java.awt.Color(255, 153, 153));
        tbl_priority.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Milinda", "Requinto", "Female", "50", "Married", "Registered"},
                {"2", "Ronald", "Teremocha", "Male", "53", "Married", "Registered"},
                {"3", "Marcel", "Garan", "Female", "58", "Married", "Registered"},
                {"4", "Milodia", "Traya", "Female", "59", "Married", "Registered"},
                {"5", "Binibinida", "Genabe", "Female", "52", "Married", "Registered"},
                {"6", "Victorio", "Iglesia", "Male", "51", "Married", "Registered"},
                {"7", "Maribeth", "Aligado", "Female", "56", "Married", "Registered"},
                {"8", "Cecilia", "Villacensio", "Female", "49", "Married", "Registered"},
                {"9", "Estrella", "Caliñada", "Female", "46", "Married", "Registered"},
                {"10", "Luda", "Geraldez", "Female", "47", "Married", "Registered"}
            },
            new String [] {
                "ID", "FIRST NAME", "LAST NAME", "GENDER", "AGE", "STATUS", "VOTER STATUS"
            }
        ));
        tbl_priority.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_priorityMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_priority);
        if (tbl_priority.getColumnModel().getColumnCount() > 0) {
            tbl_priority.getColumnModel().getColumn(5).setResizable(false);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(250, 80, 620, 340);

        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        jLabel3.setText("Resident ID:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 80, 70, 30);

        id.setBackground(new java.awt.Color(255, 153, 153));
        id.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        jPanel1.add(id);
        id.setBounds(100, 80, 140, 30);

        firstname.setBackground(new java.awt.Color(255, 153, 153));
        firstname.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        firstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnameActionPerformed(evt);
            }
        });
        jPanel1.add(firstname);
        firstname.setBounds(100, 120, 140, 30);

        jLabel4.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        jLabel4.setText("First Name:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 120, 90, 30);

        jLabel5.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        jLabel5.setText("Last Name:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 160, 90, 30);

        lastname.setBackground(new java.awt.Color(255, 153, 153));
        lastname.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        lastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnameActionPerformed(evt);
            }
        });
        jPanel1.add(lastname);
        lastname.setBounds(100, 160, 140, 30);

        status.setBackground(new java.awt.Color(255, 153, 153));
        status.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusActionPerformed(evt);
            }
        });
        jPanel1.add(status);
        status.setBounds(100, 280, 140, 30);

        jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        jLabel2.setText("Status:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 280, 90, 30);

        jLabel6.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        jLabel6.setText("Gender:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 200, 90, 30);

        jLabel7.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        jLabel7.setText("Age:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 240, 90, 30);

        gender.setBackground(new java.awt.Color(255, 153, 153));
        gender.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderActionPerformed(evt);
            }
        });
        jPanel1.add(gender);
        gender.setBounds(100, 200, 140, 30);

        age.setBackground(new java.awt.Color(255, 153, 153));
        age.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageActionPerformed(evt);
            }
        });
        jPanel1.add(age);
        age.setBounds(100, 240, 140, 30);

        jLabel8.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        jLabel8.setText("Voter Status:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(10, 320, 90, 30);

        voterstatus.setBackground(new java.awt.Color(255, 153, 153));
        voterstatus.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        voterstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voterstatusActionPerformed(evt);
            }
        });
        jPanel1.add(voterstatus);
        voterstatus.setBounds(100, 320, 140, 30);

        search.setBackground(new java.awt.Color(255, 153, 153));
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchMouseExited(evt);
            }
        });
        search.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("SEARCH");
        search.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 30));

        jPanel1.add(search);
        search.setBounds(270, 10, 110, 30);

        clear.setBackground(new java.awt.Color(255, 153, 153));
        clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clearMouseExited(evt);
            }
        });
        clear.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CLEAR");
        clear.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 30));

        jPanel1.add(clear);
        clear.setBounds(10, 410, 110, 30);

        delete.setBackground(new java.awt.Color(255, 153, 153));
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteMouseExited(evt);
            }
        });
        delete.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("DELETE");
        delete.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 30));

        jPanel1.add(delete);
        delete.setBounds(130, 410, 110, 30);

        update.setBackground(new java.awt.Color(255, 153, 153));
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateMouseExited(evt);
            }
        });
        update.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("UPDATE");
        update.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 30));

        jPanel1.add(update);
        update.setBounds(10, 370, 110, 30);

        insert.setBackground(new java.awt.Color(255, 153, 153));
        insert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                insertMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                insertMouseExited(evt);
            }
        });
        insert.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("INSERT");
        insert.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 30));

        jPanel1.add(insert);
        insert.setBounds(130, 370, 110, 30);

        print.setBackground(new java.awt.Color(255, 153, 153));
        print.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                printMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                printMouseExited(evt);
            }
        });
        print.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("PRINT REPORT");
        print.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 30));

        jPanel1.add(print);
        print.setBounds(690, 40, 170, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 880, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void firstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstnameActionPerformed

    private void lastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnameActionPerformed

    private void statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusActionPerformed

    private void genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderActionPerformed

    private void ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageActionPerformed

    private void voterstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voterstatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_voterstatusActionPerformed

    private void tbl_priorityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_priorityMouseClicked
        int selectedRow = tbl_priority.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tbl_priority.getModel();
        id.setText(model.getValueAt(selectedRow, 0).toString());
        firstname.setText(model.getValueAt(selectedRow, 1).toString());
        lastname.setText(model.getValueAt(selectedRow, 2).toString());
        gender.setText(model.getValueAt(selectedRow, 3).toString());
        age.setText(model.getValueAt(selectedRow, 4).toString());
        status.setText(model.getValueAt(selectedRow, 5).toString());
        voterstatus.setText(model.getValueAt(selectedRow, 6).toString());
        
        
    }//GEN-LAST:event_tbl_priorityMouseClicked

    private void searchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseEntered
        search.setBackground(navcolor);
    }//GEN-LAST:event_searchMouseEntered

    private void searchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseExited
        search.setBackground(headcolor);
    }//GEN-LAST:event_searchMouseExited

    private void clearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseEntered
        clear.setBackground(navcolor);
    }//GEN-LAST:event_clearMouseEntered

    private void clearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseExited
        clear.setBackground(headcolor);
    }//GEN-LAST:event_clearMouseExited

    private void deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseEntered
        delete.setBackground(navcolor);
    }//GEN-LAST:event_deleteMouseEntered

    private void deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseExited
        delete.setBackground(headcolor);
    }//GEN-LAST:event_deleteMouseExited

    private void updateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseEntered
        update.setBackground(navcolor);
    }//GEN-LAST:event_updateMouseEntered

    private void updateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseExited
        update.setBackground(headcolor);
    }//GEN-LAST:event_updateMouseExited

    private void insertMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertMouseEntered
        insert.setBackground(navcolor);
    }//GEN-LAST:event_insertMouseEntered

    private void insertMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertMouseExited
        insert.setBackground(headcolor);
    }//GEN-LAST:event_insertMouseExited

    private void printMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseEntered
        print.setBackground(navcolor);
    }//GEN-LAST:event_printMouseEntered

    private void printMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseExited
        print.setBackground(headcolor);
    }//GEN-LAST:event_printMouseExited

    private void printMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseClicked
        MessageFormat header = new MessageFormat("PUROK INFORMATION SYSTEM");
        MessageFormat footer = new MessageFormat("Tagbuag-tubig, Tagjaguimit City of Naga, Cebu");
        try{
            tbl_priority.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        }catch(PrinterException e){
            JOptionPane.showMessageDialog(null, "Cannot be print!"+e.getMessage());
        }
    }//GEN-LAST:event_printMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField age;
    private javax.swing.JPanel clear;
    private javax.swing.JPanel delete;
    private javax.swing.JTextField firstname;
    private javax.swing.JTextField gender;
    private javax.swing.JTextField id;
    private javax.swing.JPanel insert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lastname;
    private javax.swing.JPanel print;
    private javax.swing.JPanel search;
    private javax.swing.JTextField search1;
    private javax.swing.JTextField status;
    private javax.swing.JTable tbl_priority;
    private javax.swing.JPanel update;
    private javax.swing.JTextField voterstatus;
    // End of variables declaration//GEN-END:variables
}
