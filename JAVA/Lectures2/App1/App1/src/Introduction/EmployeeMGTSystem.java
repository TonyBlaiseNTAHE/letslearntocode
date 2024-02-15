package Introduction;

import java.sql.*;
import java.util.Scanner;

public class EmployeeMGTSystem {
    public static void main(String[] args) {
        // declaration and initialization
        boolean condition = true;
        final String URL = "jdbc:mysql://localhost:3306/Employee";
        final String username = "root";
        final String password = "%password%";

        while (condition) {
            System.out.println("*******************");
            System.out.println("EMPLOYEE MGT SYSTEM");
            System.out.println("*******************");
            System.out.println("1. Register an Employee");
            System.out.println("2. Update an Employee");
            System.out.println("3. Delete an Employee");
            System.out.println("4. Find Employee By Id");
            System.out.println("5. Retrieve All Employee");
            System.out.println("0. Exit");
            System.out.print("choose: ");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Employee ID: ");
                    int empId = sc.nextInt();
                    System.out.println("Enter Employee names: ");
                    String empName = sc.next();
                    // steps jdbc;  
                    // create a connection
                    try {
                        Connection con = DriverManager.getConnection(URL, username, password);
                        Statement st = con.createStatement();
                        String query = "INSERT INTO Software_engr (id, name) VALUES (" + empId + ", '" + empName + "')";

                        boolean res = st.execute(query);
                        if (res) {
                            System.out.println("saved");
                        } else {
                            System.out.println("Not saved");
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }

                    break;
                case 2:
                    System.out.println("Update an Employee");
                    break;
                case 3:
                    System.out.println("Delete an Employee");
                    break;
                case 0:
                    System.out.println("Thank you for using the system");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong Choice!!! Do you wish to continue");
                    System.out.println("Type yes to Continue or No to quit");
                    String answer = sc.next();
                    if (answer.equalsIgnoreCase("yes")) {
                        condition = true;
                    } else {
                        System.out.println("Thank you for using the System");
                        condition = false;
                    }
                    break;
            }
        }
    }
}
