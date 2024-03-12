package view;

import javax.swing.*;

public class View {
    
    public void displayMenu() {

    JFrame frame = new JFrame("Employee Management System");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel panel = new JPanel();

    JLabel titJLabel = new JLabel("Employee Management System");
    panel.add(titJLabel);

    /*JLabel instructionLabel = new JLabel("Select an option:");
    panel.add(instructionLabel);*/

    JButton registerButton = new JButton("Register a Employee");
    panel.add(registerButton);

    JButton findEmployee = new JButton("Find an Employee");
    panel.add(findEmployee);

    JButton updateEmployee = new JButton("Update an Employee");
    panel.add(updateEmployee);

    JButton deleteEmployee = new JButton("Delete an Employee");
    panel.add(deleteEmployee);

    JButton retrieveButton = new JButton("Retrieve all Employee");
    panel.add(retrieveButton);

    frame.getContentPane().add(panel);

    frame.setSize(400, 300);
    frame.setVisible(true);
}
}
