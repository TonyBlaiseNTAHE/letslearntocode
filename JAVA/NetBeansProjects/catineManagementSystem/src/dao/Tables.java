/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;

/**
 *
 * @author ntahetonyblaise
 */
public class Tables {
    public static void  main(String[] args){
        try {
            String userTable;
            userTable = "create table user(id int AUTO_INCREMENT primary key, name varchar(200), email varchar(200), Phonenumber varchar(10), address varchar(200), password varchar(200), status varchar(20), UNIQUE(email));";
            String adminDetails = "insert user(name, email, Phonenumber, address, password, status) values('TonyHac', 'tonyntahe@gmail.com', '0782020123', 'Kimironko', '1234567890','true')";
            DbOperations.setDataOrDelete(userTable, "User Table Created Successfully");
            DbOperations.setDataOrDelete(adminDetails, "Admin details added Successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
