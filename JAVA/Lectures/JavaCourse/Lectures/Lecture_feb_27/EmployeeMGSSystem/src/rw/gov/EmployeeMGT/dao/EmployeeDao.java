
package rw.gov.EmployeeMGT.dao;

import java.sql.*;
import rw.gov.EmployeeMGT.model.Employee;

/**
 *
 * @author Tony Blaise NTAHE id = 23379
 */
public class EmployeeDao {
    // Global variable declaration
    private String jdbcUrl  =  "jdbc:mysql://localhost:3306/Employe";
    private String dbUsername = "root";
    private String dbPasswd = "%password%";
    // CRUD Operation
    //Create Operation
    
    public void registerEmployee(Employee empObj){
        // surround with try and catch
        try{
            // create connection
            Connection con = DriverManager.getConnection(jdbcUrl, dbUsername,dbPasswd);
            // create statement
            Statement st = con.createStatement();
            // execute statement
            String sql = "INSERT INTO employee (emp_id,emp_names) values("+empObj.getEmployeeId()+",'"+empObj.getEmployeeName()+"')";
            int rowAffected = st.executeUpdate(sql);
            if(rowAffected > 0){
                System.out.println("Data Saved!");
            }else{
                System.out.println("Data Not Saved!");
            }
            // close connection
            con.close();
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

    public void deleteEmployee(int empId){
    // surround with try and catch
    try{
        // create connection
        Connection con = DriverManager.getConnection(jdbcUrl, dbUsername,dbPasswd);
        String sql = "SELECT emp_id FROM employee WHERE emp_id = ?";
        // create prepared statement
        PreparedStatement ps = con.prepareStatement(sql);
        // set the employee ID parameter
        ps.setInt(1, empId);
        // execute query
        ResultSet rs = ps.executeQuery();
        // check if employee exists
        if(rs.next()){
            // if employee exists, delete it
            sql = "DELETE FROM employee WHERE emp_id = ?";
            // create prepared statement for deletion
            ps = con.prepareStatement(sql);
            // set the employee ID parameter
            ps.setInt(1, empId);
            // execute deletion
            int rowAffected = ps.executeUpdate();
            if(rowAffected == 1){
                System.out.println("Employee deleted!");
            }else{
                System.out.println("Failed to delete employee");
            }
        }else{
            System.out.println("Employee does not exist");
        }
        // close connection
        con.close();
        
    }catch(Exception ex){
        ex.printStackTrace();
    }
}

    
    public void registerEmployeeByPreparedStatment(Employee empObj){
        // surround with try and catch
        try{
            // create connection
            Connection con = DriverManager.getConnection(jdbcUrl, dbUsername,dbPasswd);
            //  Prepare Statement
            String sql = "INSERT INTO employee (emp_id,emp_names) values(?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, empObj.getEmployeeId());
            pst.setString(2, empObj.getEmployeeName());
            // excute the query
            int rowAffected = pst.executeUpdate();
            if(rowAffected > 0){
                System.out.println("Data Saved!");
            }else{
                System.out.println("Data Not Saved!");
            }
            // close connection
            con.close();
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    public void updateEmployee(int empId, String newEmployeeName) {
    // surround with try and catch
    try {
        // create connection
        Connection con = DriverManager.getConnection(jdbcUrl, dbUsername, dbPasswd);
        
        // Check if employee exists
        String checkSql = "SELECT emp_id FROM employee WHERE emp_id = ?";
        PreparedStatement checkPs = con.prepareStatement(checkSql);
        checkPs.setInt(1, empId);
        ResultSet rs = checkPs.executeQuery();
        
        if (rs.next()) { // Employee exists
            // Update employee name
            String updateSql = "UPDATE employee SET emp_names = ? WHERE emp_id = ?";
            PreparedStatement updatePs = con.prepareStatement(updateSql);
            updatePs.setString(1, newEmployeeName);
            updatePs.setInt(2, empId);
            int rowAffected = updatePs.executeUpdate();
            if (rowAffected == 1) {
                System.out.println("Employee updated!");
            } else {
                System.out.println("Failed to update employee");
            }
        } else {
            System.out.println("Employee does not exist");
        }
        
        // close connection
        con.close();

    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

    
}
