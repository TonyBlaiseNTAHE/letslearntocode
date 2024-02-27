package controller;
import view.View;
import models.Employee;;

public class MVC {
    public static void main(String[] args) {
        // Instantiate the view
        View view = new View();
        
        // Instantiate the model
        Employee model = new Employee(); // Assuming you have a model class named EmployeeModel
        
        // Instantiate the controller and pass the view and model to it
        Controller controller = new Controller(view, model);
        
        // Display the initial user interface
        view.displayMenu(); // Assuming you have a method named displayMenu() in your View class
    }
}

