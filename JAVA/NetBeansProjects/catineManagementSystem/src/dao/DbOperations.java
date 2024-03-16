/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;


import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author ntahetonyblaise
 */
public class DbOperations {
    public static void setDataOrDelete(String sql, String msg) {
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            st.executeUpdate(sql);
            if(!msg.equals(""))
                JOptionPane.showMessageDialog(null, msg);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e, "Message", JOptionPane.ERROR_MESSAGE);
            
        }
    }
    public static ResultSet getData(String sql) {
        
        try {
          Connection con =  ConnectionProvider.getCon();
          Statement st = con.createStatement();
          ResultSet rs = st.executeQuery(sql);
          return rs; 
          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Message", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

}
