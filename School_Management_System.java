/**
 *
 * @author JayZobalia
 */
package com.School_Management_System;

import java.sql.*;

public class School_Management_System {
    static int count =0;
    static String strr = "";
    public static Connection con;

    public static void main(String[] args)   {

        LoginPage main_obb = new LoginPage();


    }

    School_Management_System(String okay) throws SQLException {


        strr = strr + okay;
        count = count+1;
        if(count == 3){
            String url ="jdbc:mysql://localhost:3306/student_management_system";
            String user = "root";
            String pass = "J@y7506003943";
            con = DriverManager.getConnection(url,user,pass);
            Statement st = con.createStatement();
            int rs = st.executeUpdate(strr);
            con.close();
        }
    }
}

