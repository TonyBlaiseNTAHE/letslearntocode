package Introduction;

import java.sql.*;
import java.util.Scanner;

public class EmployeeMGTSystem {
    public static void main(String[] args) {
        // Declaration and initialization
        boolean condition = true;
        final String URL = "jdbc:mysql://localhost:3306/Employee";
        final String username = "root";
        final String password = "%password%";

        try (Connection con = DriverManager.getConnection(URL, username, password)) {
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
                System.out.print("Choose: ");
                Scanner sc = new Scanner(System.in);
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Enter Employee ID: ");
                        int empId = sc.nextInt();
                        System.out.println("Enter Employee name: ");
                        String empName = sc.next();
                        System.out.println("Enter the department: ");
                        String empDep = sc.next();
                        System.out.println("Enter the position: ");
                        String empPos = sc.next();
                        System.out.println("Enter Employee Salary: ");
                        int empSalary = sc.nextInt();
                        System.out.println("Enter the contact information of the employee: ");
                        String empContact = sc.next();
                        System.out.println("Enter the Address of the employee: ");
                        String empAddress = sc.next();
                        System.out.println("Enter the Supervisor of the employee: ");
                        String empSupervisor = sc.next();
                        System.out.println("Enter the working hours of the employee: ");
                        String empWorkingHours = sc.next();
                        // Prepare the SQL statement with placeholders
                        String query = "INSERT INTO Software_engr (id, name, Department, Position, Salary, Contact_Info, Address, Supervisor, Working_Hours) " +
                                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
                        // Create a PreparedStatement
                        try (PreparedStatement pstmt = con.prepareStatement(query)) {
                            // Set parameter values
                            pstmt.setInt(1, empId);
                            pstmt.setString(2, empName);
                            pstmt.setString(3, empDep);
                            pstmt.setString(4, empPos);
                            pstmt.setInt(5, empSalary);
                            pstmt.setString(6, empContact);
                            pstmt.setString(7, empAddress);
                            pstmt.setString(8, empSupervisor);
                            pstmt.setString(9, empWorkingHours);
                            // Execute the query
                            int rowsAffected = pstmt.executeUpdate();
                            if (rowsAffected > 0) {
                                System.out.println("Employee registered successfully.");
                            } else {
                                System.out.println("Failed to register employee.");
                            }
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                        break;
                    case 2:
                        System.out.println("Update an Employee");
                        break;
                    case 3:
                        System.out.println("Enter the id of the employee you want to delete: ");
                        int empIds = sc.nextInt();
                        String qry = "DELETE FROM Software_engr WHERE id = " + empIds;
                        Statement stm = con.createStatement();
                        int rowsAffected = stm.executeUpdate(qry);
                        System.out.println(rowsAffected + " row(s) deleted.");
                        break;
                    case 4:
                        System.out.println("Enter Employee ID: ");
                        int empIdss = sc.nextInt();
                        System.out.println("+----+---------+--------------+------------+----------+---------------------------+-----------+------------+---------------+");
                        System.out.println("| id | name    | Department   | Position   | Salary   | Contact_Info              | Address   | Supervisor | Working_Hours |");
                        System.out.println("+----+---------+--------------+------------+----------+---------------------------+-----------+------------+---------------+");
                        String q1 = "SELECT * FROM Software_engr WHERE id=" +empIdss;
                        Statement st1 = con.createStatement();
                        ResultSet rs1 = st1.executeQuery(q1);
                        while (rs1.next()) {
                            int id = rs1.getInt("id");
                            String name = rs1.getString("name");
                            String Department = rs1.getString("Department");
                            String Position = rs1.getString("Position");
                            int Salary = rs1.getInt("Salary");
                            String Contact_Info = rs1.getString("Contact_Info");
                            String Address  =rs1.getString("Address");
                            String Supervisor = rs1.getString("Supervisor");
                            String Working_Hours = rs1.getString("Working_Hours");
                            // Print the data
                            System.out.printf("| %-3d| %-8s| %-13s| %-11s| %-9d| %-26s| %-10s| %-11s| %-14s|%n", id, name, Department, Position, Salary, Contact_Info, Address, Supervisor, Working_Hours);
                        }
                        System.out.println("+----+---------+--------------+------------+----------+---------------------------+-----------+------------+---------------+");
                        break;
                    case 5:
                        System.out.println("+----+---------+--------------+------------+----------+---------------------------+-----------+------------+---------------+");
                        System.out.println("| id | name    | Department   | Position   | Salary   | Contact_Info              | Address   | Supervisor | Working_Hours |");
                        System.out.println("+----+---------+--------------+------------+----------+---------------------------+-----------+------------+---------------+");
                        String q = "SELECT * FROM Software_engr";
                        Statement st = con.createStatement();
                        ResultSet rs = st.executeQuery(q);
                        while (rs.next()) {
                            int id = rs.getInt("id");
                            String name = rs.getString("name");
                            String Department = rs.getString("Department");
                            String Position = rs.getString("Position");
                            int Salary = rs.getInt("Salary");
                            String Contact_Info = rs.getString("Contact_Info");
                            String Address  =rs.getString("Address");
                            String Supervisor = rs.getString("Supervisor");
                            String Working_Hours = rs.getString("Working_Hours");
                            // Print the data
                            System.out.printf("| %-3d| %-8s| %-13s| %-11s| %-9d| %-26s| %-10s| %-11s| %-14s|%n", id, name, Department, Position, Salary, Contact_Info, Address, Supervisor, Working_Hours);
                        }
                        System.out.println("+----+---------+--------------+------------+----------+---------------------------+-----------+------------+---------------+");
                        break;
                    case 0:
                        System.out.println("Thank you for using the system");
                        condition = false;
                        break;
                    default:
                        System.out.println("Invalid choice.");
                        break;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

