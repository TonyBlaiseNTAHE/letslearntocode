package controller;

import models.Employee;
import view.View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Controller {
    
    private View view;
    private Employee model; // Assuming you have a model class named EmployeeModel
    
    public Controller(View view, Employee model) {
        this.view = view;
        this.model = model;
        
        // Attach event listeners to view components
        this.view.addRegisterEmployeeListener(new RegisterEmployeeListener());
        this.view.addUpdateEmployeeListener(new UpdateEmployeeListener());
        // Add listeners for other actions as needed
    }
    
    // Inner classes for event listeners
    private class RegisterEmployeeListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Get input from view
            int empId = view.getId();
            String empName = view.getEmployeeName();
            String empDept = view.getEmployeeDepartment();
            // Get other employee information from view
            
            // Create an Employee object with the input
            Employee employee = new Employee(empId, empName, empDept /*, other fields */);
            
            // Pass the employee object to the model to register
            model.registerEmployee(employee);
            
            // Update the view if needed
            view.displayMessage("Employee registered successfully.");
        }
    }
    
    private class UpdateEmployeeListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Logic for updating an employee
        }
    }
    
    // Add more inner classes for other actions as needed
    
}

