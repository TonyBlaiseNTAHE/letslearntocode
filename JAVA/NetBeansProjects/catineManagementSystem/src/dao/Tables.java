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
            String categoryTable = "create table category(id int AUTO_INCREMENT primary key, name varchar(200))";
            String productTable = "create table product(id int AUTO_INCREMENT primary key, name varchar(200), category varchar(200), price varchar(200))";
            DbOperations.setDataOrDelete(productTable, "product table created successfully");
            DbOperations.setDataOrDelete(userTable, "User Table Created Successfully");
            DbOperations.setDataOrDelete(adminDetails, "Admin details added Successfully");
            DbOperations.setDataOrDelete(categoryTable, "category table created succefully");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
