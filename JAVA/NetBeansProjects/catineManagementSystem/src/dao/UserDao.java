/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import javax.swing.JOptionPane;
import model.User;
import java.sql.*;

/**
 *
 * @author ntahetonyblaise
 */
public class UserDao {
    public static void save(User user){
        String sql = "insert into user(name, email, phoneNumber, address, password, status) values('"+user.getName()+"', '"+user.getEmail()+"', '"+user.getPhoneNumber()+"', '"+user.getAddress()+"','"+user.getPassword()+"', 'false')";
        DbOperations.setDataOrDelete(sql, "Registered Successfullly! wait for Admin Approval!");
        
    }
    public static User login(String email, String pwd) {
        User user = null;
        
        try {
            ResultSet rs = DbOperations.getData("select * FROM user WHERE email='"+email+"' and password='"+pwd+"'");
             while (rs.next()) {
                 user = new User();
                 user.setStatus(rs.getString("status"));
             }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return user;
    }
    /*public static  User getSecurityQuestion(String email) {
        User user =  null;
        try {
            ResultSet rs = DbOperations.getData("select * from user email = ' "+ email + "'");
            while (rs.next()) {
                user = new User();
                user.setSecurityQuestion(rs.getString("securityQuestion"));
                user.setAnswer(rs.getString("answer"));
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return user;
    }*/
}
