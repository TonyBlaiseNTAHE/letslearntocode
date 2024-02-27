package view;

import javax.swing.*;

public class View {
    
    public void displayMenu() {
        // Create a JFrame to hold the GUI components
        JFrame frame = new JFrame("Employee Management System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create JPanel to hold the menu components
        JPanel panel = new JPanel();
        
        // Create JLabels and add them to the panel
        JLabel titleLabel = new JLabel("Employee Management System");
        panel.add(titleLabel);
        
        JLabel instructionLabel = new JLabel("Select an option:");
        panel.add(instructionLabel);
        
        // Create JButton for each option and add them to the panel
        JButton registerButton = new JButton("Register Employee");
        panel.add(registerButton);
        
        JButton updateButton = new JButton("Update Employee");
        panel.add(updateButton);
        
        JButton deleteButton = new JButton("Delete Employee");
        panel.add(deleteButton);
        
        JButton findButton = new JButton("Find Employee");
        panel.add(findButton);
        
        JButton retrieveButton = new JButton("Retrieve All Employees");
        panel.add(retrieveButton);
        
        // Add the panel to the frame
        frame.getContentPane().add(panel);
        
        // Set frame size and make it visible
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
    
    // Additional methods for displaying messages, input forms, etc. can be added here
}

