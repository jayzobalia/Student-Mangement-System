/**
 *
 * @author JayZobalia
 */
package com.School_Management_System;

import javax.swing.JOptionPane;

import java.sql.*;

public class Studentfeessubmission extends javax.swing.JFrame {
    public static Connection con;


    public Studentfeessubmission() {
        initComponents();
    }


    @SuppressWarnings("unchecked")

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        admfee = new javax.swing.JTextField();
        sfee = new javax.swing.JTextField();
        mfee = new javax.swing.JTextField();
        efee = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 255));
        jLabel1.setText("Student's Fee Counter");

        jLabel2.setText("Admission Fee:");

        jLabel3.setText("Sports Fee:");

        jLabel4.setText("Monthly Fee:");

        jLabel5.setText("Extracurriculum Fee:");

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jButton1ActionPerformed(evt);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        efee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                efeeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(232, 232, 232)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jButton1)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(admfee)
                                                        .addComponent(sfee)
                                                        .addComponent(mfee)
                                                        .addComponent(efee, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))))
                                .addGap(371, 371, 371))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(42, 42, 42)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel2)
                                                        .addComponent(admfee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel3)
                                                        .addComponent(sfee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel4))
                                        .addComponent(mfee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(efee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addComponent(jButton1)
                                .addContainerGap(180, Short.MAX_VALUE))
        );

        pack();
    }

    private void efeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_efeeActionPerformed
        // TODO add your handling code here:
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {//GEN-FIRST:event_jButton1ActionPerformed

        int af=Integer.parseInt(admfee.getText());
        int sf=Integer.parseInt(sfee.getText());
        int ef=Integer.parseInt(efee.getText());
        int mf=Integer.parseInt(mfee.getText());

        int total=af+sf+ef+mf;
        JOptionPane.showMessageDialog(rootPane, total+" Rs");
        Display_Page new_obj = new Display_Page();


//        String url ="jdbc:mysql://localhost:3306/student_management_system";
//        String user = "root";
//        String pass = "J@y7506003943";
        String query = "'"+total+"',";
        Class.forName("com.mysql.cj.jdbc.Driver");
        School_Management_System obj = new School_Management_System(query);
//        con = DriverManager.getConnection(url,user,pass);
//        Statement st = con.createStatement();
//        int rs = st.executeUpdate(query);
//        con.close();

        StudentReportcard obj5=new StudentReportcard();
        obj5.setVisible(true);
        dispose();
    }


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Studentfeessubmission().setVisible(true);
            }
        });
    }


    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField admfee;
    private javax.swing.JTextField efee;
    private javax.swing.JTextField mfee;
    private javax.swing.JTextField sfee;

}