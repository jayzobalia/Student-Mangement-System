package com.School_Management_System;

import javax.swing.JFrame;
import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;
import java.sql.*;

import net.proteanit.sql.*;

public class Display_Page extends JFrame implements ActionListener {

    JTable t1;
    JButton b1,b2;
    JLabel l1,l2,l3,l4,l5,l6,l7;
    public static Connection con;

    Display_Page(){
        t1= new JTable();
        t1.setBounds(0,40,1000,500);
        add(t1);

        b1=new JButton("LOAD DATA");
        b1.setBounds(350,560,120,30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

        b2=new JButton("BACK");
        b2.setBounds(530,560,120,30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);

        l1=new JLabel("Std_ID");
        l1.setBounds(40,10,70,20);
        add(l1);

        l2=new JLabel("Name");
        l2.setBounds(160,10,70,20);
        add(l2);

        l3=new JLabel("Surname");
        l3.setBounds(290,10,70,20);
        add(l3);

        l4=new JLabel("Class");
        l4.setBounds(435,10,100,20);
        add(l4);

        l5=new JLabel("Roll No.");
        l5.setBounds(580,10,70,20);
        add(l5);

        l6=new JLabel("Fees");
        l6.setBounds(735,10,100,20);
        add(l6);

        l7=new JLabel("Marks");
        l7.setBounds(885,10,70,20);
        add(l7);


        getContentPane().setBackground(Color.WHITE);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setBounds(300,100,1000,650);
        setVisible(true);

    }

    public static void main(String agrs[]){
        new Display_Page().setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            try{

                String url ="jdbc:mysql://localhost:3306/student_management_system";
                String user = "root";
                String pass = "J@y7506003943";
                String query = "SELECT * FROM student_management_system.student_management_system;";
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection(url,user,pass);
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(query);

                t1.setModel(DbUtils.resultSetToTableModel(rs));

            }
            catch(Exception ae){

            }

        }else if(e.getSource()==b2){
            new Main_menu().setVisible(true);
            this.setVisible(false);
        }


}}

